package test.Servlet;

import test.Dao.UserDao;
import test.vo.UserVo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class SelectStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        String  Sid = req.getParameter("Sid");
        String  Sname =  req.getParameter("Sname");
        String  Sage = req.getParameter("Sage");
        String  Ssex =  req.getParameter("Ssex");
        String  Sdept = req.getParameter("Sdept");
        String  Stel =  req.getParameter("Stel");
        String  Stime =  req.getParameter("Stime");
        UserDao userDao =new UserDao();

        UserVo user = UserDao.judgeSelectStudent(Sid,Sname,Sage,Ssex,Sdept,Stel,Stime);

        ArrayList<UserVo> list =UserDao.selectNotDeleteList1();
        req.setAttribute("list", list);
        req.getRequestDispatcher("/View.jsp").forward(req,resp);

    }
}
