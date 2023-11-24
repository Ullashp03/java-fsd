<%@page import="com.Dao.ProductDAO"%>
<%@page import="com.jsp.pojo.Product"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1><i> deleted the product successfully with id <%=request.getParameter("id") %>...!</i></h1>
<form action="addproduct.jsp">
<input type="submit" value="addproduct"> 
</form>
<h1><i>List of Products </i></h1>
<table border="1">
<tr><th>Product Id</th><th>Product Name</th><th>Product Cost</th><th>Order date</th><th>Edit </th><th>Delete</th></tr>
<%
ProductDAO dao=new ProductDAO();
Product product=new Product();
product.setPid(Integer.parseInt(request.getParameter("id")));
List<Product> list=dao.delete(product);
for(Product pro:list){
%>
<tr>
<td><%=pro.getPid()%></td>
<td><%=pro.getPname()%></td>
<td><%=pro.getCost()%></td>
<td><%=pro.getOrderDate()%></td>
<td><a href="edit.jsp?id=<%=pro.getPid() %>">Edit</a></td>
<td><a href="delete.jsp?id=<%=pro.getPid() %>">Delete</a></td>
</tr>

<%} %>
</table>
</body>
</html>
