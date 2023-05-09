<%-- 
    Document   : menuprincipal
    Created on : 6/10/2022, 18:38:43
    Author     : jpmon
--%>

<%@page import="java.util.List"%>
<%@page import="wsservicios.Wsadmin_Service"%>
<%@page import="wsservicios.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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
    width: 100%;
    align-self: center;
    align-items: center;
   
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
    align-items: center;
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
    background-color: antiquewhite;
    
}
#recuadros .recuadro.parrafo{
   color: #fd7e14;
   text-align: justify;
   
    
}

    </style>
    <body>
       <ul>
  <li><a class="active" href="#home">Home</a></li>
  <li><a href="#news">TEMPORADA</a></li>
  <li><a href="#contact">CARRITO</a></li>
  <li><a href="#about">USUARIO</a></li>
</ul> 
        <header>
            
                <a href="menu.jsp">
                    <img src="http://127.0.0.1:8887/src/main/webapp/IMAGENES_PROYECTO2/TEMPORADA/halloween.png">    
            </a>
              
        </header>       
        <section id="recuadros">
        <%List<Categoria> p = null; 
                         Wsadmin_Service em = new Wsadmin_Service();
                         p=em.getWsadminPort().principalescat() ;
            
         for (Categoria i : p) {                                                                    
                                    %>
                                    <a href="subcats.jsp?id=<%=i.getIdcategoria()%>">
                                    <section class="recuadro" >
                                        <img src="<%=i.getDireccionimg()%>" height="250" width="250">
                                    <h2><%=i.getNombre()%> </h2>
                                    </section>
                                    </a>
                                    <%                                        
                                }   %>
        </section>
        
        
        
    </body>
</html>
