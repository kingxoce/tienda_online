<%-- 
    Document   : nuevatempo
    Created on : 3/10/2022, 16:54:27
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
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/sweetalert.min.js" type="text/javascript"></script>        
        <link rel="stylesheet" href="cssPage/contenedores.css"/>
        <title>Ingresar Nueva temporada</title>
    </head>
    <body>

     <%@include file="menu.jsp"%>                         
        <% 
         String fecha1 = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
         
         String fecha2 = new SimpleDateFormat("yyyy-MM-dd").format(Calendar.getInstance().getTime());
        try {
           
        } catch (Exception e) {
            
        }                                        
        %>    
        <section class="form">            
            <div class="cover-caption">
                <div class="title-form">                    
                    <i class="fa bi bi-file-text fa-2x"></i>
                    <h3 class="h1-form">Ingresar una temporada</h3>                    
                </div>                
                <hr class="hr-form">
                <form class="cover-caption__form" name="frmtempo" action="srvnewtempo" method="POST">            
                    <div class="form-group">    
                        <label class="form-group__label" for="name">Nombre</label>
                        <input name="txtname" class="input-form" type="text" class="form-control">                                        
                    </div>
                    <div class="form-group">
                        <label class="form-group__label" for="fechaCrea">Fecha Inicio</label>
                        <input name="txtfi" class="input-form" type="date" class="form-control" required="true" value="<%=fecha1%>">                                        
                    </div>
                   <div class="form-group">
                        <label class="form-group__label" for="fechaCrea">Fecha final</label>
                        <input name="txtfn" class="input-form" type="date" class="form-control" required="true" value="<%=fecha2%>">                                        
                    </div>
                    <div class="form-group">    
                        <label class="form-group__label" for="dire">Direccion de imagen</label>
                        <input name="txtimg" class="input-form" type="text" class="form-control">                                        
                    </div>
                    <div class="button-container">    
                        <button class="button-form" type="submit" name="btnseguir">                            
                            Insertar Temporada                            
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
