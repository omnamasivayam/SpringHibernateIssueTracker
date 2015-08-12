<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>ISsue Added Success</title>
</head>
<body>
    <div align="center">
        <table border="0">
            <tr>
                <td colspan="2" align="center"><h2>Added Succeeded!</h2></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <h3>Thank you for adding! Here's the review of your details:</h3>
                </td>
            </tr>
            <tr>
                <td>User Name:</td>
                <td>${userForm.username}</td>
            </tr>
    		<tr>
                    <td>Id:</td>
                    <td>${IssueForm.id}</td>
                </tr>
                <tr>
                    <td>bug Id:</td>
                    <td>${IssueForm.bugId}</td>
                </tr>
                <tr>
                    <td>Description:</td>
                    <td>${IssueForm.descr}</td>
                </tr>
            	<tr>
                    <td>Status:</td>
                    <td>${IssueForm.status}</td>
                </tr>
                
                <tr>
                    <td>Start Date (mm/dd/yyyy):</td>
                    <td>>${IssueForm.openedDate}</td>
                </tr>
 
        </table>
    </div>
</body>
</html>