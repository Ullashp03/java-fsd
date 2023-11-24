<%@ page language="java" contentType="text/html; charset=ISO-8859-1"     pageEncoding="ISO-8859-1"%> 
  <%@ page import="com.pojo.Product" %>   
  <%@ page import="javax.servlet.http.HttpSession" %>   <% 
    HttpSession sessionObj = request.getSession(); 
    Product product = (Product) sessionObj.getAttribute("product"); 
%> 
<!DOCTYPE html> 
<html> 
<head> 
<meta charset="ISO-8859-1"> 
<title>Product Details</title> 
</head> 
<body> 
 <h2>Product Details</h2> 
     
    <%-- Retrieve product from session --%> 
 
    <%-- Display product details --%> 
    <% if (product != null) { %> 
        <p>Name: <%= product.getpName() %></p> 
        <p>Price: Rs<%= product.getpCost() %></p> 
        <p>Quantity: <%= product.getpQuantity() %></p> 
    <% } else { %> 
        <p>No product details available.</p> 
    <% } %> 
 
    <p><a href="ProductForm.jsp">Go back to the form</a></p> 
</body> 
</html> 
