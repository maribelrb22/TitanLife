<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
<title>Menu</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<meta name="viewport" content="width=device-width; initial-scale=1.0">
<link rel="stylesheet" href="css/plantilla.css">
</head>
<body>
<div class="dropdown">
  <img src="images/pngocean.com.png" width=40 height=40 alt="Menú">
  <div class="dropdown-content">
  <p><a href="/conexionController?sesion=1">Inicio</a></p>
  <p><a href="/misObjetivosController">Mis Objetivos</a></p>
  <p><a href="/fatSecretCaloriesController">Mis Comidas</a></p>
  <p><a href="/youtubeVideosController">Mis Videos</a></p>
  <p><a href="strava.jsp">Mi Strava</a></p>
  <p><a href="perfil.jsp">Mi Perfil</a></p>
  <p><a href="/conexionController">Desconectar</a></p>
  </div>
</div>
</body>
</html>