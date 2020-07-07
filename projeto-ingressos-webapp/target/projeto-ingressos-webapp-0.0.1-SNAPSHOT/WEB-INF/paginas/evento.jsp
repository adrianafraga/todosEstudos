<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>




<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	
	<title>Cadastro - Evento</title>
	
	<spring:url value="/evento/salva" var="salva"></spring:url>
	<spring:url value="/evento/altera/" var="altera"></spring:url>
	<spring:url value="/evento/deleta/" var="deleta"></spring:url>
	
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
			<h1>Cadastro de Evento	</h1>
		</div>
	
		<form:form action="${salva}" modelAttribute="evento" cssClass="mb-2">
			<form:hidden path="id"/>
			
			<div class="form-group">
				<label>Nome:</label>
				<form:input path="nome" cssClass="form-control"/>
			</div>
			
			<div class="form-group">		
				<label>Endereço:</label>
				<form:input path="endereco" cssClass="form-control"/>
			</div>
			
			<div class="form-group">
			<label>Numero:</label>
			<form:input path="numero" cssClass="form-control"/>
		
			<div class="form-group">	
				<label>CEP:</label>
				<form:input path="cep" cssClass="form-control"/>
			</div>
			
			<div class="form-group">
				<label>Cidade:</label>
				<form:input path="cidade" cssClass="form-control"/>
			</div>
			
			<div class="form-group">
				<label>Estado:</label>
				<form:input path="estado" cssClass="form-control"/>
			</div>
			
			<div class="form-group">
				<label>Descrição:</label>
				<form:input path="descricao" cssClass="form-control"/>
			</div>
			
			<div class="form-group">
				<label>Data do Evento:</label><br/>
				<form:input path="data_evento" cssClass="form-control"/>
			</div>
			
			<div class="form-group">
				<label>Faixa Etária:</label><br/>
				<form:input path="faixa_etaria" cssClass="form-control"/>
			</div>
			
			<div class="form-group">
				<label>Folder:</label><br/>
				<form:input path="folder" cssClass="form-control"/>
			</div>
			
			<br />
			<input type="submit" class="btn btn-primary" name="salva" value="${evento.id == 0 ? 'Cadastrar' : 'Alterar'}" />
			<c:if test="${evento.id ne 0 }"> <!-- ne = not equals - o JSTL pergunta se o id do produto é diferente de 0 -->
				<input type="submit" class="btn btn-primary" name="cancela" value="Cancelar"/>
			</c:if>
		
			
		
		</form:form>
		<c:if test="${not empty eventos }"> <!-- cabeçalho que mostra a tabela, quando tiver dados inseridos -->
		<table class="table table-striped">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Código</th>
					<th scope="col">Nome do evento</th>
					<th scope="col">Endereço</th>
					<th scope="col">Número</th>
					<th scope="col">CEP</th>
					<th scope="col">Cidade</th>
					<th scope="col">Estado</th>
					<th scope="col">Descrição</th>
					<th scope="col">Data do evento</th>
					<th scope="col">Faixa Etária</th>
					<th scope="col">Folder</th>
					<td scope="col" colspan="2">Ações</td>
				</tr>
			</thead>
			<tbody>	
				<c:forEach var="evento" items="${eventos}">
					<tr>
						<td>${evento.id}</td>
						<td>${evento.nome}</td>
						<td>${evento.endereco}</td>
						<td>${evento.numero}</td>
						<td>${evento.cep}</td>
						<td>${evento.cidade}</td>
						<td>${evento.estado}</td>
						<td>${evento.descricao}</td>
						<td>${evento.data_evento}</td>
						<td>${evento.faixa_etaria}</td>
						<td>${evento.folder}</td>
						<td><a href="${altera}${evento.id}" class="btn btn-warning">Alterar</a></td>
						<td><a href="${deleta}${evento.id}" class="btn btn-danger"onclick="return confirm('Deseja deletar esse evento?');">Excluir</a></td>
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