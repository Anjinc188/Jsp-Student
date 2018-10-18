package test.Servlet;
import test.Dao.UserDao;
import test.vo.UserVo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class UserloginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String  Username = req.getParameter("Username");
        String  Password =  req.getParameter("Password");                //前台得到用户输入
        UserDao userDao =new UserDao();
        UserVo user = UserDao.judgePassword(Username,Password);

        // 调用方法判断用户是否存在
        String message = "用户名或密码错误！";

        if (user == null ){//如果用户名不存在
            req.setAttribute("message",message);
            req.getRequestDispatcher("/Login.jsp").forward(req,resp);

        } else {//如果用户名存在,检索数据,调到后台管理中心页面
            ArrayList<UserVo> list =UserDao.selectNotDeleteList();
            req.setAttribute("list", list);
            req.getSession().setAttribute("user", user);
            req.getRequestDispatcher("index.html").forward(req,resp);

        }
    }
}

