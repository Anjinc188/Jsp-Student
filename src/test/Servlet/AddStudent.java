package test.Servlet;


import test.Dao.UserDao;
import test.vo.UserVo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddStudent extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");                                      // 设置编码格式为 UTF-8
        resp.setCharacterEncoding("utf-8");

        String Sid = req.getParameter("Sid");
        String Sname = req.getParameter("Sname");
        String Sage = req.getParameter("Sage");
        String Ssex = req.getParameter("Ssex");
        String Sdept = req.getParameter("Sdept");
        String Stel = req.getParameter("Stel");
        String Stime = req.getParameter("Stime");

        UserVo user = new UserVo();                                                             // 前台得到 用户输入数据
        user.setSid(Sid);
        user.setSname(Sname);
        user.setSage(Sage);
        user.setSsex(Ssex);
        user.setSdept(Sdept);
        user.setStel(Stel);
        user.setStime(Stime);
        UserDao userDao = new UserDao();
        userDao.UserStudent(user);
        req.getRequestDispatcher("/tips1.jsp").forward(req,                                 // 转到登录页面
                resp);
    }
}