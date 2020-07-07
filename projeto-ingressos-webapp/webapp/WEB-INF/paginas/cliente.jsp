<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>




<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	
	<title>Cadastro - Cliente</title>
	
	<spring:url value="/cliente/salva" var="salva"></spring:url>
	<spring:url value="/cliente/altera/" var="altera"></spring:url>
	<spring:url value="/cliente/deleta/" var="deleta"></spring:url>
	
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
			<h1>Cadastro de Cliente	</h1>
		</div>
	
		<form:form action="${salva}" modelAttribute="cliente" cssClass="mb-2">
			<form:hidden path="id"/>
			
			<div class="form-group">
				<label>Nome:</label>
				<input type="text" name="nome" class="form-control" value="${cliente.nome}"/>
			</div>
			
			<div class="form-group">		
				<label>CPF:</label>
				<input type="text" name="cpf" class="form-control" value="${cliente.cpf}"/>
			</div>
			
			<div class="form-group">
			<label>Data de Nascimento:</label>
			<input type="date" class="form-control" name="dt_nascimento" value="${cliente.dt_nascimento}" />
			<!--<form:input path="dt_nascimento" cssClass="form-control"/> -->
		
			<div class="form-group">	
				<label>Endereço:</label>
				<input type="text" name="endereco" class="form-control" value="${cliente.endereco}"/>
			</div>
			
			<div class="form-group">
				<label>Numero:</label>
				<input type="text" name="numero" class="form-control" value="${cliente.numero}"/>
			</div>
			
			<div class="form-group">
				<label>CEP:</label>
				<input type="text" name="cep" class="form-control" value="${cliente.cep}"/>
			</div>
			
			<div class="form-group">
				<label>Complemento:</label>
				<input type="text" name="complemento" class="form-control" value="${cliente.complemento}"/>
			</div>
			
			<div class="form-group">
				<label>Cidade:</label><br/>
				<input type="text" name="cidade" class="form-control" value="${cliente.cidade}"/>
			</div>
			
			<div class="form-group">
				<label>Estado:</label><br/>
				<input type="text" name="estado" class="form-control" value="${cliente.estado}" />
			</div>
			
			<div class="form-group">
				<label>Email:</label><br/>
				<input type="text" name="email" class="form-control" value="${cliente.email}"/>
			</div>
			
			<div class="form-group">
				<label>Senha:</label><br/>
				<input type="text" name="senha" class="form-control" value="${cliente.senha}"/>
			</div>
			
			<br />
			<input type="submit" class="btn btn-primary" name="salva" value="${cliente.id == 0 ? 'Cadastrar' : 'Alterar'}" />
			<c:if test="${cliente.id ne 0 }"> <!-- ne = not equals - o JSTL pergunta se o id do produto é diferente de 0 -->
				<input type="submit" class="btn btn-primary" name="cancela" value="Cancelar"/>
			</c:if>
		
			
		
		</form:form>
		<c:if test="${not empty clientes}"> <!-- cabeçalho que mostra a tabela, quando tiver dados inseridos -->
		<table class="table table-striped">
			<thead class="thead-dark">
				<tr>
					<th scope="col">Código</th>
					<th scope="col">Nome</th>
					<th scope="col">CPF</th>
					<th scope="col">Data de Nascimento</th>
					<th scope="col">Endereço</th>
					<th scope="col">Número</th>
					<th scope="col">CEP</th>
					<th scope="col">Complemento</th>
					<th scope="col">Cidade</th>
					<th scope="col">Estado</th>
					<th scope="col">Email</th>
					<th scope="col">Senha</th>
					<td scope="col" colspan="2">Ações</td>
				</tr>
			</thead>
			<tbody>	
				<c:forEach var="cliente" items="${clientes}">
					<tr>
						<td>${cliente.id}</td>
						<td>${cliente.nome}</td>
						<td>${cliente.cpf}</td>
						<fmt:parseDate value="${cliente.dt_nascimento}" type="date" pattern="yyyy-MM-dd" var="dtParsed" />
						<fmt:formatDate value="${dtParsed}" type="date" pattern="dd/MM/yyyy" var="dtTratada" />
						<td>${dtTratada}</td>
						<!-- <td>${cliente.dt_nascimento}</td>  -->
						<td>${cliente.endereco}</td>
						<td>${cliente.numero}</td>
						<td>${cliente.cep}</td>
						<td>${cliente.complemento}</td>
						<td>${cliente.cidade}</td>
						<td>${cliente.estado}</td>
						<td>${cliente.email}</td>
						<td>${cliente.senha}</td>
						<td><a href="${altera}${cliente.id}" class="btn btn-warning">Alterar</a></td>
						<td><a href="${deleta}${cliente.id}" class="btn btn-danger"onclick="return confirm('Deseja deletar esse cliente?');">Excluir</a></td>
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