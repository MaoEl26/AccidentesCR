/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author andre
 */

import java.util.ArrayList;

public class Consulta1EdadQuinquenal extends Decorator{
 
    public Consulta1EdadQuinquenal(Consulta1 c1){
        super(c1);
    }
    
    @Override
    public void crearConsulta(DTOConsulta1 dtoConsulta1){
        super.crearConsulta(dtoConsulta1);
        consultaEdadQuinquenal(dtoConsulta1);
    }
    
    private void consultaEdadQuinquenal(DTOConsulta1 dtoConsulta1){
        
        String edadQuinquenal="";
        ArrayList<ArrayList<String>> listaIndicadores = dtoConsulta1.getListaIndicadores();
        ArrayList<ArrayList<String>> listaConsultasSQL = new ArrayList<>();
        
        
        for (int i=0; i<listaIndicadores.size(); i++){
            if("EdadQuinquenal".equals(listaIndicadores.get(i).get(0))){
                edadQuinquenal=listaIndicadores.get(i).get(1);
                break;
            }
        }
        
        for(int i=0;i<dtoConsulta1.getListaConsultasSQL().size();i++){
            ArrayList<String> listaTemp = new ArrayList<>();
            String consultaSQL = dtoConsulta1.getListaConsultasSQL().get(i).get(0) + ""
                    + "inner join edadQuinquenal " 
                    + "on edadQuinquenal.idEdadQuinquenal = afec.idEdadQuinquenal ";
            String whereSQL = dtoConsulta1.getListaConsultasSQL().get(i).get(1) + ""
                    + "and edadQuinquenal.Descripcion = " + edadQuinquenal+" ";
            listaTemp.add(consultaSQL);
            listaTemp.add(whereSQL);
            listaConsultasSQL.add(listaTemp);
        }
        
        dtoConsulta1.setListaConsultasSQL(listaConsultasSQL);
        
    }
    
}
