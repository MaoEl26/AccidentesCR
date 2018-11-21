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
public abstract class Observer {
    
    protected DTOConsulta3 c3;
    public abstract void update(DTOConsulta3 dtoConsulta3);
    
}
