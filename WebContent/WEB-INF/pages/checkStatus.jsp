<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>   
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<title>Registration</title>
		<c:import url="helpingFiles.jsp"/>
		<script type="text/javascript">
		var inprogress = <%=request.getAttribute("inprogress")%>;
		var resolved = <%=request.getAttribute("resolved")%>;
		var awaitingfeedback = <%=request.getAttribute("awaitingfeedback")%>;
		var closed = <%=request.getAttribute("closed")%>;
  window.onload = function () {
    var chart = new CanvasJS.Chart("chartContainer",
    {
      title:{
        text: "This Month Report"    
      },
      animationEnabled: true,
      axisY: {
        title: "Number of Tickets"
      },
      legend: {
        verticalAlign: "bottom",
        horizontalAlign: "center"
      },
      theme: "theme2",
      data: [

      {        
        type: "column",  
        showInLegend: true, 
        legendMarkerColor: "grey",
        legendText: "Status",
        dataPoints: [      
        {y: inprogress, label: "Inprogress"},
        {y: closed,  label: "Closed" },
        {y: resolved,  label: "Resolved"},
        {y: awaitingfeedback,  label: "Awaitng feedback"},        
       
        ]
      }   
      ]
    });

    chart.render();
  }
  </script>
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
		
		<div class="col-sm-8" >

			<div id="chartContainer" style="height: 300px; width: 100%;"></div>

		</div> 
		  
	</div>
</div>


</body>
</html>