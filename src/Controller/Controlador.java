/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import accidentescr.Mapa;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class Controlador {
    
    public void formularConsulta1(DTOConsulta1 dtoConsulta1){
        Consulta1Base c1Base= new Consulta1Base();
        c1Base.crearConsulta(dtoConsulta1);
        ArrayList<ArrayList<String>> listaIndicadores = dtoConsulta1.getListaIndicadores();
        
        
        for (int i=0; i<listaIndicadores.size(); i++){
            if("EdadQuinquenal".equals(listaIndicadores.get(i).get(0))){
                Consulta1EdadQuinquenal c1EQ = new Consulta1EdadQuinquenal(c1Base);
                c1EQ.crearConsulta(dtoConsulta1);
            }    
            if("Lesion".equals(listaIndicadores.get(i).get(0))){
                Consulta1Lesion c1Lesion = new Consulta1Lesion(c1Base);
                c1Lesion.crearConsulta(dtoConsulta1);
            }
            if("Rol".equals(listaIndicadores.get(i).get(0))){
                Consulta1Rol c1Rol = new Consulta1Rol(c1Base);
                c1Rol.crearConsulta(dtoConsulta1);
            }
            if("Sexo".equals(listaIndicadores.get(i).get(0))){
                Consulta1Sexo c1Sexo = new Consulta1Sexo(c1Base);
                c1Sexo.crearConsulta(dtoConsulta1);
            }
        }
    }
    
    public void procesarConsulta1(DTOConsulta1 dtoConsulta1){
        formularConsulta1(dtoConsulta1);
        DAOBD daoBD = new DAOBD();
        daoBD.consulta1BD(dtoConsulta1);
        
        Mapa mapa;
        mapa = new Mapa("Mapa Gráfico : Consulta 1",dtoConsulta1);
        mapa.setVisible(true);
    }
    
    public void formularConsulta2(DTOConsulta2 dtoConsulta2){
        String indicador=dtoConsulta2.getIndicador();
        switch (indicador){
            
            case "Sexo":
                Consulta2Sexo c2S = new Consulta2Sexo();
                c2S.crearConsulta(dtoConsulta2);
                break;
            case "Rol":
                Consulta2Rol c2R = new Consulta2Rol();
                c2R.crearConsulta(dtoConsulta2);
                break;
            case "EdadQuinquenal":
                Consulta2EdadQuinquenal c2EQ = new Consulta2EdadQuinquenal();
                c2EQ.crearConsulta(dtoConsulta2);
                break;
            case "Lesion":
                Consulta2Lesion c2L = new Consulta2Lesion();
                c2L.crearConsulta(dtoConsulta2);
                break;
        }
        
    }
    
    public void procesarConsulta2(DTOConsulta2 dtoConsulta2){
        formularConsulta2(dtoConsulta2);
        DAOBD daoBD = new DAOBD();
        daoBD.consulta2BD(dtoConsulta2);
    }
    
    public void formularConsulta3(DTOConsulta3 dtoConsulta3){
        String indicador=dtoConsulta3.getSexo();
        Observer observer;
        Consulta3 consulta;
        switch (indicador){
            
            case "Hombre":
                observer= new ObserverHombre(dtoConsulta3);
                consulta = new Consulta3(indicador,observer);
                consulta.setSexo(dtoConsulta3);
                break;
            case "Mujer":
                observer = new ObserverMujer(dtoConsulta3);
                consulta = new Consulta3(indicador,observer);
                consulta.setSexo(dtoConsulta3);
                break;
        }
    }
    
    public void procesarConsulta3(DTOConsulta3 dtoConsulta3){
        formularConsulta3(dtoConsulta3);
        DAOBD daoBD = new DAOBD();
        daoBD.consulta3BD(dtoConsulta3);
    }
    
}
