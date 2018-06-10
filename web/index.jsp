<%--
  Created by IntelliJ IDEA.
  User: Student
  Date: 24.05.2018
  Time: 15:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Sklep internetowy</title>
  </head>
  <body>
  <h1>Sklep ze wszystkim</h1>
  <h2>Wpisz nazwy i ceny produktów, które chcesz kupić:</h2>

  <form method="post" action="controller">
    <input type="text" name="product1" placeholder="Produkt 1">
    <input type="text" name="price1" placeholder="cena"><br>
    <input type="text" name="product2" placeholder="Produkt 2">
    <input type="text" name="price2" placeholder="cena"><br>
    <input type="text" name="product3" placeholder="Produkt 3">
    <input type="text" name="price3" placeholder="cena"><br>
    <input type="text" name="product4" placeholder="Produkt 4">
    <input type="text" name="price4" placeholder="cena"><br>
    <input type="submit" value="Kup Teraz">
  </form>
  </body>
</html>
