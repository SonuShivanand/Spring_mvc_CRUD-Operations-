<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib prefix="x" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit</title>
</head>
<body>
<x:form action="update" modelAttribute="emp" method="post">
Name : <x:input path="name"/><br>
ID:    <x:input path="id" readonly="true"/><br>
Email :<x:input path="email"/><br>
Mobile :<x:input path="mobile"/><br>
Password : <x:input path="password"/><br>
<x:button>Update</x:button>
</x:form>
</body>
</html>