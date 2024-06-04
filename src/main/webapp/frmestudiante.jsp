<%-- 
    Document   : frmestudiante
    Created on : 4 jun. 2024, 16:43:01
    Author     : Villalba
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Formulario</title>
    </head>
    <body>
        <h1>Formulario de estudiantes</h1>
        <form action="MainController" method="post">
            <input type="hidden" name="id" value="${estudiante.id}">
            <label>Nombre: </label>
            <input type="text" name="nombre" value="${estudiante.nombre}">
            <br>
            <label>Apellidos: </label>
            <input type="text" name="apellidos" value="${estudiante.apellidos}">
            <br>
            <label>Email: </label>
            <input type="email" name="email" value="${estudiante.email}">
            <br>
            <label>Fecha de Nacimiento: </label>
            <input type="date" name="fechaNacimiento" value="${estudiante.fechaNacimiento}">
            <br>
            <button type="submit">Guardar</button>
        </form>
    </body>
</html>

