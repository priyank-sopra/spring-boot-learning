<html>
    <head>
      <%          
    String n=(String)     request.getAttribute("name");
    int x=(Integer)request.getAttribute("mobile");
    String y=(String)request.getAttribute("address");
    out.println("<br><br>");
        %>
    <p><b> Welcome Your Name is   </b> <%=n%></p>
    <p><i>Mobile </i><%=x%></p>
    <p>Your Address is <%=y%> </p>
    </body>
</html>