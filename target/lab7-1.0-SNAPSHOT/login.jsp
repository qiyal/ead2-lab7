<%@ page import="com.example.lab7.my_enums.ErrorEnum" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%

%>

<html>
<head>
    <link href="./styles/main.css" rel="stylesheet" type="text/css">
    <title>Login Page</title>
</head>
<body>

    <%-- header.jsp --%>
    <%@ include file="header.jsp"%>

    <div class="login-page-box">

        <div>
            <div class="login-form-box">
                <form class="login-form" action="login" method="post">
                    <label for="username">Username: </label>
                    <input type="text" id="username" name="username">

                    <br><br>

                    <label for="password">Password:</label>
                    <input type="password" id="password" name="password">

                    <button type="submit">Log in</button>
                </form>
            </div>

            <%
                if (request.getParameter("error") != null && request.getParameter("error").equals(ErrorEnum.NOT_CORRECT_DATA.toString())) {
            %>
            <p class=error>Username or password is not correct!</p>
            <% } %>
        </div>
    </div>

</body>
</html>
