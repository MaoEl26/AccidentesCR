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
public class Consulta2EdadQuinquenal implements Consulta2{

    @Override
    public void crearConsulta(DTOConsulta2 dtoConsulta2) {
        String consulta="select count(idAfectado), descripcion " +
                        "from afectado " +
                        "inner join edadQuinquenal " +
                        "on afectado.idEdadQuinquenal = edadQuinquenal.idEdadQuinquenal " +
                        "group by descripcion";
       
       dtoConsulta2.setConsultaSQL(consulta);
    }
    
}
