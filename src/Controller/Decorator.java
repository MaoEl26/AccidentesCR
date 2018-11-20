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
public abstract class Decorator implements Consulta1{
    
    protected Consulta1 consulta1;
    
    public Decorator(Consulta1 c1){
        this.consulta1 = c1;
    }

    @Override
    public void crearConsulta(DTOConsulta1 dtoConsulta1) {
        consulta1.crearConsulta(dtoConsulta1);
    }
    
    
}
