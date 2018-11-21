/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Consulta1Rol extends Decorator{
    
    public Consulta1Rol(Consulta1 c1){
        super(c1);
    }
    
    @Override
    public void crearConsulta(DTOConsulta1 dtoConsulta1){
        super.crearConsulta(dtoConsulta1);
        consultaRol(dtoConsulta1);
    }
    
    private void consultaRol(DTOConsulta1 dtoConsulta1){
        
        String rol="";
        ArrayList<ArrayList<String>> listaIndicadores = dtoConsulta1.getListaIndicadores();
        ArrayList<ArrayList<String>> listaConsultasSQL = new ArrayList<>();
        
        
        for (int i=0; i<listaIndicadores.size(); i++){
            if("Rol".equals(listaIndicadores.get(i).get(0))){
                rol=listaIndicadores.get(i).get(1);
                break;
            }
        }
        
        for(int i=0;i<dtoConsulta1.getListaConsultasSQL().size();i++){
            ArrayList<String> listaTemp = new ArrayList<>();
            String consultaSQL = dtoConsulta1.getListaConsultasSQL().get(i).get(0) + ""
                    + "inner join rol " 
                    + "on rol.idRol = afec.idRol ";
            String whereSQL = dtoConsulta1.getListaConsultasSQL().get(i).get(1) + ""
                    + "and rol.Rol = '" + rol+"' ";
            listaTemp.add(consultaSQL);
            listaTemp.add(whereSQL);
            listaConsultasSQL.add(listaTemp);
        }
        
        dtoConsulta1.setListaConsultasSQL(listaConsultasSQL);
        
    }
    
}
