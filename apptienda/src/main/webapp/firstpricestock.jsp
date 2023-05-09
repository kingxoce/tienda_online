<%-- 
    Document   : firstpricestock
    Created on : 4/10/2022, 22:19:49
    Author     : jpmon
--%>

<%@page import="java.util.Calendar"%>
<%@page import="java.util.List"%>
<%@page import="java.time.LocalDateTime"%>
<%@page import="java.util.Date"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.text.DateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="wsservicios.Categoria"%>
<%@page import="wsservicios.Wsadmin_Service"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/sweetalert.min.js" type="text/javascript"></script>        
        <link rel="stylesheet" href="cssPage/contenedores.css"/>
        <title>Ingresar Primer Stock</title>
    </head>
    <body>

     <%@include file="menu.jsp"%>                         
        <% 
         
       
        try {
           
        } catch (Exception e) {
            
        }                                        
        %>    
        <section class="form">            
            <div class="cover-caption">
                <div class="title-form">                    
                    <i class="fa bi bi-file-text fa-2x"></i>
                    <h3 class="h1-form">Ingresar Stock</h3>                    
                </div>                
                <hr class="hr-form">
                <form class="cover-caption__form" name="frmcat" action="srvnewcat" method="POST">            
                    <div class="form-group">    
                        <label class="form-group__label" for="name">Costo del producto</label>
                        <input name="txtname" class="input-form" type="text" class="form-control">                                        
                    </div>
                     <div class="form-group">    
                        <label class="form-group__label" for="name">Stock Minimo</label>
                        <input name="txtname" class="input-form" type="text" class="form-control">                                        
                    </div>     
                    <div class="form-group">
                        <label class="form-group__label" for="direc">Stock Maximo</label>
                        <input name="txtdesc" value=" " class="input-form" type="text" class="form-control" required="true">                                                 
                    </div>
                     <div class="form-group">    
                        <label class="form-group__label" for="name">proveedor</label>
                        <input name="txtname" class="input-form" type="text" class="form-control">                                        
                    </div>
                     <div class="form-group">    
                        <label class="form-group__label" for="name">Fecha en la que entró</label>
                        <input name="txtname" class="input-form" type="text" class="form-control">                                        
                    </div>
                    <div class="form-group">
                        <label class="form-group__label" for="direc">Porcentaje de ganancia</label>
                        <input name="txtimg" value=" " class="input-form" type="text" class="form-control" required="true">                                                 
                    </div> 
                     <div class="form-group">    
                        <label class="form-group__label" for="name">Existencias</label>
                        <input name="txtname" class="input-form" type="text" class="form-control">                                        
                    </div>
                    <div class="button-container">    
                        <button class="button-form" type="submit" name="btnseguir">                            
                            Continuar registro                            
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
