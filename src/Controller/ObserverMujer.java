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
    
    public ObserverMujer(DTOConsulta3 dtoConsulta3){
        this.c3 = dtoConsulta3;
    }

    @Override
    public void update(DTOConsulta3 dtoConsulta3) {
        /*Consulta SQL para el hombre*/
        String consulta = "select count(idAfectado),rol\n" +
                           "from afectado afec\n" +
                            "inner join sexo \n" +
                            "on sexo.idSexo = afec.idSexo\n" +
                            "inner join rol\n" +
                            "on rol.idRol = afec.idRol \n" +
                            "where sexo = 'Mujer'\n" +
                            "group by rol ";
        dtoConsulta3.setConsultaSQL(consulta);
    }
    
}