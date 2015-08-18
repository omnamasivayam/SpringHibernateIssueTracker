<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Registration</title>
		<c:import url="helpingFiles.jsp"/>
	</head>
<body>

<div>
	<c:import url="heading.jsp"/>
</div>

<div class="container">
	<div class="row">
		<div class="col-sm-4" >
			<c:import url="menu.jsp"/>
		</div>  
		
		<div class="col-sm-4" >
			<div class="form-group">
			<form:form action="addIssue" method="post" commandName="issue">
            <table border="0">
                <tr>
                    <td colspan="2" align="center"><h2>Issue Submission</h2></td>
                </tr>
                <tr>
                    <td>Id:</td>
                    <td><form:input path="id" class="form-control"  /></td>
                </tr>
                <tr>
                    <td>bug Id:</td>
                    <td><form:input path="bugId" class="form-control"  /></td>
                </tr>
                <tr>
                    <td>Description:</td>
                    <td><form:input path="descr" class="form-control" rows="5"/></td>
                </tr>
            	<tr>
                    <td>Status:</td>
                    <td><form:select path="status" items="${statusList}" class="form-control"/></td>
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
		</div>
		
		  
	</div>
</div>


</body>
</html>