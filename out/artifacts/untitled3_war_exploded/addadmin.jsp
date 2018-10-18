<%--
  Created by IntelliJ IDEA.
  User: Anjinc
  Date: 2018/5/2 0002
  Time: 23:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="css/pintuer.css">
    <link rel="stylesheet" href="css/admin.css">
    <script src="js/jquery.js"></script>
    <script src="js/pintuer.js"></script>
</head>
<div class="panel admin-panel">
    <div class="panel-head"><strong><span class="icon-key"></span> 增加管理员</strong></div>
    <div class="body-content">
        <form   action="registered"  method="post" class="form-x" >
            <div class="form-group">
                <div class="label">
                    <label for="sitename">增加管理员：</label>
                </div>
                <div class="field">
                    <label style="line-height:33px;">
                        Hello
                    </label>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label for="sitename">用户名：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" id="mpass" name="Username" size="50" placeholder="请输入用户名" data-validate="required:请输入用户名" />
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label for="sitename">密码：</label>
                </div>
                <div class="field">
                    <input type="Password" class="input w50" name="Password" size="50" placeholder="请输入密码" data-validate="required:请输入密码,length#>=5:密码不能小于5位" />
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label for="sitename">确认密码：</label>
                </div>
                <div class="field">
                    <input type="Password" class="input w50" name="Password" size="50" placeholder="请再次输入密码" data-validate="required:请再次输入密码," />
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>

</body>
</html>

