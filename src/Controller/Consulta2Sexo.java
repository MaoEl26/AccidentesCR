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
public class Consulta2Sexo implements Consulta2{

    @Override
    public void crearConsulta(DTOConsulta2 dtoConsulta2) {
       String consulta="select count(idAfectado), sexo " +
                        "from afectado " +
                        "inner join sexo " +
                        "on afectado.idSexo = sexo.idSexo " +
                        "group by sexo";
       
       dtoConsulta2.setConsultaSQL(consulta);
       
    }
    
}
