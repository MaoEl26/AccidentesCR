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
    Connection conexionBD;
    PreparedStatement statement;
    ResultSet rs;
    
    public void consulta1BD(DTOConsulta1 dtoConsulta1){
        ArrayList<ArrayList<String>> listaConsultasSQL = dtoConsulta1.getListaConsultasSQL();
        ArrayList<RespuestaConsulta1> listaRespuestas = new ArrayList<>();
        
        
        for(int i=0; i<listaConsultasSQL.size();i++){
            String select = listaConsultasSQL.get(i).get(0);
            String where = listaConsultasSQL.get(i).get(1);
            String consultaFinal = select +" "+where;
            
            System.out.println(consultaFinal);
            
            /*Aqui se llama a la base de datos con la consulta que esta en consulta Final. 
            Se puede imprimir para ver si esta bien*/
            try {
                conexionBD = BDConexion.obtenerConexion();
                statement = conexionBD.prepareStatement(consultaFinal);             
                rs = statement.executeQuery();
                while(rs.next()){
                    
                    String coordenadaX=rs.getString(3);  //Valor obtenido de la consulta
                    String coordenadaY=rs.getString(2);  //Valor obtenido de la consulta
                    int count =rs.getInt(1); //Valor obtenido de la consulta
            
                    RespuestaConsulta1 res = new RespuestaConsulta1(coordenadaX, coordenadaY, count);
                    listaRespuestas.add(res);
                }
            } catch (SQLException ex) {
                Logger.getLogger(DAOBD.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DAOBD.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        dtoConsulta1.setListaRespuestas(listaRespuestas);
        
    }
    
    public void consulta2BD(DTOConsulta2 dtoConsulta2){
        String consultaFinal = dtoConsulta2.getConsultaSQL();
        ArrayList<RespuestaConsulta2> listaRespuestas = new ArrayList<>(); 
        
        //System.out.println(consultaFinal);
                
        /*Aqui se llama a la base de datos con la consulta que esta en consulta Final. 
        Se puede imprimir para ver si esta bien*/
         try {
            conexionBD = BDConexion.obtenerConexion();
            statement = conexionBD.prepareStatement(consultaFinal);
            rs = statement.executeQuery();
            while(rs.next()){
                String indicador =rs.getString(2);       //Valor de la base
                int count =rs.getInt(1);               //Valor de la base
                System.exit(0);
                RespuestaConsulta2 res2 = new RespuestaConsulta2(indicador, count);
                listaRespuestas.add(res2);
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAOBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DAOBD.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        dtoConsulta2.setListaRespuestas(listaRespuestas);
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


}
