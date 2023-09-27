<html>
<body>
	<%
     String name=(String)  request.getAttribute("username");
     String mobile=(String) request.getAttribute("mobile");
     String email=(String) request.getAttribute("email"); 
           %>
	<%=name%>
	<br>
	<%=mobile%>
	<br>
	<%=email%>
	<HR>
	<p>can be printed using JSTL JSP STANDARD TAG LIBRARY</p>
	${username}
	<br> ${mobile}
	<br> ${email}
</body>

</html>