<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>        
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">        
        <title>Admin Page</title>        
        <link href="cssPage/menu.css" rel="stylesheet" type="text/css"/>        
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css"/>                
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css">   
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.9.1/font/bootstrap-icons.css">
    </head>  
 
    <body class="body">
        <nav class="main-menu ">           
            <ul class="navbar-nav mr-auto">
                <li>
                    <a href="menu.jsp">                        
                        <i class="fa bi bi-menu-app fa-2x"></i>                        
                        <span class="nav-text">
                            Home
                        </span>
                    </a>                  
                </li>
                <a href="nuevacategoria.jsp" role="button" id="buton_new_ninio" aria-haspopup="false" aria-expanded="false">
                <li>
                    
                        <i class="fa bi clipboard-plus fa-2x"></i>
                        <span class="nav-text">
                            Ingresar Nueva Categoria
                        </span>
                </a>
                </li>                                
                
                <li>
                 <a href="nuevatempo.jsp" role="button" id="buton_new_ninio" aria-haspopup="true" aria-expanded="false">
                       <i class="fa calendar fa-2x"></i>
                        <span class="nav-text">
                            Ingresar nueva Temporada
                        </span>
                       </a>
                </li>
                <li>
                 <a href="newproduct.jsp" role="button" id="buton_new_ninio" aria-haspopup="true" aria-expanded="false">
                       <i class="fa box-seam fa-2x"></i>
                        <span class="nav-text">
                            Ingresar nuevo producto
                        </span>
                       </a>
                </li>
                <li>
                 <a href="menu.jsp" role="button" id="buton_new_ninio" aria-haspopup="true" aria-expanded="false">
                       <i class="fa calendar2-check fa-2x"></i>
                        <span class="nav-text">
                            Editar temporadas
                        </span>
                       </a>
                </li> 

        </nav>        
        
        
        <script src="js/popper.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.bundle.min.js" type="text/javascript"></script>
        <script src="js/bootstrap.bundle.js" type="text/javascript"></script>
        
        <script src="js/jquery-3.3.1.min.js" type="text/javascript"></script>        
        <script src="js/bootstrap.min.js" type="text/javascript"></script>        
        
    </body>
</html>
