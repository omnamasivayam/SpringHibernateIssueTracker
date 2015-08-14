<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Registration</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
  	<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css"/>
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
  	<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
  	<link rel="stylesheet" href="//code.jquery.com/ui/1.11.4/themes/smoothness/jquery-ui.css"/>
  	<script src="//code.jquery.com/jquery-1.10.2.js"></script>
  	<script src="//code.jquery.com/ui/1.11.4/jquery-ui.js"></script>
  	<script> 	
  	$('a').click(function(e){
  		e.preventDefault();
  		$("#content").load($(this).attr('href'));
  		});
    </script>
</head>
<body>
<!--div class="jumbotron">
    <h1>Issue Tracker</h1> 
    <p>Track Monthy Issues and check for Resolver/Inprogress Tickets accurately.</p> 
</div>
<div class="container">

<div class="row">
	
	<  div class="col-sm-4" >
		<ul class="nav nav-pills nav-stacked">
    		<li class="active"><a href="#">Task</a></li>
    		<li><a href="IssueHome.jsp">Add/Edit Ticket</a></li>
    		<li><a href="#">Check Status</a></li>
    		<li><a href="#">Highlights</a></li>
  		</ul>
	</div-->
	
    <div class="col-sm-4" >
        <form:form action="addIssue" method="post" commandName="issue">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Issue Submission</h2></td>
                </tr>
                <tr>
                    <td>Id:</td>
                    <td><form:input path="id" /></td>
                </tr>
                <tr>
                    <td>bug Id:</td>
                    <td><form:input path="bugId" /></td>
                </tr>
                <tr>
                    <td>Description:</td>
                    <td><form:input path="descr" /></td>
                </tr>
            	<tr>
                    <td>Status:</td>
                    <td><form:select path="status" items="${statusList}" /></td>
                </tr>
                
                <tr>
                    <td>Start Date (mm/dd/yyyy):</td>
                    <td><form:input path="openedDate" /></td>
                </tr>
                
                <tr>
                    <td colspan="2" align="center"><input type="submit" value="addIssue" /></td>
                </tr>
            </table>
        </form:form>
        </div>
         <!--div class="col-sm-4" >  
         </div>
        </div>
    </div-->
</body>
</html>