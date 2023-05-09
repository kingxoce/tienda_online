/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import conexion.csconexion;
/**
 *
 * @author jpmon
 */
public class nuevacategoria {
    private Connection con;
    private Statement stm;
    private ResultSet rs;
    
    public nuevacategoria()
    {
       this.con=null;
       this.stm=null;
    }
    
public int insertarcategoria(String nombre,int cate ,String direccionimg){
 int respuesta = 0;
        
        csconexion cl = new csconexion();
        con =cl.conectar();
        
        try
        {
        if(cate!=0){
        stm = con.createStatement();
        respuesta = stm.executeUpdate("INSERT INTO CATEGORIA VALUES(IDCATEGORI_SECUENCE.NEXTVAL,'"+nombre+"',"+cate+",'"+direccionimg+"')");
        
        }else{
        stm = con.createStatement();
        respuesta = stm.executeUpdate("INSERT INTO CATEGORIA VALUES(IDCATEGORI_SECUENCE.NEXTVAL,'"+nombre+"',IDCATEGORI_SECUENCE.CURRVAL,'"+direccionimg+"')");
        }    
        
        cl.desconectar();
        con.close();
        stm.close();
        }
        catch (Exception ex)
        {
            
        }
        return respuesta;
}    
    
    
}
