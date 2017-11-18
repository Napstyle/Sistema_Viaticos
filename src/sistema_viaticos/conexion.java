/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_viaticos;

/**
 *
 * @author AMON-RA
 */
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;


public class conexion {
    protected Connection getConnection(){
    Connection cn=null;
    try{
    Class.forName("com.mysql.jdbc.Driver").newInstance(); 
    cn=DriverManager.getConnection(url,usuario,password);
    }catch(Exception e){
        System.out.println(e);
    }
    return cn;
    }
            
      
            
    public String usuario = "root";
    public String password = "aapn941015";
    public String url = "jdbc:mysql://localhost:3306/Viaticos_Vehicular";
    
    public Connection cn=null;
    public Statement st=null;
    public Statement Conectar()
    {
        try {
            Connection cn=DriverManager.getConnection(url,usuario,password);
            st=cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
    } catch(SQLException i)
    {
        JOptionPane.showMessageDialog(null,i);
    }
        return st;
    }
}
