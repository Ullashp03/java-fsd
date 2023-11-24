<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.jsp.pojo.Product"%>
<%@page import="com.Dao.ProductDAO"%>
<%@page import="java.util.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
ProductDAO dao=new ProductDAO();
Product product=new Product();
product.setPname(request.getParameter("pname"));
product.setCost(Float.parseFloat(request.getParameter("pcost")));
//in util Mon Nov 13 11:55:06 IST 2023  in dB sql - yyyy-MM-dd =>convert the date into a sql 
SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
Date orderdate=dateFormat.parse(request.getParameter("pdate"));
product.setOrderDate(orderdate);
int row=dao.addproduct(product);
if(row>0){
	response.sendRedirect("success.jsp");
	
}
else{
	response.sendRedirect("fail.jsp");
}
%>
</body>
</html>

