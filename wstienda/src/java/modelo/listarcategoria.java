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
public class listarcategoria {
    private Connection con;
    private Statement stm;
    private ResultSet rs;
    
    public listarcategoria()
    {
        this.con=null;
        this.stm=null;
    }
    
    public ArrayList<categoria> listarcategorias()
    {
        categoria e = null;
        ArrayList<categoria> lista = new ArrayList<categoria>();

        
        csconexion cl= new csconexion();
        con=cl.conectar();
        rs = null;
        
        try
        {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from CATEGORIA");
            
            while(rs.next())
            {
                e = new categoria(rs.getInt(1),rs.getString(2),rs.getInt(3) ,rs.getString(4));
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
    public categoria listarcategoriaPorID(int idcategoria)
    {
        categoria e = null;
        
        csconexion cl = new csconexion();
        con = cl.conectar();
        rs = null;
        
        try
        {
            stm = con.createStatement ();
            rs = stm.executeQuery("select * FROM CATEGORIA where IDCATEGORI ="+idcategoria);
            
            while (rs.next())
            {
                e = new categoria (rs.getInt(1),rs.getString(2),rs.getInt(3) ,rs.getString(4));
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
 public ArrayList<categoria> listarprincipales()
    {
        categoria e = null;
        ArrayList<categoria> lista = new ArrayList<categoria>();
        //lista = null;
        
        csconexion cl= new csconexion();
        con=cl.conectar();
        rs = null;
        
        try
        {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM CATEGORIA WHERE CATEGORIA.IDCATEGORI=CATEGORIA.categoria_idcategori");
            
            while(rs.next())
            {
                e = new categoria(rs.getInt(1),rs.getString(2),rs.getInt(3) ,rs.getString(4));
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
public ArrayList<categoria> listarsubs(int superior)
    {
        categoria e = null;
        ArrayList<categoria> lista = new ArrayList<categoria>();
        //lista = null;
        
        csconexion cl= new csconexion();
        con=cl.conectar();
        rs = null;
        
        try
        {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM CATEGORIA WHERE CATEGORIA.IDCATEGORI!=CATEGORIA.categoria_idcategori AND categoria.categoria_idcategori="+superior+"");
            
            while(rs.next())
            {
                e = new categoria(rs.getInt(1),rs.getString(2),rs.getInt(3) ,rs.getString(4));
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

}
