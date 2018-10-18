package test.Servlet;

import test.Dao.UserDao;
import test.vo.UserVo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class UpdatePassword extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");

        String Username=((UserVo)req.getSession().getAttribute("user")).getUsername();
        String Password=req.getParameter("Password");

        UserVo user=new UserVo();
        user.setUsername(Username);
        user.setPassword(Password);
        UserDao userDao=new UserDao();
        userDao.updatePassword(user);
        req.getRequestDispatcher("tips.jsp").forward(req,resp);

    }
}
