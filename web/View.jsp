<%@ page import="test.vo.UserVo" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="test.Dao.UserDao" %>
<%--
  Created by IntelliJ IDEA.
  User: Anjinc
  Date: 2018/5/2 0002
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%ArrayList<UserVo> list = (ArrayList<UserVo>)(request.getAttribute("list")); %>
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
<form  action="SelectStudent" method="post" action="" id="listform">
    <div class="panel admin-panel">
        <div class="panel-head"><strong class="icon-reorder"> 查看学生信息</strong> <a href="" style="float:right; display:none;">添加字段</a></div>
        <div class="padding border-bottom">
            <ul class="search" style="padding-left:10px;">
                <li> <a class="button border-main icon-plus-square-o" href="addstudent.jsp"> 添加内容</a> </li>
                <li>搜索：</li>
                <li>
                    <input type="text" placeholder="请输入搜索关键字" name="keywords" class="input" style="width:250px; line-height:17px;display:inline-block" />
                    <a href="javascript:void(0)" class="button border-main icon-search" onclick="changesearch()" > 搜索</a></li>
            </ul>
        </div>
        <table class="table table-hover text-center">
            <tr>
                <th width="100" style="text-align:left; padding-left:38px;">ID</th>
                <td></td>
                <th width="10%">学号</th>
                <th>姓名</th>
                <th>年龄</th>
                <th>性别</th>
                <th>系别</th>
                <th>电话</th>
                <th width="10%">更新时间</th>
                <th width="310">操作</th>
            </tr>

            <%for(int i = 0 ; i<list.size();i++) {

                UserVo user = list.get(i);%>

            <tr align="center" >
                <td><input type = "checkbox"  value ='<%=user.getUsername() %>' name="num"/></td>
                <td><a href="servlet/SelectStudent?Sid=<%=user.getSid()%>"></a></td>
                <td><%=user.getSid()%></td>
                <td><%=user.getSname()%></td>
                <td><%=user.getSage()%></td>
                <td><%=user.getSsex()%></td>
                <td><%=user.getSdept()%></td>
                <td><%=user.getStel()%></td>
                <td><%=user.getStime()%></td>

                <td>
                    <div class="button-group"> <a  href ="UpdataStudent?Sid=<%=user.getSid()%>"  class="button border-main" href="add.html"><span class="icon-edit"></span> 修改</a>
                        <a  href ="ServletDeleteUser?Sid=<%=user.getSid()%>" class="button border-red" href="javascript:void(0)" onclick="return del(1,1,1)"><span class="icon-trash-o"></span> 删除</a>
                </td>

            </tr>
            <%
                }
            %>
        </table>
    </div>
    <table align = "center" >
        <tr>
            <td style="text-align:left; padding:19px 0;padding-left:20px;"><a href="javascript:void(0)" style="padding:5px 15px; margin:0 10px;" class="button border-blue icon-edit" onclick="chickAll()"> 全选</a> </td>
            <td style="text-align:left; padding:19px 0;padding-left:20px;"><a href="javascript:void(0)" style="padding:5px 15px; margin:0 10px;" class="button border-blue icon-edit" onclick="Nochick()"> 反选</a> </td>
            <td style="text-align:left; padding:19px 0;padding-left:20px;"><a href="javascript:void(0)" class="button border-red icon-trash-o" style="padding:5px 15px;" onclick="DelSelect()"> 批量删除</a>

        </tr>
    </table>
</form>
<script type="text/javascript">

    //搜索
    function changesearch(){

    }

    //单个删除
    function del(id,mid,iscid){
        if(confirm("您确定要删除吗?")){

        }
    }

    function chickAll(){
        // 全选方法
        var chickobj = document.getElementsByName("num");
        for(var i = 0 ; i<chickobj.length ; i++){

            chickobj[i].checked = "checked";
        }
    }
    function Nochick(){
        // 反选方法
        var chickobj = document.getElementsByName("num");
        for(var i = 0 ; i<chickobj.length ; i++){

            chickobj[i].checked = !chickobj[i].checked ;
        }
    }

    //批量删除
    function DelSelect(){
        var Checkbox=false;
        $("input[name='id[]']").each(function(){
            if (this.checked==true) {
                Checkbox=true;
            }
        });
        if (Checkbox){
            var t=confirm("您确认要删除选中的内容吗？");
            if (t==false) return false;
            $("#listform").submit();
        }
        else{
            alert("请选择您要删除的内容!");
            return false;
        }
    }

</script>
</body>
</html>
