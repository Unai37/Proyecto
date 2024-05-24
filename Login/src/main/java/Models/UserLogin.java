/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import com.mycompany.login.PaginaPrincipal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Chikiritaviri
 */
public class UserLogin {
    
    public void validarUsuario(JTextField user, JPasswordField pass){
        
        try{
            ResultSet rs = null;
            PreparedStatement ps = null;
            
            Conexion conexion = new Conexion();
            
            String contra = String.valueOf(pass.getPassword());
            
            String consulta = "SELECT * FROM users WHERE username = '" +  user.getText() + "'  AND password = crypt('" + contra + "', password);";
            ps= conexion.estableceConexion().prepareStatement(consulta);
            
            rs = ps.executeQuery();
            
            if(rs.next()){
                
                JOptionPane.showMessageDialog(null, "Se conectó correctamente");
                PaginaPrincipal paginaPrincipal  = new PaginaPrincipal();
                paginaPrincipal.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos");
                
            }
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
