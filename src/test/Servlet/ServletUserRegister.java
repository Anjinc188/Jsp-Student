package test.Servlet;

import test.Dao.UserDao;
import test.vo.UserVo;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ServletUserRegister extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");                                                     // 设置编码格式为 UTF-8
        String Username = req.getParameter("Username");
        String Password = req.getParameter("Password");
        // 前台得到 用户输入数据

        UserVo user = new UserVo();

        user.setUsername(Username);
        user.setPassword(Password);                                                            // 将前台得到的数据存入ＶＯ
        UserDao userDao = new UserDao();                                                       // 实例化一个数据库操作对象
        UserDao.insertUser(user);                                                              // 调用增加用户方法
        req.getRequestDispatcher("/tips.jsp").forward(req,  resp);                             // 转到登录页面
    }
}
