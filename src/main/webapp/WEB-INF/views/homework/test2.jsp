<%--
  Created by IntelliJ IDEA.
  User: ebseu
  Date: 2021-04-27
  Time: 오후 8:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <style>
        select {
            width: 200px;
        }
    </style>
</head>
<body>
<form method="post">
        <select name="num">
            <option value="one" ${ num == "one" ? "selected" : "" }> one </option>
            <option value="two" ${ num == "two" ? "selected" : "" }> two </option>
            <option value="three" ${ num == "three" ? "selected" : "" }> three </option>
        </select>
    <br>
        <input type="text" value=" ${ num }">
    <br>
        <button type="submit">Ok</button>
</form>

</body>
</html>
