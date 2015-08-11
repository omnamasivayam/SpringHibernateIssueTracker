<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Registration</title>
</head>
<body>
    <div align="center">
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
                    <td><form:input path="desc" /></td>
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
</body>
</html>