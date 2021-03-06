<%-- 
    Document   : indexInicio
    Created on : 17-dic-2018, 21:26:49
    Author     : LUCIA
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.Date"%>
<%@page import="java.sql.Timestamp"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%@page import="modelo.entidades.Tipoalerta"%>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">

        <title>Rawson BPO</title>


        <!-- Bootstrap CSS CDN -->
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/css/bootstrap.min.css" integrity="sha384-9gVQ4dYFwwWSjIDZnLEWnxCjeSWFphJiwGPXr1jddIhOegiu1FwO5qRGvFXOdJZ4" crossorigin="anonymous">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        <!-- Our Custom CSS -->
        <link rel="stylesheet" href="css/style.css">
 

        <!-- Font Awesome JS -->
        <script defer src="https://use.fontawesome.com/releases/v5.0.13/js/solid.js" integrity="sha384-tzzSw1/Vo+0N5UhStP3bvwWPq+uvzCMfrN1fEFe+xBmv1C/AtVX5K0uZtmcHitFZ" crossorigin="anonymous"></script>



    </head>

    <link rel="shortcut icon" href="img/favicon.ico">
    <body>

        <% Object proyectoName = session.getAttribute("proyectoName");%>
        <div class="wrapper">
            <!-- Sidebar  -->
            <nav id="sidebar">
                <div class="sidebar-header">
                    <a href="index.html">
                        <img src="img/LOGO-RAWSONBPO-9.png" height="70"  alt=""/></a>

                </div>

                <ul class="list-unstyled components">

                    <li>
                        <a href="crea_requisito.html">
                            <i class="glyphicon glyphicon-briefcase"></i>
                            Crear Requisito
                        </a>

                    </li>

                    <li>

                        <a href="crea_informe.html">
                            <i class="glyphicon glyphicon-duplicate"></i>
                            Crear Informe
                        </a>

                    </li>

                    <li>
                        <a href="repositorio.html">
                            <i class="glyphicon glyphicon-cloud"></i>
                            Repositorio
                        </a>
                    </li>

                    <li >
                        <a href="crea_alerta.html">
                            <i class="glyphicon glyphicon-flag"></i>
                            Crear Alerta
                        </a>
                    </li>
                </ul>
                <!--
                <ul class="list-unstyled CTAs">
                   
                  <li><a href="#" class="article"><i class="glyphicon glyphicon-earphone"></i>Llamar a Chicho</a></li>
              </ul>
                -->
            </nav>


            <!-- Page Content  -->
            <div id="content">

                <nav class="navbar navbar-expand-lg navbar-light bg-light">
                    <div class="container-fluid">

                        <button type="button" id="sidebarCollapse" class="btn btn-info">
                            <i class="glyphicon glyphicon-list"></i>
                        </button>
                        <button class="btn btn-dark d-inline-block d-lg-none ml-auto" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                            <i class="fas fa-align-justify"></i>
                        </button>

                        <div class="collapse navbar-collapse" id="navbarSupportedContent">
                            <ul class="nav navbar-nav ml-auto">
                                <li class="nav-item active">
                                    <a class="nav-link" href="proyectos2.html">Proyectos</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="chat.html">Chat</a>
                                </li>

                                <li class="nav-item dropdown">
                                    <a class="nav-link " data-toggle="dropdown" href="#" role="button" >Idioma</a>
                                    <div class="dropdown-menu">
                                        <a class="dropdown-item" href="#"></a>
                                        <a class="dropdown-item" href="#">Inglés</a>
                                        <a class="dropdown-item" href="#">Francés</a>

                                    </div>
                                </li>

                                <li class="nav-item">
                                    <a class="nav-link" href="#">Perfil</a>
                                </li>
                                <li class="nav-item">
                                    <a class="nav-link" href="perfil.html">Perfil</a>
                                </li>
                            </ul>
                        </div>
                    </div>
                </nav>
                <% List<Tipoalerta> listTipoAlerta = (List<Tipoalerta>) session.getAttribute("lista");
                
                for(int i=0;i<listTipoAlerta.size();i++){
                    Tipoalerta talerta = listTipoAlerta.get(i);
                    String nombre = talerta.getTipoAlerta();
                    int id = talerta.getIdTipoAlerta();

                %>

                <h2>PROYECTO <%=id%></h2>
                <table class="table table-hover">
                    <tr>
                        <th>Nombre</th>
                        <th>FechaIniPrevista</th>
                        <th>FechaFinPrevista</th>
                        <th>FechaIniReal</th>
                        <th>FechaFinReal</th>

                    </tr>

                    <tr>
                        <th><%=nombre%></th>
                        <th></th>
                        <th></th>
                        <th></th>
                        <th></th>

                    </tr>
                </table>
               <%}%>


                <div class="line"></div>
            </div>
        </div>

        <!-- jQuery CDN - Slim version (=without AJAX) -->
        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
        <!-- Popper.JS -->
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.0/umd/popper.min.js" integrity="sha384-cs/chFZiN24E4KMATLdqdvsezGxaGsi4hLGOzlXwp5UZB1LY//20VyM2taTB4QvJ" crossorigin="anonymous"></script>
        <!-- Bootstrap JS -->
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.0/js/bootstrap.min.js" integrity="sha384-uefMccjFJAIv6A+rW+L4AHf99KvxDjWSu1z9VI8SKNVmz4sk7buKt/6v9KI65qnm" crossorigin="anonymous"></script>

        <script src="js/js.js"></script>
    </body>
</html>
