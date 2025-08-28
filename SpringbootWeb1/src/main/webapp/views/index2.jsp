<%@ page language="java" %>
<html>
    <head>
        <title>Addition Form</title>
        <link rel="stylesheet" type="text/css" href="style.css">
    </head>
    <body>
        <h1>Sending data</h1>
        <form action="addAlien">
            <label for="aid"> Enter Id: </label>
            <input type="text" id="aid" name="aid"><br>
            <label for="aname"> Enter Name: </label>
            <input type="text" id="aname" name="aname"><br>
            <input type="submit" value="Submit">
        </form>
    </body>
</html>