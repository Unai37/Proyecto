/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Chikiritaviri
 */
public class Conexion {
    
    Connection conectar;
    
    String PGUSER = "postgres";
    String PGPASS = "Pipas1234!";
    String BBDD = "postgres";
    String PGIP= "localhost";
    String PGPUERTO = "5432";
    
    String cadena = "jdbc:postgresql://" + PGIP + ":" + PGPUERTO + "/" + BBDD;
    
    
   public Connection estableceConexion(){
       
       try {
            Class.forName("org.postgresql.Driver");
            conectar = DriverManager.getConnection(cadena, PGUSER, PGPASS);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return conectar;
   }       
}
