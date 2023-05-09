/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import conexion.csconexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author jpmon
 */
public class seguntempo {
    private Connection con;
    private Statement stm;
    private ResultSet rs;
    
    public seguntempo()
    {
        this.con=null;
        this.stm=null;
    }
    
    
    
    public seguntempoc sg()
    {
        seguntempoc e = null;
        
        
        
        csconexion cl= new csconexion();
        con=cl.conectar();
        rs = null;
        
        try
        {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM TEMPORADA WHERE TRUNC(FECHAINICIO,'MM')=TRUNC(SYSDATE,'MM') AND TRUNC(FECHAFINAL,'MM')>=TRUNC(SYSDATE,'MM')");
            
            while(rs.next())
            {
                e = new seguntempoc(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                
            }
            cl.desconectar();
            con.close();
            stm.close();
        }
        catch (Exception ex)
        {
            
        }
        return e;
    }    
}
