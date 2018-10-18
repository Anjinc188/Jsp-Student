package test.Servlet;

import test.Dao.UserDao;
import test.vo.UserVo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class ServletDeleteUser extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int Sid=Integer.parseInt(req.getParameter("Sid"));
        UserDao userDao=new UserDao();
        userDao.deleteOneUser(Sid);
        ArrayList<UserVo>list=userDao.selectNotDeleteList1();
        req.setAttribute("list",list);
        req.getRequestDispatcher("/SelectStudent").forward(req,resp);
    }

}
