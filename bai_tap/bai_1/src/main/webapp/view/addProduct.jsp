<%--
  Created by IntelliJ IDEA.
  User: binh1
  Date: 02/08/2023
  Time: 3:26 CH
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style>
        form {
            padding: 20px;
            border: 2px solid red;
        }
    </style>
</head>
<body>
<form action="<%=request.getContextPath()%>/Home" method="post">
    <label for="name">Name: </label> <br>
    <input type="text" name="name" id="name" placeholder="name..."> <br>
    <label for="desc">Desc: </label> <br>
    <input type="text" name="desc" id="desc" placeholder="description..."> <br>
    <label for="price">Price: </label> <br>
    <input type="text" name="price" id="price" placeholder="price..."> <br>
    <button type="submit" name="action" value="ADD">ADD</button>
</form>
</body>
</html>
