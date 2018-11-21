/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Conexion.BDConexion;
import Model.RespuestaConsulta1;
import Model.RespuestaConsulta2;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author andre
 */
public class DAOBD {
    
    private final ArrayList<String> listaProvincias = new ArrayList<>();
    private final HashMap<String,String> listaCantones = new HashMap<>();
    private HashMap<String,String> listaDistritos = new HashMap<>();
    
    public void consulta1BD(DTOConsulta1 dtoConsulta1){
        ArrayList<ArrayList<String>> listaConsultasSQL = dtoConsulta1.getListaConsultasSQL();
        ArrayList<RespuestaConsulta1> listaRespuestas = new ArrayList<>();
        
        
        for(int i=0; i<listaConsultasSQL.size();i++){
            String select = listaConsultasSQL.get(i).get(0);
            String where = listaConsultasSQL.get(i).get(1);
            String consultaFinal = select +" "+where;
            
            //System.out.println(consultaFinal);
            
            
            /*Aqui se llama a la base de datos con la consulta que esta en consulta Final. 
            Se puede imprimir para ver si esta bien*/
            
            String coordenadaX="";  //Valor obtenido de la consulta
            String coordenadaY="";  //Valor obtenido de la consulta
            int count =0;           //Valor obtenido de la consulta
            
            RespuestaConsulta1 res = new RespuestaConsulta1(coordenadaX, coordenadaY, count);
            listaRespuestas.add(res);
        }
        dtoConsulta1.setListaRespuestas(listaRespuestas);
        
    }
    
    public void consulta2BD(DTOConsulta2 dtoConsulta2){
        String consultaFinal = dtoConsulta2.getConsultaSQL();
        
        //System.out.println(consultaFinal);
                
        /*Aqui se llama a la base de datos con la consulta que esta en consulta Final. 
        Se puede imprimir para ver si esta bien*/
        
        String indicador ="";       //Valor de la base
        int count =0;               //Valor de la base
        
        RespuestaConsulta2 res2 = new RespuestaConsulta2(indicador, count);
        
        dtoConsulta2.setRespuesta(res2);
        
        
    }
    
    public void consulta3BD(DTOConsulta3 dtoConsulta3){
    }

    /**
     * @return the listaProvincias
     */
    public ArrayList<String> getListaProvincias() {
        return listaProvincias;
    }

    /**
     * 
     */
    public void setListaProvincias() {
       String sql = "Select Provincia from provincia";
       Connection conexionBD;
       PreparedStatement statement;
       ResultSet rs;
        try {
            conexionBD = BDConexion.obtenerConexion();
            statement = conexionBD.prepareStatement(sql);
            rs = statement.executeQuery();
            while(rs.next()){
                listaProvincias.add(rs.getString("Provincia"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the listaCantones
     */
    public HashMap<String,String> getListaCantones() {
        return listaCantones;
    }


    public void setListaCantones() {
       String sql = "Select p.Provincia, c.Canton from canton c inner join provincia p on p.idProvincia = c.idProvincia";
       Connection conexionBD;
       PreparedStatement statement;
       ResultSet rs;
        try {
            conexionBD = BDConexion.obtenerConexion();
            statement = conexionBD.prepareStatement(sql);
            rs = statement.executeQuery();
            while(rs.next()){
                listaCantones.put(rs.getString(2),rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * @return the listaDistritos
     */
    public HashMap<String,String> getListaDistritos() {
        return listaDistritos;
    }

    public void setListaDistritos() {
       String sql = "Select c.Canton,d.Distrito from distrito d inner join canton c on c.idCanton = d.idCanton";
       Connection conexionBD;
       PreparedStatement statement;
       ResultSet rs;
        try {
            conexionBD = BDConexion.obtenerConexion();
            statement = conexionBD.prepareStatement(sql);
            rs = statement.executeQuery();
            while(rs.next()){
                listaDistritos.put(rs.getString(2),rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(listaDistritos);
    }
}
