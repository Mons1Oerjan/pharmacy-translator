<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<link rel="stylesheet" href="resources/css/bootstrap.min.css"/>         
<script src="resources/js/bootstrap.min.js"></script>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring 4 MVC -HelloWorld</title>
</head>
<body>
	<center>
		<h2>Pharmacy Language</h2>
	</center>
	<br>
	<br>
	
<form class="form-horizontal" action="hello" method="get" id="seachEmployeeForm" role="form">
    <div class="form-group">
	  <label class="control-label col-sm-2" for="inputcode">Input Code:</label>
	  <div class="col-sm-2">
      <input type="text" name="inputcode" id="inputcode" class="form-control" required="true" placeholder="SD1002033"/>
      </div>
    </div>
    <div class="form-group">
      <label class="control-label col-sm-2" for="language">Language:</label>
      <div class="col-sm-2">          
        <select class="form-control" name="langauge">
        	<c:forEach var="item" items="${languages}">
        		<option value="${item.getId()}">${item.getName()}</option>
    		</c:forEach>
	  </select>
      </div>
    </div>
    <div class="form-group">        
      <div class="col-sm-offset-2 col-sm-10">
        <button type="submit" class="btn btn-default"> <span class="glyphicon glyphicon-play"></span> Enter</button>
      </div>
    </div>
</form>
<div class="col-sm-12">
	<div class="panel panel-default col-sm-6">
	  <div class="panel-heading">Note</div>
	  <div class="panel-body">
	    ${note}
	  </div>
	</div>
	<div class="panel panel-default col-sm-6">
	  <div class="panel-heading">Translated Note</div>
	  <div class="panel-body">
	    ${translatednote}
	  </div>
	</div>
</div>
</body>
</html>