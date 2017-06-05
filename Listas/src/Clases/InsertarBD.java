/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author USUARIO
 */
public class InsertarBD {
     java.sql.ResultSet resultado;
    java.sql.Connection conex = null;
    java.sql.Statement consulta = null;
    Conexion con = new Conexion();
    
    public InsertarBD(){
        
    }
    
    public String InsertarCliente(String Nombre){
         try {
             conex = con.conectar();
             consulta = conex.createStatement();
              String Insertar;
              Insertar = "Insert into clientes (Nombre_Cliente)values('"+Nombre+"')";
              consulta.executeUpdate(Insertar);
              JOptionPane.showMessageDialog(null,"Registro Ingresado");
         } catch (SQLException ex) {
             Logger.getLogger(InsertarBD.class.getName()).log(Level.SEVERE, null, ex);
         }
         return Nombre;
    }
}
    
    

