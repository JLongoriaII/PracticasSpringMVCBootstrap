<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
<title>${Titulo}</title>
</head>
<body>
    <div class="container">
        <div class="rows">
            <div class="col-lg-6 col-md-6">
                <h2>${Texto}</h2>
                <form:form method="POST" action="${Texto}"> 
	                <div>
	                    <form:label path="idProducto">ID del Producto </form:label>
	                    <form:input cssClass="form-control" path="idProducto" readonly="true"/>
	                </div>  
	                <div>
	                    <form:label path="nombreProducto">Ingrese el Nombre del Producto </form:label>
	                    <form:input cssClass="form-control" path="nombreProducto" />
	                </div>    
	                <div>
	                	<form:label path="marcaProducto">Ingrese la Marca del Producto</form:label>
	                	<form:input cssClass="form-control" path="marcaProducto"/>
	                </div>
	                <div>
	                	<form:label path="precioProducto">Ingrese el Precio del Producto</form:label>
	                	<form:input cssClass="form-control" path="precioProducto"/>
	                </div>
	                <p>
	                	<div>
	                		<input class="btn btn-outline-success btn-block" type="submit" value="${Texto}"/>
	                	</div>
	                </p>
                </form:form>
            </div>
        </div>
    </div>

    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</body>
</html>