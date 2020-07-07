<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>




<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	
	<title>Cadastro - Ingressos</title>
	
	<spring:url value="/ingresso/salva" var="salva"></spring:url>
	<spring:url value="/ingresso/altera/" var="altera"></spring:url>
	<spring:url value="/ingresso/deleta/" var="deleta"></spring:url>
	
	<link href='<spring:url value="/frameworks/css/bootstrap.css" />' rel="styLesheet" />
	<script src= '<spring:url value ="/frameworks/js/jquery-3.3.1.min.js" />'></script> 
	<script src= '<spring:url value ="/frameworks/js/bootstrap.js" />' > </script>
</head>
<body>
	<div class="container"> <!-- essa classe vai centralizar o contéudo  da página -->
		<c:if test="${not empty mensagemErro  }">
			<div id="divMensagemErro" class="alert alert-danger" role="alert" >
				${mensagemErro}
			</div>
		</c:if>
		<c:if test="${not empty mensagemSucesso  }">
			<div id="divMensagemSucesso" class="alert alert-sucess" role="alert" >
				${mensagemSucesso}
			</div>
		</c:if>
		
		
		<div class ="pb-2 mt-4 mb-2 border-bottom"> <!--  page header -->
			<h1>Cadastro de Ingresso	</h1>
		</div>
	
		<form:form action="${salva}" modelAttribute="ingresso" cssClass="mb-2">
			<form:hidden path="id"/>
			
			<div class="form-group">
				<label>Quantidade:</label>
				<form:input path="quantidade" cssClass="form-control"/>
			</div>
			
			<div class="form-group">		
				<label>Valor unitário:</label>
				<form:input path="valor_unitario" cssClass="form-control"/>
			</div>
			
				<br />
			<input type="submit" class="btn btn-primary" name="salva" value="${ingresso.id == 0 ? 'Cadastrar' : 'Alterar'}" />
			<c:if test="${ingresso.id ne 0 }"> <!-- ne = not equals - o JSTL pergunta se o id do produto é diferente de 0 -->
				<input type="submit" class="btn btn-primary" name="cancela" value="Cancelar"/>
			</c:if>
		
			
		
		</form:form>
		<c:if test="${not empty ingressos}"> <!-- cabeçalho que mostra a tabela, quando tiver dados inseridos -->
		<table class="table table-striped">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Código</th>
					<th scope="col">Quantidade</th>
					<th scope="col">Valor unitário</th>
					<td scope="col" colspan="2">Ações</td>
				</tr>
			</thead>
			<tbody>	
				<c:forEach var="ingresso" items="${ingressos}">
					<tr>
						<td>${ingresso.id}</td>
						<td>${ingresso.quantidade}</td>
						<td>${ingresso.valor_unitario}</td>
						<td><a href="${altera}${ingresso.id}" class="btn btn-warning">Alterar</a></td>
						<td><a href="${deleta}${ingresso.id}" class="btn btn-danger"onclick="return confirm('Deseja deletar esse ingresso?');">Excluir</a></td>
					</tr>
				</c:forEach>
			</tbody>
			</table>
			</c:if>
		</div>
		<script type="text/javascript">
			$(document).ready(fuction()){
				//na div da id (#)divMensagemErro
				//terá uma espera (delay) de 5 secs (5000ms)
				//será feito um fadeOut lento (frescura)
				$('#divMensagemErro').delay(5000).fadeOut('slow');
				$('#divMensagemSucesso').delay(5000).fadeOut('slow');
			}
		
		
		</script>
	
	

</body>
</html>