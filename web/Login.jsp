<%--
  Created by IntelliJ IDEA.
  User: Anjinc
  Date: 2018/4/28 0028
  Time: 22:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String message = (String)(request.getAttribute("message")); %>
<html>
<head>
    <title>登录</title>
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>
</head>
<body>
<div class="bg"></div>
<div class="container">
    <div class="line bouncein">
        <div class="xs6 xm4 xs3-move xm4-move">
            <div style="height:150px;"></div>
            <div class="media media-y margin-big-bottom">
            </div>
            <form action="/Login" method="post">
                <div class="panel loginbox">
                    <div class="text-center margin-big padding-big-top"><h1>学生管理系统中心</h1></div>
                    <div class="panel-body" style="padding:30px; padding-bottom:10px; padding-top:10px;">
                        <div class="form-group">
                            <div class="field field-icon-right">
                                <input type="text" class="input input-big" name="Username" placeholder="登录账号" data-validate="required:请填写账号" />
                                <span class="icon icon-user margin-small"></span>
                            </div>
                        </div>
                        <div class="form-group">
                            <div class="field field-icon-right">
                                <input type="password" class="input input-big" name="Password" placeholder="登录密码" data-validate="required:请填写密码" />
                                <span style = "color: #0e0e0e; font-size:13px;" id = "td2"> ${message }</span>
                                <span class="icon icon-user margin-small"></span>
                            </div>
                        </div>
                    </div>
                    <div style="right: 45px; position: absolute; top: 400px;"><a href="registered.jsp">免费注册</a></div>
                    <div style="padding:30px;"><input type="submit" class="button button-block bg-main text-big input-big" value="登录"></div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
