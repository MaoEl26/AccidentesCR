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
public class Consulta1Sexo extends Decorator{
    
    public Consulta1Sexo(Consulta1 c1){
        super(c1);
    }
    
    @Override
    public void crearConsulta(DTOConsulta1 dtoConsulta1){
        super.crearConsulta(dtoConsulta1);
        consultaSexo(dtoConsulta1);
    }
    
    private void consultaSexo(DTOConsulta1 dtoConsulta1){
        
        String sexo="";
        ArrayList<ArrayList<String>> listaIndicadores = dtoConsulta1.getListaIndicadores();
        ArrayList<ArrayList<String>> listaConsultasSQL = new ArrayList<>();
        
        
        for (int i=0; i<listaIndicadores.size(); i++){
            if("Sexo".equals(listaIndicadores.get(i).get(0))){
                sexo=listaIndicadores.get(i).get(1);
                break;
            }
        }
        
        for(int i=0;i<dtoConsulta1.getListaConsultasSQL().size();i++){
            ArrayList<String> listaTemp = new ArrayList<>();
            String consultaSQL = dtoConsulta1.getListaConsultasSQL().get(i).get(0) + ""
                    + "inner join sexo " 
                    + "on sexo.idSexo = afec.idSexo ";
            String whereSQL = dtoConsulta1.getListaConsultasSQL().get(i).get(1) + ""
                    + "and sexo.Sexo = '" + sexo+"' ";
            listaTemp.add(consultaSQL);
            listaTemp.add(whereSQL);
            listaConsultasSQL.add(listaTemp);
        }
        
        dtoConsulta1.setListaConsultasSQL(listaConsultasSQL);
        
    }
    
    
    
    
}
