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
public class Consulta3 {
    
    private String sexo;
    private Observer observer;
    
    public Consulta3(String sexo, Observer observer){
        this.sexo = sexo;
        this.observer = observer;
    }
    
    public String getSexo(){
        return sexo;
    }
    
    public void setSexo(DTOConsulta3 dtoConsulta3){
        sexo = dtoConsulta3.getSexo();
        notificar(dtoConsulta3);
    }
    
    public void notificar(DTOConsulta3 dtoConsulta3){
        observer.update(dtoConsulta3);
    }
    
    
    
    
}
