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
    
    private int coordenadaX;
    private int coordenadaY;
    private int count;

    public RespuestaConsulta1(int coordenadaX, int coordenadaY, int count) {
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.count = count;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    
    
}
