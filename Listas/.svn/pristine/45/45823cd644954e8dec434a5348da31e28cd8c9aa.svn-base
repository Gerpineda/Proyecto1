/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.sql.*;

public class Conexion {
      public Connection con;
   public Statement stmt;
   public String servername="localhost";
   public String puerto = "3306";
   public String nombreBD="clientes";
   public String usuario ="root";
   public String contra ="";
   public String Url="jdbc:mysql://localhost:3306/"+nombreBD;
   
   
   public String errString;

    public Conexion(){
        
                    }
    public String getconeccionUrl(){
       return Url;
       
   }
    public Connection conectar(){
       con=null;
       try{
           Class.forName("org.gjt.mm.mysql.Driver");
           con=DriverManager.getConnection(getconeccionUrl(), usuario, contra);
           stmt=con.createStatement();
           if(con!=null){
          
           } 
           }catch (ClassNotFoundException | SQLException e){
                  errString="Error mientras se conectaba a la Base de Datos";
                
                  return null;
           }
       return con;
       
   }
   public void Desconectar(){
        try{
              stmt.close();
              con.close();
        }catch(SQLException e){
                 errString="Error mientras se conectaba a la Base de Datos";
                  
                }
 
  }
   public Statement getSmtm(){
       return this.stmt;
   }
}

