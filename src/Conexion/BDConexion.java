/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Conexion;

import java.sql.*;
/**
 *
 * @author mcv26
 */
public class BDConexion {
    private static Connection conexionBD = null;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String database = "jdbc:mysql://localhost/accidentescr";
    private static final String usuario = "root";
    private static final String pass = "root";
    
    public static Connection obtenerConexion() throws SQLException, ClassNotFoundException{
        if(conexionBD == null){
            try{
                Class.forName(driver);
                conexionBD = DriverManager.getConnection(database,usuario, pass);              
            }catch(SQLException ex){
                throw new SQLException(ex);
            }catch(ClassNotFoundException ex){
                throw new ClassNotFoundException(ex.getMessage());
            }
        }
        return conexionBD;
    }
    public void cerrarConexion()throws SQLException{
        if(conexionBD!=null){
            conexionBD.close();
        }
    }
}
