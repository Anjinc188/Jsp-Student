package test.Servlet;

import test.Dao.UserDao;
import test.vo.UserVo;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class UpdateStudent extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");                                      // 设置编码格式为 UTF-8
        resp.setCharacterEncoding("utf-8");

        int Sid=Integer.parseInt(req.getParameter("Sid"));
        UserDao userDao=new UserDao();
        UserVo user= UserDao.selectOneUserInfo(Sid);

        req.setAttribute("Sid",Sid);
        req.getRequestDispatcher("/modify.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");                                      // 设置编码格式为 UTF-8
        resp.setCharacterEncoding("utf-8");

        String  Sid    =req.getParameter("Sid");
        String  Sname  =req.getParameter("Sname");
        String  Sage   =req.getParameter("Sage");
        String  Ssex   =req.getParameter("Ssex");
        String  Sdept  =req.getParameter("Sdept");
        String  Stel   =req.getParameter("Stel");
        String  Stime  =req.getParameter("Stime");

        UserVo  user =new UserVo();

        user.setSid(Sid);
        user.setSname(Sname);
        user.setSage(Sage);
        user.setSsex(Ssex);
        user.setSdept(Sdept);
        user.setStel(Stel);
        user.setStime(Stime);

        UserDao userDao=new UserDao();
        userDao.updateUser(user);

        ArrayList<UserVo> list=userDao.selectNotDeleteList1();
        req.setAttribute("list",list);
        req.getRequestDispatcher("/tips1.jsp").forward(req,resp);

    }
}
