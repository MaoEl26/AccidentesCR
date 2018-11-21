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
public class Consulta2Lesion implements Consulta2{
    
    public void crearConsulta(DTOConsulta2 dtoConsulta2) {
       String consulta="select count(idAfectado), tipo " +
                        "from afectado " +
                        "inner join lesion " +
                        "on afectado.idLesion = lesion.idLesion " +
                        "group by tipo";
       
       dtoConsulta2.setConsultaSQL(consulta);
    }
    
}
