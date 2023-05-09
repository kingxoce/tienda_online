<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="wsservicios.Categoria"%>
<%@page import="wsservicios.Wsadmin_Service"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="cssPage/buscador.css"/>        
        <script src="js/sweetalert.min.js" type="text/javascript"></script> 
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
        <title>Mantenimiento Categoria</title>
    </head>
    <body>  
        <%@include file="menu.jsp"%> 
        <section class="buscador">
            <div>
                <div class="title-form">
                    <i class="fo bi bi-building"></i>
                    <h1>Busqueda Categoria</h1>                                        
                </div>                
                <hr class="hr-form">                
                <form class="form-buscador__form" action="servletlistarcate" method="POST">                        
                    <div class="form-group__row">                            
                        <label class="form-group__label">Id de categoria</label>
                        <input name="txtBuscar" class="input-form" type="text" class="form-control" required="true" placeholder="ID">
                    </div>
                    <div class="button-container">    
                        <button class="button-form green" type="submit" name="btnGuardar">                            
                            Buscar                            
                            <i class="fo bi bi-search fo-1x"></i>
                        </button>                                                                                                
                    </div>
                </form>                
                <hr class="hr-form">                
            </div>  
            <div class="table-buscador">
                <table class="table table-buscador__container">
                    <thead>
                        <tr>
                            <th scope="col">Id Categoria</th>
                            <th scope="col">Nombre</th>
                            <th scope="col">categoria Superior</th>
                            <th scope="col">Dirección imagen</th>
                            <th style="center" scope="col">Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                         List<Categoria> p = null; 
                         Categoria e ;
                         Wsadmin_Service em = new Wsadmin_Service();
                            
                            if(request.getAttribute("idcat")!=null){
                                int idcat = 0;
                                idcat = Integer.parseInt(request.getAttribute("idcat").toString());
                              e= em.getWsadminPort().listarPorIDcategoria(idcat);
                                try {                                                                        
                                %>                                
                                <tr>                                
                                    <td><%=e.getIdcategoria() %></td>
                                    <td><%=e.getNombre()%></td>
                                    <td><%=e.getIdcategoria2()%></td>
                                    <td><img height="100" width="100" src=<%=e.getDireccionimg()%> ></td>
                                    <td>
                                        <div class="button-container">
                                            <a href="" class="button-form blue x1" type="submit" name="btnGuardar">                            
                                                Actualizar
                                                <i class="fo bi bi-pencil fo-1x x1"></i>
                                            </a>                                                                                
                                        </div>                                        
                                    </td>
                                </tr>
                                <%
                                } catch (Exception e1) {
                                    %>
                                    <script>
                                        swal({
                                            title: "Busqueda",
                                            text: "No Existe el id Empresa",
                                            icon: "error"
                                        });                        
                                    </script>                                    
                                    <%
                                    request.setAttribute("idcat", null);
                                }
                            }else{
                                p= em.getWsadminPort().listarcategorias();                                                            
                                for (int i = 0; i < p.size(); i++) {
                                %>
                                <tr>                                
                                   <td><%=p.get(i).getIdcategoria() %></td>
                                    <td><%=p.get(i).getNombre() %></td>
                                    <td><%=p.get(i).getIdcategoria2()%></td>
                                    <td><img height="100" width="100" src="<%=p.get(i).getDireccionimg()%>" ></td>
                                    <td>
                                        <div class="button-container">
                                            <a href="" class="button-form blue x1" type="submit" name="btnGuardar">                            
                                                 Actualizar
                                                <i class="fo bi bi-pencil fo-1x x1"></i>
                                            </a>                                                                                
                                        </div>                                        
                                    </td>
                                </tr>
                                <%    
                                }
                            }                                                                                    
                        %>                          
                    </tbody>
                </table>
            </div>
        </section>                      
    </body>
</html>
    