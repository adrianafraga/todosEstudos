<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>




<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	
	<title>Cadastro - Compra</title>
	
	<spring:url value="/compra/salva" var="salva"></spring:url>
	<spring:url value="/compra/altera/" var="altera"></spring:url>
	<spring:url value="/compra/deleta/" var="deleta"></spring:url>
	
	<link href='<spring:url value="/frameworks/css/bootstrap.css" />' rel="styLesheet" />
	<script src= '<spring:url value ="/frameworks/js/jquery-3.3.1.min.js" />'></script> 
	<script src= '<spring:url value ="/frameworks/js/bootstrap.js" />' > </script>

<body>
	
	<div class="container">
		<div class="row">
           <div class="col-md-12">
				 <!-- essa classe vai centralizar o contéudo  da página -->
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
				</div>
			</div>
		</div>
		
		<div class ="pb-2 mt-4 mb-2 border-bottom"> <!--  page header -->
			<h1>Compra de Ingressos	</h1>
		</div>
	
		<form:form action="${salva}" modelAttribute="compra" cssClass="mb-2">
			<form:hidden path="id"/>
			
			<div class="form-group">
				<label>Valor:</label>
				<form:input path="valor" cssClass="form-control"/>
			</div>
			
			<div class="form-group">		
				<label>Data Venda:</label>
				<form:input path="data_venda" cssClass="form-control"/>
				<input type="date" class="form-control" name="data_venda" value="${compra.data_venda}" />
			</div>
			
			<div class="form-group">
			<label>Status:</label>
			<form:input path="status" cssClass="form-control"/>
		
			<div class="form-group">	
				<label>Observação:</label>
				<form:input path="observacao" cssClass="form-control"/>
			</div>
			
			
			<br />
			<input type="submit" class="btn btn-primary" name="salva" value="${compra.id == 0 ? 'Cadastrar' : 'Alterar'}" />
			<c:if test="${compra.id ne 0 }"> <!-- ne = not equals - o JSTL pergunta se o id do produto é diferente de 0 -->
				<input type="submit" class="btn btn-primary" name="cancela" value="Cancelar"/>
			</c:if>
		
			
		
		</form:form>
		<c:if test="${not empty compras }"> <!-- cabeçalho que mostra a tabela, quando tiver dados inseridos -->
		<table class="table table-striped">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Valor</th>
					<th scope="col">Data da Venda</th>
					<th scope="col">Status</th>
					<th scope="col">Observação</th>
					<td scope="col" colspan="2">Ações</td>
				</tr>
			</thead>
			<tbody>	
				<c:forEach var="compra" items="${compras}">
					<tr>
						<td>${compra.id}</td>
						<td>${compra.valor}</td>
						<fmt:parseDate value="${cliente.data_venda}" type="date" pattern="yyyy-MM-dd" var="dtParsed" />
						<fmt:formatDate value="${dtParsed}" type="date" pattern="dd/MM/yyyy" var="dtTratada" />
						<td>${dtTratada}</td>
						<!-- <td>${compra.data_venda}</td>  -->
						<td>${compra.status}</td>
						<td>${compra.observacao}</td>
						<td><a href="${altera}${compra.id}" class="btn btn-warning">Alterar</a></td>
						<td><a href="${deleta}${compra.id}" class="btn btn-danger"onclick="return confirm('Deseja deletar essa compra?');">Excluir</a></td>
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
		</head>
	</body>
</html>