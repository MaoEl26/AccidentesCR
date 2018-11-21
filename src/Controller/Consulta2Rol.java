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
public class Consulta2Rol implements Consulta2{

    @Override
    public void crearConsulta(DTOConsulta2 dtoConsulta2) {
        String consulta="select count(idAfectado), rol " +
                        "from afectado " +
                        "inner join rol " +
                        "on afectado.idRol = rol.idRol " +
                        "group by rol";
       
       dtoConsulta2.setConsultaSQL(consulta);
    }
    
}
