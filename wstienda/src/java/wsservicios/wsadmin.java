/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/WebService.java to edit this template
 */
package wsservicios;

import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import modelo.categoria;
import modelo.csnuevatempo;
import modelo.csnuevoproduct;
import modelo.lastproduct;
import modelo.list1proveedor;
import modelo.listarcategoria;
import modelo.listarproductos;
import modelo.nuevacategoria;
import modelo.pricestock;
import modelo.producto;
import modelo.seguntempo;
import modelo.seguntempoc;

/**
 *
 * @author jpmon
 */
@WebService(serviceName = "wsadmin")
public class wsadmin {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "insertarcatego")
    public int insertarcatego(@WebParam(name="nombre")String nombre, @WebParam(name="subcategoria")int cate, @WebParam(name ="direccionimage") String direcimg)
    {
        nuevacategoria e = new nuevacategoria();
        return e.insertarcategoria(nombre,cate,direcimg);
    }
    @WebMethod(operationName = "insertartempo")
    public int insertartempo(@WebParam(name="nombre")String nombre, @WebParam(name="fechainicio")String fechai,@WebParam(name="fechafin")String fechaf, @WebParam(name ="direccionimage") String direcimg)
    {
        csnuevatempo e = new csnuevatempo();
        return e.insertartempo(nombre,fechai,fechaf,direcimg);
    }
@WebMethod(operationName = "insertarproducto")
    public int insertarproducto(@WebParam(name="nombre")String nombre,@WebParam(name="desc")String desc, @WebParam(name ="direccionimage") String direcimg,@WebParam(name="idcate")int categ)
    {
        csnuevoproduct e = new csnuevoproduct();
        return e.insertarproducto(nombre, desc, categ, direcimg);
    }
@WebMethod(operationName = "firspricestock")
    public int firstpricestock( @WebParam(name="fechaad")String fechaad,@WebParam(name="cost")float cost,@WebParam(name="stockmin")int stockmin,@WebParam(name="stockmax")int stockmax,@WebParam(name="idproveedor")int idproveedor,@WebParam(name="porcent")float porcent,@WebParam(name="exist")int exist,@WebParam(name="idproducto")int idproducto)
    {
        csnuevoproduct e = new csnuevoproduct();
        return e.firstinsertarpricestock(cost, stockmin, stockmax,idproducto,idproveedor, fechaad, porcent, exist) ;
    }   
    
   @WebMethod(operationName = "listarcategorias")
    public ArrayList<categoria> listarcategories()
    {
        listarcategoria e = new listarcategoria();
        return e.listarcategorias();
    }
    
    @WebMethod(operationName = "listarPorIDcategoria")
    public categoria listarPoridcategories(@WebParam(name = "idcategoria")int idEmpresa)
    {
        listarcategoria e = new listarcategoria();
        return e.listarcategoriaPorID(idEmpresa);
    }
    
    @WebMethod(operationName = "listarultimoproduct")
    public lastproduct ultimoproduct()
    {
        csnuevoproduct e = new csnuevoproduct();
        return e.listarultimoproducto(0);
    }   
    @WebMethod(operationName = "listarproveedor1")
    public ArrayList<list1proveedor> listar1proveedor()
    {
        csnuevoproduct e = new csnuevoproduct();
        return e.listarproveedor() ;
    }
    @WebMethod(operationName = "principalescat")
    public ArrayList<categoria> catprincipal()
    {
        listarcategoria e = new listarcategoria();
        return e.listarprincipales();
    }
    @WebMethod(operationName = "subcat")
    public ArrayList<categoria> subcats(@WebParam(name = "idcategoria")int idcat)
    {
        listarcategoria e = new listarcategoria();
        return e.listarsubs(idcat) ;
    }
    
    @WebMethod(operationName = "productolista")
    public ArrayList<producto> listaproducto(@WebParam(name = "idcategoria")int idcat)
    {
        listarproductos e = new listarproductos();
        return e.listarproductos(idcat) ;
    }
    
    @WebMethod(operationName = "precio")
    public pricestock precios(@WebParam(name = "pro")int pro)
    {
        listarproductos e = new listarproductos();
        return e.prices(pro) ;
    }
    @WebMethod(operationName = "seguntempo")
    public seguntempoc segunt()
    {
        seguntempo e = new seguntempo();
        return e.sg() ;
    }
    
    @WebMethod(operationName = "precioporid")
    public producto precioporID(@WebParam(name = "pro")int pro)
    {
        listarproductos e = new listarproductos();
        return e.productoporid(pro) ;
    }
    @WebMethod(operationName = "tempoporid")
    public seguntempoc tempoid(@WebParam(name = "idt")int idt)
    {
        csnuevatempo e = new csnuevatempo();
        return e.listartempoid(idt) ;
    }
    
    @WebMethod(operationName = "listartempos")
    public ArrayList<seguntempoc> listartempos()
    {
        csnuevatempo e = new csnuevatempo();
        return e.listartempos();
    }
    
 @WebMethod(operationName = "asignarPT")
    public int AsignoPT(@WebParam(name="idtempo")int idt, @WebParam(name="id product")int idp)
    {
        csnuevatempo e = new csnuevatempo();
        return e.asignarpt(idp, idt) ;
    }   

    @WebMethod(operationName = "verseguntempo")
    public ArrayList<producto> psegunt(@WebParam(name="idtempo")int idt)
    {
        csnuevatempo e = new csnuevatempo();
        return e.producsegunt(idt) ;
    }    
    
}

