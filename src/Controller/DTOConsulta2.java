/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.RespuestaConsulta2;
import java.util.ArrayList;

/**
 *
 * @author andre
 */
public class DTOConsulta2 {
    
    private String indicador;
    private String consultaSQL;
    private ArrayList<RespuestaConsulta2> respuesta;

    public DTOConsulta2(String indicador, String consultaSQL, ArrayList<RespuestaConsulta2> respuesta) {
        this.indicador = indicador;
        this.consultaSQL = consultaSQL;
        this.respuesta = respuesta;
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

    public RespuestaConsulta2 getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(RespuestaConsulta2 respuesta) {
        this.respuesta = respuesta;
    }
    
    
    
}
