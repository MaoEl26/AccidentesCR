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
public class DTOConsulta2 {
    
    private String indicador;
    private String consultaSQL;
    private ArrayList<String> listaRespuestas;

    public DTOConsulta2(String indicador, String consultaSQL, ArrayList<String> listaRespuestas) {
        this.indicador = indicador;
        this.consultaSQL = consultaSQL;
        this.listaRespuestas = listaRespuestas;
    }

    
    
    public String getIndicador() {
        return indicador;
    }

    public void setIndicador(String indicador) {
        this.indicador = indicador;
    }

    public String getConsultaSQL() {
        return consultaSQL;
    }

    public void setConsultaSQL(String consultaSQL) {
        this.consultaSQL = consultaSQL;
    }

    public ArrayList<String> getListaRespuestas() {
        return listaRespuestas;
    }

    public void setListaRespuestas(ArrayList<String> listaRespuestas) {
        this.listaRespuestas = listaRespuestas;
    }
    
    
    
}
