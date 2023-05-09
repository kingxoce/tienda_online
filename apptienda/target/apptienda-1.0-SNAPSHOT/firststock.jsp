<%-- 
    Document   : firststock
    Created on : 5/10/2022, 20:32:18
    Author     : jpmon
--%>

<%@page import="wsservicios.Lastproduct"%>
<%@page import="java.util.Calendar"%>
<%@page import="java.util.List"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.Date"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="wsservicios.List1Proveedor "%>
<%@page import="wsservicios.Wsadmin_Service"%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/sweetalert.min.js" type="text/javascript"></script>        
        <link rel="stylesheet" href="cssPage/contenedores.css"/>
        <title>Ingresar Nuevo producto</title>
    </head>
    <body>

     <%@include file="menu.jsp"%>                         
        <% 
         Lastproduct p = null; 
         Wsadmin_Service em = new Wsadmin_Service();
         p=em.getWsadminPort().listarultimoproduct() ;
         String fecha1 = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        
       
        try {
           
        } catch (Exception e) {
            
        }                                        
        %>    
        <section class="form">            
            <div class="cover-caption">
                <div class="title-form">                    
                    <i class="fa bi bi-file-text fa-2x"></i>
                    <h3 class="h1-form">Ingresar existencias del producto</h3>                    
                </div>                
                <hr class="hr-form">
                <form class="cover-caption__form" name="frmcat" action="srvfirststock" method="POST">            
                    <div class="form-group">    
                        <label class="form-group__label" for="name">Costo del producto </label>
                        <input name="txtcost" class="input-form" type="text" class="form-control">                                        
                    </div>
                    <div class="form-group">
                        <label class="form-group__label" for="direc">Stock Minimo</label>
                        <input name="txtsmin" class="input-form" type="text" class="form-control" required="true">                                                 
                    </div>
                    <div class="form-group">
                        <label class="form-group__label" for="direc">Stock Maximo</label>
                        <input name="txtsmax" class="input-form" type="text" class="form-control" required="true">                                                 
                    </div>
                    <div class="form-group">
                        <label class="form-group__label" for="direc">Id del producto</label>
                        <input disabled="true" name="txtidpro" class="input-form" type="text" class="form-control" value="<%=p.getIdlastproduct()%>">
                        <input hidden="true" name="txtPro" class="input-form" type="text" class="form-control" value="<%=p.getIdlastproduct()%>">
                    </div>
                   <div class="form-group">
                        <label class="form-group__label" for="subcat">Proveedor</label>                                          
                        <select required="true" class="input-form" name="txtidpre">
                            <option value="0">Seleccione un proveedor registrado</option>
                            <%                            
                               List<List1Proveedor> pe = null; 
                         Wsadmin_Service ki = new Wsadmin_Service();
                         pe=ki.getWsadminPort().listarproveedor1();
                         
                              for (List1Proveedor i : pe) {                                                                    
                                    %>
                                    <option value="<%=i.getIdpe()%>">
                                        <%=i.getNombre()%>
                                    </option>
                                    <%                                        
                                }
                            %>  
                        </select>  
                    <div class="form-group">
                        <label class="form-group__label" for="fechaCrea">Fecha de entrada</label>
                        <input name="txtfad" class="input-form" type="date" class="form-control" required="true" value="<%=fecha1%>">                                        
                    </div>
                    
                    <div class="form-group">
                        <label class="form-group__label" for="direc">Porcentaje de ganancia</label>
                        <input name="txtporc" class="input-form" type="text" class="form-control" required="true">                                                 
                    </div>
                    <div class="form-group">
                        <label class="form-group__label" for="direc">Existencias</label>
                        <input name="txxexist" class="input-form" type="text" class="form-control" required="true">                                                 
                    </div> 
                    <div class="button-container">    
                        <button class="button-form" type="submit" name="btnseguir">                            
                            Registrar                           
                            <i class="fo bi bi-save fo-1x"></i>
                        </button>                                                                                                
                    </div>
                </form>                                                                                            
            </div>        
        </section>  
        <%
            if(request.getAttribute("respuesta")!=null){
                int respuesta;
                respuesta = Integer.parseInt(request.getAttribute("respuesta").toString());                
                
                if(respuesta == 1){
                    %>  
                    <script>
                        swal({
                            title: "Datos Guardados",
                            text: "Registros Guardados",
                            icon: "success"
                        });                        
                    </script>                
                    <%
                }else if(respuesta==0){
                    %>  
                    <script>
                        swal({
                            title: "Registro",
                            text: "Insertado Incorrectamente",
                            icon: "error"
                        });                        
                    </script>                
                    <%                    
                }
            }
        %>         
    </body>
</html>
