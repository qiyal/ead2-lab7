<header>
    <nav class="ul-flex">
        <div>
            <a class="header-link" href="./">Home</a>
            <a class="header-link" href="./profile">Profile</a>
        </div>
        <div>
            <%
                if (session.getAttribute("IS_AUTH") != null) {
            %>
                <a class="header-link" href="./logout">Logout</a>
            <%  } else { %>
                <a class="header-link" href="./login">Login</a>
            <%
                }
            %>
        </div>
    </nav>
</header>
