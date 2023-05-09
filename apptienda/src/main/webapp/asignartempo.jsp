<%@page import="wsservicios.Producto"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="wsservicios.Categoria"%>
<%@page import="wsservicios.Seguntempoc"%>
<%@page import="wsservicios.Wsadmin_Service"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="cssPage/buscador.css"/>        
        <script src="js/sweetalert.min.js" type="text/javascript"></script> 
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
        <title>Mantenimiento Temporada</title>
    </head>
    <body>  
        <%@include file="menu.jsp"%> 
        <section class="buscador">
            <div>
                <div class="title-form">
                    <i class="fo bi bi-building"></i>
                    <h1>Buscar Producto</h1>                                        
                </div>                
                <hr class="hr-form">                
                <form class="form-buscador__form" action="srvlistarproporcat" method="POST">                        
                    <div class="form-group__row">                            
                        <label class="form-group__label">Buscar por Categoria</label>
                        <select required="true" class="input-form" name="txtBuscar">
                            <option value="0">Seleccione una categoria</option>
                            <%                            
                               List<Categoria> b = null; 
                         Wsadmin_Service fe = new Wsadmin_Service();
                         b=fe.getWsadminPort().listarcategorias();
                         
                              for (Categoria i : b) {                                                                    
                                    %>
                                    <option value="<%=i.getIdcategoria()%>">
                                        <%=i.getNombre()%>
                                    </option>
                                    <%                                        
                                }
                            %>  
                        </select> 
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
                            <th scope="col">Id de producto</th>
                            <th scope="col">Nombre </th>
                             <th scope="col">imagen</th>
                            <th style="center" scope="col">Acciones</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                         List<Producto> p = null; 
                         Producto e ;
                         Wsadmin_Service em = new Wsadmin_Service();
                            
                            if(request.getAttribute("idcat")!=null){
                             
                               int idcat = Integer.parseInt(request.getAttribute("idcat").toString());
                             
                              try {                                                                        
                                                               
                               p= em.getWsadminPort().productolista(idcat) ;                                                            
                                for (int i = 0; i < p.size(); i++) {
                                %>
                                <tr>                                
                                   <td><%=p.get(i).getIdp() %></td>
                                   <td><%=p.get(i).getNombre() %></td>
                                    <td><img height="100" width="100" src="<%=p.get(i).getImg()%>" ></td>
                                    <td>
                                        <div class="button-container">
                                            <a href="productstemp.jsp?idt=<%=p.get(i).getDesc()%>" class="button-form blue x1" type="submit" name="btnGuardar">                            
                                                 Ver Productos
                                                <i class="fo bi bi-pencil fo-1x x1"></i>
                                            </a>                                                                                
                                      
                                      
                                            <a href="" class="button-form blue x1" type="submit" name="btnGuardar">                            
                                                 Agregar Productos
                                                <i class="fo bi bi-pencil fo-1x x1"></i>
                                            </a>                                                                                
                                        </div>                                  
                                    </td>
                                </tr>
                                
                                <%
                                    }
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
                                p= em.getWsadminPort().productolista(33) ;                                                            
                                for (int i = 0; i < p.size(); i++) {
                                %>
                                <tr>                                
                                   <td><%=p.get(i).getIdp() %></td>
                                   <td><%=p.get(i).getNombre() %></td>
                                    <td><img height="100" width="100" src=<%=p.get(i).getImg() %> ></td>
                                    <td>
                                        <div class="button-container">
                                            <a href="productstemp.jsp?idt=<%=p.get(i).getDesc() %>" class="button-form blue x1" type="submit" name="btnGuardar">                            
                                                 Ver Productos
                                                <i class="fo bi bi-pencil fo-1x x1"></i>
                                            </a>                                                                                
                                      
                                      
                                            <a href="" class="button-form blue x1" type="submit" name="btnGuardar">                            
                                                 Agregar Productos
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
    