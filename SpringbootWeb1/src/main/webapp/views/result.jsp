<%-- For index2.jsp--%>
<%@ page language="java" %>
<html>
    <head>
        <title>Addition Form</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <h2>Welcome</h2>

        <p>${alien}</p>

        <p>Welcome to ${course} World</p>
    </body>
</html>


<%-- For index.jsp
<%@ page language="java" %>
<html>
    <head>
        <title>Addition Form</title>
        <link rel="stylesheet" type="text/css" href="style.css"> <%-- in static file it will be there as all the images stylis will be there--%>
    </head>
    <body>
        <%-- one way to use
        <h1>Result is: <%= session.getAttribute("result") %></h1> --%>


        <%--second way using jsp standard lib<h2>Result is : ${result}</h2>--%>
    </body>
</html>
--%>