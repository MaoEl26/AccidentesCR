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
public class Consulta1Lesion extends Decorator {
    
    public Consulta1Lesion(Consulta1 c1){
        super(c1);
    }
    
    @Override
    public void crearConsulta(DTOConsulta1 dtoConsulta1){
        super.crearConsulta(dtoConsulta1);
        consultaLesion(dtoConsulta1);
    }
    
    private void consultaLesion(DTOConsulta1 dtoConsulta1){
        
        String lesion="";
        ArrayList<ArrayList<String>> listaIndicadores = dtoConsulta1.getListaIndicadores();
        ArrayList<ArrayList<String>> listaConsultasSQL = new ArrayList<>();
        
        
        for (int i=0; i<listaIndicadores.size(); i++){
            if("Lesion".equals(listaIndicadores.get(i).get(0))){
                lesion=listaIndicadores.get(i).get(1);
                break;
            }
        }
        
        for(int i=0;i<dtoConsulta1.getListaConsultasSQL().size();i++){
            ArrayList<String> listaTemp = new ArrayList<>();
            String consultaSQL = dtoConsulta1.getListaConsultasSQL().get(i).get(0) + ""
                    + "inner join lesion " 
                    + "on lesion.idLesion = afec.idLesion ";
            String whereSQL = dtoConsulta1.getListaConsultasSQL().get(i).get(1) + ""
                    + "and lesion.Lesion = " + lesion+" ";
            listaTemp.add(consultaSQL);
            listaTemp.add(whereSQL);
            listaConsultasSQL.add(listaTemp);
        }
        
        dtoConsulta1.setListaConsultasSQL(listaConsultasSQL);
        
    }    
    
}
