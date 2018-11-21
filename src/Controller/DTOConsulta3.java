/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.RespuestaConsulta3;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class DTOConsulta3 {
    
    private String sexo;
    private String consultaSQL;
    private ArrayList<RespuestaConsulta3> listaRespuestas;

    public DTOConsulta3(String sexo,String consultaSQL, ArrayList<RespuestaConsulta3> listaRespuestas) {
        this.sexo = sexo;
        this.listaRespuestas = listaRespuestas;
        this.consultaSQL = consultaSQL;
    }
    
    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    
        /**
     * @return the consultaSQL
     */
    public String getConsultaSQL() {
        return consultaSQL;
    }

    /**
     * @param consultaSQL the consultaSQL to set
     */
    public void setConsultaSQL(String consultaSQL) {
        this.consultaSQL = consultaSQL;
    }

    /**
     * @return the listaRespuestas
     */
    public ArrayList<RespuestaConsulta3> getListaRespuestas() {
        return listaRespuestas;
    }

    /**
     * @param listaRespuestas the listaRespuestas to set
     */
    public void setListaRespuestas(ArrayList<RespuestaConsulta3> listaRespuestas) {
        this.listaRespuestas = listaRespuestas;
    }
    
}
