<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<title> Ingressos Já</title>
			<link href='<spring:url value="/frameworks/css/bootstrap.css" />' rel="styLesheet" />
			<script src= '<spring:url value ="/frameworks/js/jquery-3.3.1.min.js" />'></script> 
			<script src= '<spring:url value ="/frameworks/js/bootstrap.js" />' > </script>
			
	
				<spring:url value="cliente/" var="cliente"></spring:url>
				<spring:url value="evento/" var="evento"></spring:url>
				<spring:url value="ingresso/" var="ingresso"></spring:url>
				<spring:url value="casashow/" var="casashow"></spring:url>
				<spring:url value="compra/" var="compra"></spring:url>
				<spring:url value="login/" var="login"></spring:url>
				
				
<body>
 <section class="index">
    <div class="container">
        <div class="row">
            <div class="col-md-12">

            </div>
        </div>
    </div>
</section>
<!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#">Ingressos Já</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Services</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Login</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
 
		
	
		
				
		
	<hr/>
	<a href="${cliente}"> Cliente</a><br>
	<a href="${evento}"> Evento</a><br>
	<a href="${ingresso}"> Ingresso</a><br>
	<a href="${casashow}"> Casa de Show</a><br>
	<a href="${compra}"> Compra</a><br>
	<a href="${login}"> Login</a><br>
	
	
</body>
</html>