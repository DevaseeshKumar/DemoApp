<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.demo.app.model.Model" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>View Models</title>
</head>
<body>
    <h2>All Models</h2>
    
    <table border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
        </tr>
        
        <%
            List<Model> models = (List<Model>) request.getAttribute("models");
            if (models != null) {
                for (Model model : models) {
        %>
        <tr>
            <td><%= model.getId() %></td>
            <td><%= model.getName() %></td>
            <td><%= model.getEmail() %></td>
        </tr>
        <% 
                }
            }
        %>
    </table>
</body>
</html>
