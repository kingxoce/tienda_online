<%@page import="wsservicios.Producto"%>
<%@page import="java.util.List"%>
<%@page import="wsservicios.Wsadmin_Service"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="cssPage/buscador.css"/>        
        <script src="js/sweetalert.min.js" type="text/javascript"></script>        
        <title> Productos registrados</title>
    </head>
    <body>  
        <%@include file="menu.jsp"%> 
        <section class="buscador">
            <div class="table-buscador">
                <table class="table table-buscador__container">
                    <thead>
                        <tr>
                            <th scope="col">Id del producto</th>
                            <th scope="col">Nombre</th>
                            <th scope="col">Imagen</th>
                            <th style="center" scope="col">Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            int idtempo = Integer.parseInt(request.getParameter("idt").toString());
                            List<Producto> p = null; 
                            Producto e ;
                            Wsadmin_Service em = new Wsadmin_Service();
                                                        
                                p= em.getWsadminPort().verseguntempo(idtempo)  ;                                                            
                                for (int i = 0; i < p.size(); i++) {
                                %>
                                <tr>                                
                                    <td><%=p.get(i).getIdp()%></td>
                                    <td><%=p.get(i).getNombre()%></td>
                                    <td><img height="100" width="100" src=<%=p.get(i).getImg() %> ></td>
                                    <td>
                                        <div class="button-container">                                                                                
                                            <a id="delete" href="srvDeleteEmpresa?txtId=<%=p.get(i).getIdp()%>" class="button-form red x1" type="submit" name="btnGuardar">                            
                                                Eliminar
                                                <i class="fo bi bi-trash fo-1x x1"></i>
                                            </a>
                                        </div>                                        
                                    </td>
                                </tr>
                                <%    
                                }
                                                                                                                
                        %>                          
                    </tbody>
                </table>
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
                            title: "Registro",
                            text: "Eliminado Correctamente",
                            icon: "success"
                        });                        
                    </script>                
                    <%
                }else{
                    %>  
                    <script>
                        swal({
                            title: "Registro",
                            text: "Eliminado Incorrectamente",
                            icon: "error"
                        });                        
                    </script>                
                    <%                    
                }
            }
        %>                    
    </body>
</html>