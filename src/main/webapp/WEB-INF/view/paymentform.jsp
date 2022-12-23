<%--
  Created by IntelliJ IDEA.
  User: vananthraman
  Date: 12/22/22
  Time: 11:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Payment Information</title>
</head>
<body>
    <form:form action="processpayment" method="get" modelAttribute="paymentDto">
        <label>Name</label><form:input path="name"></form:input><form:errors path="name"></form:errors>
        <label>CreditCard</label><form:input path="creditCardDto"></form:input><form:errors path="creditCardDto"></form:errors>
        <label>Amount</label><form:input path="amountDto.amount"></form:input>
        <label>Currency</label><form:input path="amountDto.currencyCode"></form:input>
        <label>Date</label><form:input path="date"></form:input>
        <input type="submit" value="Submit Payment">
    </form:form>
</body>
</html>
