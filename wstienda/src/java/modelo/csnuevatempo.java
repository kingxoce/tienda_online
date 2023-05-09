/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import conexion.csconexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author jpmon
 */
public class csnuevatempo {
private Connection con;
    private Statement stm;
    private ResultSet rs;
    
    public csnuevatempo()
    {
       this.con=null;
       this.stm=null;
    }
    
public int insertartempo(String nombre,String fechai ,String fechaf,String direccionimg){
 int respuesta = 0;
        
        csconexion cl = new csconexion();
        con =cl.conectar();
        
        try
        {
        stm = con.createStatement();
        respuesta = stm.executeUpdate("INSERT INTO TEMPORADA VALUES(IDTEMPO_SECUNCE.NEXTVAL,'"+nombre+"',TO_DATE('"+fechai+"','YYYY-MM-DD'),TO_DATE('"+fechaf+"','YYYY-MM-DD'),'"+direccionimg+"')");
        
        
        cl.desconectar();
        con.close();
        stm.close();
        }
        catch (Exception ex)
        {
            
        }
        return respuesta;
}    

public ArrayList<seguntempoc> listartempos()
    {
       seguntempoc e = null;
        ArrayList<seguntempoc> lista = new ArrayList<seguntempoc>();
        //lista = null;
        
        csconexion cl= new csconexion();
        con=cl.conectar();
        rs = null;
        
        try
        {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from TEMPORADA");
            
            while(rs.next())
            {
                e = new seguntempoc(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                lista.add(e);
            }
            cl.desconectar();
            con.close();
            stm.close();
        }
        catch (Exception ex)
        {
            
        }
        return lista;
    }



    public seguntempoc listartempoid(int idtempo)
    {
        seguntempoc e = null;
        
        csconexion cl = new csconexion();
        con = cl.conectar();
        rs = null;
        
        try
        {
            stm = con.createStatement ();
            rs = stm.executeQuery("SELECT * FROM TEMPORADA WHERE IDTEMPORADA="+idtempo);
            
            while (rs.next())
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
    
    
    
public ArrayList<producto> producsegunt(int idt)
    {
       producto e = null;
        ArrayList<producto> lista = new ArrayList<producto>();
        //lista = null;
        
        csconexion cl= new csconexion();
        con=cl.conectar();
        rs = null;
        
        try
        {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM PRODUCT_TEMPO\n" +
"LEFT JOIN PRODUCT ON PRODUCT_TEMPO.PRODUCT_IDPRODUCTO=PRODUCT.IDPRODUCTO AND PRODUCT_TEMPO.TEMPORADA_IDTEMPORADA="+idt);
            
            while(rs.next())
            {
                e = new producto(rs.getInt(4),rs.getString(5),rs.getString(6),rs.getInt(7),rs.getString(8));
                lista.add(e);
            }
            cl.desconectar();
            con.close();
            stm.close();
        }
        catch (Exception ex)
        {
            
        }
        return lista;
    }
    
public int asignarpt(int idp, int idt){
 int respuesta = 0;
        
        csconexion cl = new csconexion();
        con =cl.conectar();
        
        try
        {
        stm = con.createStatement();
        respuesta = stm.executeUpdate("INSERT INTO PRODUCT_TEMPO VALUES(PT_SECUENCE.NEXTVAL,"+idt+","+idp+")");
        
        
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

