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
public class DTOConsulta1 {
    
    private ArrayList<String> listaProvincias;
    private ArrayList<String> listaCantones;
    private ArrayList<String> listaDistritos;
    private int annoInicial;
    private int annoFinal;
    private ArrayList<String> listaIndicadores;
    private ArrayList<String> listaConsultasSQL;
    private ArrayList<String> listaRespuestas;

    public DTOConsulta1(ArrayList<String> listaProvincias, ArrayList<String> listaCantones, ArrayList<String> listaDistritos, int annoInicial, int annoFinal, ArrayList<String> listaIndicadores, ArrayList<String> listaConsultasSQL, ArrayList<String> listaRespuestas) {
        this.listaProvincias = listaProvincias;
        this.listaCantones = listaCantones;
        this.listaDistritos = listaDistritos;
        this.annoInicial = annoInicial;
        this.annoFinal = annoFinal;
        this.listaIndicadores = listaIndicadores;
        this.listaConsultasSQL = listaConsultasSQL;
        this.listaRespuestas = listaRespuestas;
    }
    
    

    public ArrayList<String> getListaProvincias() {
        return listaProvincias;
    }

    public void setListaProvincias(ArrayList<String> listaProvincias) {
        this.listaProvincias = listaProvincias;
    }

    public ArrayList<String> getListaCantones() {
        return listaCantones;
    }

    public void setListaCantones(ArrayList<String> listaCantones) {
        this.listaCantones = listaCantones;
    }

    public ArrayList<String> getListaDistritos() {
        return listaDistritos;
    }

    public void setListaDistritos(ArrayList<String> listaDistritos) {
        this.listaDistritos = listaDistritos;
    }

    public int getAnnoInicial() {
        return annoInicial;
    }

    public void setAnnoInicial(int annoInicial) {
        this.annoInicial = annoInicial;
    }

    public int getAnnoFinal() {
        return annoFinal;
    }

    public void setAnnoFinal(int annoFinal) {
        this.annoFinal = annoFinal;
    }

    public ArrayList<String> getListaIndicadores() {
        return listaIndicadores;
    }

    public void setListaIndicadores(ArrayList<String> listaIndicadores) {
        this.listaIndicadores = listaIndicadores;
    }

    public ArrayList<String> getListaConsultasSQL() {
        return listaConsultasSQL;
    }

    public void setListaConsultasSQL(ArrayList<String> listaConsultasSQL) {
        this.listaConsultasSQL = listaConsultasSQL;
    }

    public ArrayList<String> getListaRespuestas() {
        return listaRespuestas;
    }

    public void setListaRespuestas(ArrayList<String> listaRespuestas) {
        this.listaRespuestas = listaRespuestas;
    }
    
    
    
}
