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
public class ObserverMujer extends Observer{
    
    public ObserverMujer(Consulta3 consulta3){
        this.c3 = consulta3;
    }

    @Override
    public void update(DTOConsulta3 dtoConsulta3) {
        /*Consulta SQL para el hombre*/
    }
    
}