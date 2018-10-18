<%--
  Created by IntelliJ IDEA.
  User: Anjinc
  Date: 2018/5/1 0001
  Time: 22:17
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
<body>
<div class="panel admin-panel">
    <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>修改学生信息 </strong></div>
    <div class="body-content">
        <form  action="UpdataStudent"  method="post" class="form-x">
            <div class="form-group">
                <div class="label">
                    <label>学生学号：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="Sid" value="${requestScope.Sid}"  data-validate="required:请输入学生姓名" />
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>学生姓名：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="Sname" value="${requestScope.Sname}"  data-validate="required:请输入学生姓名" />
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>学生年龄：</label>
                </div>
                <div class="field">
                    <script src="js/laydate/laydate.js"></script>
                    <input type="text" class="input w50"  name="Sage"  value="${requestScope.Sage}" data-validate="required:请输入年龄" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>性别：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50"  name="Ssex"  value="${requestScope.Ssex}" data-validate="required:请输入性别" />
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>系别：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50"  name="Sdept"  value="${requestScope.Sdept}" data-validate="required:请输入系别" />
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>电话：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="Stel"  value="${requestScope.Stel}"  data-validate="required:请输入电话" />
                    <div class="tips"></div>
                </div>
            </div>

            <div class="form-group">
                <div class="label">
                    <label>更新时间：</label>
                </div>
                <div class="field">
                    <input type="text" class="input w50" name="Stime"   value="${requestScope.Stime}"  data-validate="required:请输入更新时间" />
                    <div class="tips"></div>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                    <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
                </div>
            </div>
    </div>
    </form>
</div>
</body>
</html>