/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistema_viaticos;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Napstyle
 */
public class Combo extends conexion{
    public DefaultComboBoxModel getvalues(){
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
    try{
    Connection cn=this.getConnection();
    String sql="select p.Nombre from Personal p\n" +
"inner join Usuarios u on (u.Usuario = p.Usuario)\n" +
"where u.Tipo = 'Comisionado'";
    Statement st=cn.createStatement();
    ResultSet rs=st.executeQuery(sql);
    while(rs.next()){
    modelo.addElement(rs.getString(1));
    }
    cn.close();
    rs.close();
    }catch(Exception e){System.out.println(e);}
    return modelo;
    
    }
    
    
}
