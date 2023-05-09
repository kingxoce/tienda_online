/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jpmon
 */
public class csconexion {
    
public String user, password;
    public String url, driver;
    public Connection cn;
    
    public csconexion()
    {
     
        this.user="maestro";
        this.password="maestro";
        this.url="jdbc:oracle:thin:@localhost:1521:XE";
        this.driver="oracle.jdbc.OracleDriver";
        this.cn=null;
    }
    
    public Connection conectar()
    {
        try
        {
        Class.forName(this.driver);
        cn = DriverManager.getConnection(url, user, password);
        return cn;
        }
        catch (Exception ex)
        {
            return null;
        }
        
    }
    
    public void desconectar() throws SQLException
    {
        cn.close();
    }


    
}
