/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import JFrame.Lista1;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Buscar {
     java.sql.ResultSet resultado;
    java.sql.Connection conex = null;
    java.sql.Statement consulta = null;
    Conexion con = new Conexion();
    
    String Nombre;
     String NombreE;
    public Buscar(){
    }
    public Buscar(String Nombre){
       this.Nombre = Nombre;
    }
  
    public ResultSet BuscarNombre(String Nombre){
           
         String Buscar;
             Buscar = "select * From clientes where Nombre_Cliente LIKE('%"+Nombre+"%')";
             ResultSet rs=null;
        
         try {
             Lista1 a = new Lista1();
             
             conex = con.conectar();
             consulta = conex.createStatement();
             rs = consulta.executeQuery(Buscar);
             
         } catch (SQLException ex) {
             Logger.getLogger(Buscar.class.getName()).log(Level.SEVERE, null, ex);
         }
         
          return rs;   
    }
    
    public void setBuscarNombre(String Nombre){
        
            this.Nombre = NombreE;
            
    }
    public String getBuscarNombre(){
       
         return NombreE;
        
    }
}