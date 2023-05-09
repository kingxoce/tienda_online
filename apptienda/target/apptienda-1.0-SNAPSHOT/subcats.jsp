<%-- 
    Document   : subcats
    Created on : 7/10/2022, 15:03:52
    Author     : jpmon
--%>

<%@page import="wsservicios.Producto"%>
<%-- 
    Document   : productos
    Created on : 7/10/2022, 15:26:33
    Author     : jpmon
--%>

<%@page import="java.util.List"%>
<%@page import="wsservicios.Wsadmin_Service"%>
<%@page import="wsservicios.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="wsservicios.Producto"%>
<%@page import="wsservicios.Pricestock"%>
<%@page import="wsservicios.Seguntempo"%>
<%@page import="wsservicios.Seguntempoc "%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/> 
        <title>JSP Page</title>
    </head>
    
    
    <style>
header{
height: 40%;
width: 100%;
background-color: black;
align-self: center;
align-items: center;
align-content: center;  
}
header img{
    height: 35vh;
    width: 90%;
    align-self: center;
}
body{

    background-image: url(http://127.0.0.1:8887/src/main/webapp/imagenes/minima.jpg);
}             
            
ul {
  list-style-type: none;
  margin: 0;
  padding: 0;
  overflow: hidden;
  background-color: #333;
}

li {
  float: left;
}

li a {
  display: block;
  color: white;
  text-align: center;
  padding: 14px 16px;
  text-decoration: none;
}

li a:hover {
  background-color: #111;
}

#recuadros{
    width: 100%;
    overflow: hidden;
    border: 0px solid;
    text-align: center;
    margin-left: 50px;
}

#recuadros .recuadro{
    width: 370px;
    height: 370px;
    overflow: hidden;
    border: 0px solid;
    text-align: center;
    float: left;
    padding:5px;
    color: #F2F2F2;
   color: black;
    border: 1px solid #4e555b;
    margin: 5px;
    background-color: #f8d7da;
    
}
#recuadros .recuadro.parrafo{
   color: #fd7e14;
   text-align: justify;
   
    
}

    </style>
    
    <%
      Seguntempoc t;
              Wsadmin_Service te = new Wsadmin_Service();
               t=te.getWsadminPort().seguntempo();
              
    %>
    <body>
       <ul>
  <li><a class="active" href="menuprincipal.jsp">Home</a></li>
  <li><a href="#news">TEMPORADA</a></li>
  <li><a href="#contact">CARRITO</a></li>
  <li><a href="#about">USUARIO</a></li>
</ul>    
        <section id="recuadros">
        <%
           int idpri = Integer.parseInt(request.getParameter("id").toString());
            List<Categoria> p = null; 
                         Wsadmin_Service em = new Wsadmin_Service();
                         p=em.getWsadminPort().subcat(idpri) ;
                         
          int idpro = Integer.parseInt(request.getParameter("id").toString());
            List<Producto> f = null; 
              Wsadmin_Service me = new Wsadmin_Service();      
              f=me.getWsadminPort().productolista(idpro) ;     
              
              Pricestock e ;
              Wsadmin_Service ke = new Wsadmin_Service();
              
              float ho;
              ho= Float.parseFloat("3.007");
              
            if(!p.isEmpty()){
         for (Categoria i : p) {                                                                    
                                    %>
                                    <a href="subcats.jsp?id=<%=i.getIdcategoria()%>">
                                    <section class="recuadro" >
                                        <img src="<%=i.getDireccionimg()%>" height="250" width="250">
                                    <h2><%=i.getNombre()%> </h2>
                                    </section>
                                    </a>
                                    <%     
                                        
                                }
}else{ 


                                    
                                    %>
                                    <% for (Producto l: f) {                                                               
                                    %>
                                    <a href="productos.jsp?idp=<%=l.getIdp() %>">
                                    <section class="recuadro" >
                                        <img src="<%=l.getImg() %>" height="250" width="250" alt="No disponible">
                                    <h6><%=l.getNombre()%> </h6>
                                    <%
                                    e=ke.getWsadminPort().precio(l.getIdp()) ; 
                                    try{
                                    %>
                                    
                                    <h5><%=e.getPrecio()%></h5>
                                    <%}catch(Exception e1){
%>
                                    <h4>No Disponible</h4>
                                    <% } %>
                                    </section>
                                    </a>
                                    <%     
                                        
                                }
                                        }
%>
        </section>
        
        
        
    </body>
</html>


