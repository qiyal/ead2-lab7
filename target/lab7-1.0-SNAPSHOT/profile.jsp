<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<html>
<head>
    <link href="./styles/main.css" rel="stylesheet" type="text/css">
    <title>Profile Page</title>
</head>
<body>
    <%-- header.jsp --%>
    <%@ include file="header.jsp"%>

    <dif class="flex-profile">

        <div class="profile-avatar-child">
            <div class="profile-img-box">
                <img class="img-avatar" src="./images/avatar/ava_img1.jpg" alt="avatar avatar image">
            </div>

            <div class="create-new-post-btn-box">
                <a class="new-post-btn" href="#">New post</a>
            </div>
        </div>

        <div class="profile-info-child flex-direct-column">
            <div class="user-info-field">Name: <span>nico</span></div>
            <div class="user-info-field">Username: <span>nico</span></div>
            <div class="user-info-field">Posts: <span>1</span></div>
        </div>
    </dif>
</body>
</html>
