<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <link href="./styles/main.css" rel="stylesheet" type="text/css">
    <title>Home Page</title>
</head>
<body>
    <%-- header.jsp --%>
    <%@ include file="header.jsp"%>

    <div class="flex-div flex-direct-column">
        <div class="flex-child">

            <%-- Post Card open --%>
            <div class="post-card">
                <a href="#">
                    <div class="post-title">Post Name</div>
                </a>

                <%-- Post Info Flex close --%>
                <div class="flex-post-info">

                    <div class="flex-post-info-child">
                        <span>100 likes</span>
                        <span>100 comments</span>
                    </div>

                    <div class="flex-post-info-child text-right">
                        <div>
                            <div>nico</div>
                            <div>21-05-2021</div>
                        </div>
                    </div>
                </div>
                <%-- Post Info Flex close --%>

            </div>
            <%-- Post Card open --%>

                <%-- Post Card open --%>
                <div class="post-card">
                    <a class="link" href="#">
                        <div class="post-title">Post Name</div>
                    </a>

                    <%-- Post Info Flex close --%>
                    <div class="flex-post-info">

                        <div class="flex-post-info-child">
                            <span>100 likes</span>
                            <span>100 comments</span>
                        </div>

                        <div class="flex-post-info-child">
                            <div>
                                <div>nico</div>
                                <div>21-05-2021</div>
                            </div>
                        </div>
                    </div>
                    <%-- Post Info Flex close --%>

                </div>
                <%-- Post Card open --%>

                <%-- Post Card open --%>
                <div class="post-card">
                    <a href="#">
                        <div class="post-title">Post Name</div>
                    </a>

                    <%-- Post Info Flex close --%>
                    <div class="flex-post-info">

                        <div class="flex-post-info-child">
                            <span>100 likes</span>
                            <span>100 comments</span>
                        </div>

                        <div class="flex-post-info-child text-right">
                            <div>
                                <div>nico</div>
                                <div>21-05-2021</div>
                            </div>
                        </div>
                    </div>
                    <%-- Post Info Flex close --%>

                </div>
                <%-- Post Card open --%>

        </div>
    </div>

    <h1><%= "Hello World!" %></h1>
    <br/>
    <a href="hello-servlet">Hello Servlet</a>


</body>
</html>