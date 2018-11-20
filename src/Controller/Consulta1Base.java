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
public class Consulta1Base implements Consulta1{

    @Override
    public void crearConsulta(DTOConsulta1 dtoConsulta1) {
        
        int annoInicial = dtoConsulta1.getAnnoInicial();
        int annoFinal = dtoConsulta1.getAnnoFinal();
        ArrayList<String> listaDistritos = dtoConsulta1.getListaDistritos();
        ArrayList<String> listaCantones = dtoConsulta1.getListaCantones();
        ArrayList<String> listaProvincias = dtoConsulta1.getListaProvincias();
        ArrayList<String> listaConsultas = dtoConsulta1.getListaConsultasSQL();
        
        int largoDistritos = listaDistritos.size();
        int largoCantones = listaCantones.size();
        int largoProvincias = listaProvincias.size();
        
        String consultaSQL="";
        
        
        if(largoDistritos>=1){        
            consultaSQL=consultaSQL +"select count (inc.idIncidente), dist.logitud, dist.latitud "
                                +"from incidente inc "
                                + "inner join distrito dist "
                                + "on dist.idDistrito = inc.idDistrito "
                                + "inner join fecha fec "
                                + "on fec.idFecha = inc.idFecha "
                                + "where fec.anno between "+Integer.toString(annoInicial)+" and "+Integer.toString(annoFinal);
        
            for (int i=0; i<largoDistritos; i++){
                String consultaFinal="";
                consultaFinal=consultaSQL+" and dist.Distrito = "+listaDistritos.get(i);
                listaConsultas.add(consultaFinal);
            }
        }
        else if(largoCantones>=1){
            consultaSQL=consultaSQL + "select count(inc.idIncidente), dist.longitud, dist.latitud "
                                    + "from incidente inc "
                                    + "inner join distrito dist "
                                    + "on dist.idDistrito = inc.idDistrito "
                                    + "inner join canton cant "
                                    + "on cant.idCanton = dist.idCanton "
                                    + "inner join fecha fec "
                                    + "on fec.idFecha = inc.idFecha "
                                    + "where fec.anno between "+Integer.toString(annoInicial)+" and "+Integer.toString(annoFinal);
            
            for (int i=0; i<largoCantones; i++){
                String consultaFinal="";
                consultaFinal=consultaSQL+" and cant.Canton = "+listaCantones.get(i);
                listaConsultas.add(consultaFinal);
            }
        }
        else{
            consultaSQL=consultaSQL +"select count(inc.idIncidente), dist.longitud, dist.latitud "
                                    + "from incidente inc "
                                    + "inner join distrito dist "
                                    + "on dist.idDistrito = inc.idDistrito "
                                    + "inner join canton cant "
                                    + "on cant.idCanton = dist.idCanton "
                                    + "inner join pronvinca prov "
                                    + "on prov.idProvincia = cant.idProvincia "
                                    + "inner join fecha fec "
                                    + "on fec.idFecha = inc.idFecha "
                                    + "where fec.anno between "+Integer.toString(annoInicial)+" and "+Integer.toString(annoFinal);
            for (int i=0; i<largoProvincias; i++){
                String consultaFinal="";
                consultaFinal=consultaSQL+" and prov.Provincia = "+listaProvincias.get(i);
                listaConsultas.add(consultaFinal);
            }
        }   
    }
    
    
    
}
