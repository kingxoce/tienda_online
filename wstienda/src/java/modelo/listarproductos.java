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
public class listarproductos {
    
    private Connection con;
    private Statement stm;
    private ResultSet rs;
    
    public listarproductos()
    {
        this.con=null;
        this.stm=null;
    }
    
    public ArrayList<producto> listarproductos(int cat)
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
            rs = stm.executeQuery("SELECT * FROM PRODUCT WHERE CATEGORIA_IDCATEGORI="+cat+"");
            
            while(rs.next())
            {
                e = new producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
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

public pricestock prices(int pro)
    {
        pricestock e = null;
        
        
        
        csconexion cl= new csconexion();
        con=cl.conectar();
        rs = null;
        
        try
        {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT  PRODUCT_IDPRODUCTO,PRECIOVENTA,EXISTENCIA,IDPRICESTOCK FROM (SELECT PRECIOVENTA,FECHAADQUISICION,IDPRICESTOCK,PRODUCT_IDPRODUCTO,EXISTENCIA FROM PRICESTOCK \n" +
"WHERE PRODUCT_IDPRODUCTO="+pro+" AND EXISTENCIA>STOCKMINIMO) \n" +
"WHERE FECHAADQUISICION =(SELECT MAX (FECHAADQUISICION) \n" +
"from (SELECT PRECIOVENTA,FECHAADQUISICION,IDPRICESTOCK,PRODUCT_IDPRODUCTO,EXISTENCIA FROM PRICESTOCK \n" +
"WHERE PRODUCT_IDPRODUCTO="+pro+" AND EXISTENCIA>STOCKMINIMO)) ");
            
            while(rs.next())
            {
                e = new pricestock(rs.getInt(1),rs.getFloat(2),rs.getInt(3),rs.getInt(4));
                
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
public producto productoporid(int pro)
    {
        producto e = null;
        
        
        
        csconexion cl= new csconexion();
        con=cl.conectar();
        rs = null;
        
        try
        {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM PRODUCT WHERE IDPRODUCTO="+pro+"");
            
            while(rs.next())
            {
                e = new producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getString(5));
                
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
