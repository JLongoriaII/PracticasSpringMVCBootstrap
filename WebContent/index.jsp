<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<!--<link rel="stylesheet" href="${pageContext.request.contextPath}/WebContent/public/css/StyleGeneral.css"> -->
<!--<link rel="stylesheet" href="<c:url value="public/css/StyleGeneral.css"/>"> -->
<title>Pagina Principal</title>
</head>
<body>
    
    <h1>Practica Spring MVC & Bootstrap</h1>
    <p>
    <div class="container">
        <div class="rows">
            <div class="col-lg-6 col-md-6">
                <div id="MainOptions">
                    <div class="card">
                        <div class="card-header">
                            <a class="card-link" href="#collapseOne" data-toggle="collapse">Operaciones</a>
                        </div>
                        <div class="collapse" id="collapseOne" data-parent="#accordion">
                            <div class="card-body">
                                <ul class="list-group">
                                    <a href="irSuma" class="list-group-item list-group-item-action">Sumar Numeros</a>
                                    <a href="irResta" class="list-group-item list-group-item-action">Restar Numeros</a>
                                    <a href="irMultiplicacion" class="list-group-item list-group-item-action">Multiplicar Numeros</a>
                                    <a href="irDivision" class="list-group-item list-group-item-action">Dividir Numeros</a>
                                </ul>
                            </div>
                        </div>
                    </div>

                    <div class="card">
                        <div class="card-header">
                            <a class="card-link" href="#collapseTwo" data-toggle="collapse">Formulario</a>
                        </div>
                        <div class="collapse" id="collapseTwo" data-parent="#accordion">
                            <div class="card-body">
                                <a href="irFormulario" class="list-group-item list-group-item-action">Llenar Formulario</a>
                            </div>
                        </div>
                    </div>

                    <div class="card">
                        <div class="card-header">
                            <a class="card-link" href="#collapseThree" data-toggle="collapse">CRUD</a>
                        </div>
                        <div class="collapse" id="collapseThree" data-parent="#accordion">
                            <div class="card-body">
                                <a href="irAgregar" class="list-group-item list-group-item-action">Agregar Producto</a>
                                <a href="irBuscarActualizar" class="list-group-item list-group-item-action">Actualizar Producto</a>
                                <a href="irBorrar" class="list-group-item list-group-item-action">Borrar Producto</a>
                                <a href="#irMostrar" class="list-group-item list-group-item-action" data-toggle="collapse">Mostrar Productos</a>
                                <div class="collapse" id="irMostrar" data-parent="#accordion">
                                    <div class="card-body">
                                        <a href="irConsultar" class="list-group-item list-group-item-action">Mostrar Producto Individual</a>
                                        <a href="irConsultaGeneral" class="list-group-item list-group-item-action">Mostrar Todos los Productos</a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    </p>
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>