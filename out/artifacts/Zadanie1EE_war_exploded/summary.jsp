<%@ page import="java.util.List" %>
<%@ page import="michal.model.Product" %><%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 24.05.2018
  Time: 15:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Podsumowanie</title>
</head>
<body>
<table border="4" style="width:50%"
       width="400">
    <caption >Twoje zakupy</caption>
    <tr>
        <th width="10">#</th>
        <th>Name</th>
        <th>Price</th>
    </tr>
    <%
        int i = 1;
        List<Product> products = (List<Product>) request.getAttribute("products");
        for (Product p : products) {
    %>
    <tr>
        <td><%=i%>
        </td>
        <td><%=p.getName()%>
        </td>
        <td><%=p.getPrice()%>
        </td>
    </tr>
    <%
            i++;
        }
    %>
</table>
<Strong><font size="10">Suma za zakupy: <%=request.getAttribute("summ")%></font></Strong><br>
<Strong><font size="10">Srednia cena produktu: <%=request.getAttribute("mean")%></font></Strong>
</body>
</html>
