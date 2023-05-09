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
public class csnuevoproduct {
 private Connection con;
    private Statement stm;
    private ResultSet rs;
    
    public csnuevoproduct()
    {
       this.con=null;
       this.stm=null;
    }
    
public int insertarproducto(String nombre,String desc,int cate,String direccionimg){
 int respuesta = 0;
 int r1 = 0;
 int r2 = 0;
        
        csconexion cl = new csconexion();
        con =cl.conectar();
        
        try
        {
        stm = con.createStatement();
        r1 = stm.executeUpdate("INSERT INTO PRODUCT VALUES(IDPRODUCT_SECUENCE.NEXTVAL,'"+nombre+"','"+desc+"',"+cate+",'"+direccionimg+"')");
        respuesta =r1;
        cl.desconectar();
        con.close();
        stm.close();
        }
        catch (Exception ex)
        {
           
        }
        return respuesta;
}    

public int firstinsertarpricestock(float costo,int stockminimo,int stockmaximo,int idproducto,int idproveedor,String fechaad,float porcent,int exist){
 int respuesta = 0;
 int r1 = 0;
 int r2 = 0;
        
        csconexion cl = new csconexion();
        con =cl.conectar();
        
        try
        {
        stm = con.createStatement();
        r2 = stm.executeUpdate("INSERT INTO PRICESTOCK (IDPRICESTOCK,COSTOPRODUCTO,STOCKMINIMO,STOCKMAXIMO,PRODUCT_IDPRODUCTO,PROVEERDOR_IDPROVEEDOR,FECHAADQUISICION,PORCENTAJE,EXISTENCIA) VALUES(IDPRICESTOCK_SECUENCE.NEXTVAL,"+costo+","+stockminimo+","+stockmaximo+","+idproducto+","+idproveedor+",TO_DATE('"+fechaad+"','YYYY-MM-DD'),"+porcent+","+exist+")");
        respuesta =r2;
        cl.desconectar();
        con.close();
        stm.close();
        }
        catch (Exception ex)
        {
           
        }
        return respuesta;
}    
    public lastproduct listarultimoproducto(int idEmpresa)
    {
        lastproduct e = null;
        
        csconexion cl = new csconexion();
        con = cl.conectar();
        rs = null;
        
        try
        {
            stm = con.createStatement ();
            rs = stm.executeQuery("SELECT MAX(IDPRODUCTO) FROM PRODUCT");
            
            while (rs.next())
            {
                e = new lastproduct (rs.getInt(1));
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
    public ArrayList<list1proveedor> listarproveedor()
    {
        list1proveedor e = null;
        ArrayList<list1proveedor> lista = new ArrayList<list1proveedor>();
        //lista = null;
        
        csconexion cl= new csconexion();
        con=cl.conectar();
        rs = null;
        
        try
        {
            stm = con.createStatement();
            rs = stm.executeQuery("select * from PROVEERDOR");
            
            while(rs.next())
            {
                e = new list1proveedor(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getString(4));
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
 
