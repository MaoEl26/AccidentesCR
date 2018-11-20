/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author andre
 */
public class RespuestaConsulta1 implements Respuesta {
    
    private String coordenadaX;
    private String coordenadaY;
    private int count;

    public RespuestaConsulta1(String coordenadaX, String coordenadaY, int count) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.count = count;
    }

    public String getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(String coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public String getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(String coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
    
}
