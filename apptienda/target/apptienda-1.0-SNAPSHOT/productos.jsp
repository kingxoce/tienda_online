<%@page import="wsservicios.Pricestock"%>
<%@page import="java.util.List"%>
<%@page import="wsservicios.Wsadmin_Service"%>
<%@page import="wsservicios.Categoria"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="wsservicios.Producto"%>
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
    margin-left: 15px;
}

#recuadros .recuadro{
    width: 800px;
    height: 700px;
    overflow: hidden;
    border: 0px solid;
    float: left;
    padding:5px;
    color: #F2F2F2;
   color: black;
    margin: 5px;
   background-color: #f8d7da; 
    
}





#recuadros .recuadro img{
    border: 2px solid darkslategrey;
    
}


#recuadros .aux{
    width: 395px;
    height: 700px;
    float: left;
    overflow: hidden;
    color: #F2F2F2;
   color: black;
   margin: 5px;
   background-color: #f8d7da; 
    
}
#recuadros .aux h1{
    color: crimson;    
}

#recuadros .recuadro.parrafo{
   color: #fd7e14;
   text-align: justify;
   
    
}
.button-form{    
    padding-left: 10px;
    padding-right: 10px;
    align-items: center;        
    background-color: rgba(0, 99, 255, 0.5);    
    border: none;
    border-radius: 40px;
    color: white;
    cursor: pointer;    
    display: flex;
    font-size: 15px;
    font-weight: bold;
    font-family: 'Muli', sans-serif;    
    height: 50px;
    justify-content:center;
    letter-spacing: 1.5px;        
    outline: none;
    width: auto;
    text-decoration: none;
    margin: 10px;
    margin-left: 20;
    box-shadow: 0 2px 6px 0 rgba( 31, 38, 135, 1.40 );
    float: left;
    overflow: hidden;
}
    </style>
    <body>
       <ul>
  <li><a class="active" href="#home">Home</a></li>
  <li><a href="#news">TEMPORADA</a></li>
  <li><a href="#contact">CARRITO</a></li>
  <li><a href="#about">USUARIO</a></li>
</ul>      
        <section id="recuadros">
        <%
           int idpri = Integer.parseInt(request.getParameter("idp").toString());
            Producto p = null; 
                         Wsadmin_Service em = new Wsadmin_Service();
                         p=em.getWsadminPort().precioporid(idpri);
            Pricestock e ;
              Wsadmin_Service ke = new Wsadmin_Service();
           e=ke.getWsadminPort().precio(p.getIdp());                                                                
                                    %>
                                    
                                    <section class="recuadro" >
                                        <h3><%=p.getNombre()%> </h3>
                                        <img src="<%=p.getImg()%>" height="600" width="700">
                                    
                                    </section>
                                        <section class="aux">
                                        <h4><%=p.getDesc()%> </h4>
                                        <h1>Q<%=e.getPrecio()%></h1>
                                 <button class="button-form" type="submit" name="btnGuardar">                            
                                    Comprar                            
                                 <i class="fo bi bi-search fo-1x"></i>
                                 </button>
                                 <button class="button-form" type="submit" name="btnGuardar">                            
                                    Agregar al  Carrito                            
                                 <i class="fo bi bi-search fo-1x"></i>
                                 </button>        
                                         
                                    
                                    </section>    
                                    
                                    <%                                        
                                   %>
        </section>
        
        
        
    </body>
</html>
