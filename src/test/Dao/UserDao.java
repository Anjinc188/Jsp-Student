package test.Dao;


import test.Dbmanage.Dbmanage;
import test.vo.UserVo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class UserDao {

    public static void insertUser(UserVo user) {  // 用户注册方法
        Dbmanage dbmanage = new Dbmanage();
        Connection conn = null;
        Statement sta = null;
        try {
            conn = dbmanage.initDB();
            sta = conn.createStatement();
            String sql = "INSERT INTO user (Username,Password)VALUES('"
                    + user.getUsername()
                    + "','"
                    + user.getPassword()
                    + "')";
            sta.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 执行完关闭数据库
            dbmanage.closeDB(sta, conn);
        }
    }

    public static UserVo judgePassword(String Username, String Password) {  //用户登录验证
        Dbmanage dbmanage = new Dbmanage();
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        UserVo user = null;

        try {
            conn = dbmanage.initDB();
            sta = conn.createStatement();
            System.out.println(Username);
            System.out.println(Password);
            String sql = "SELECT * FROM  user WHERE Username='" + Username + "'AND Password='" + Password + "'";
            rs = sta.executeQuery(sql);
            while (rs.next()) {
                user = new UserVo();
                user.setUsername(rs.getString("Username"));
                user.setPassword(rs.getString("password"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {//执行关闭数据库
            dbmanage.closeDB(rs, sta, conn);
        }//返回查询结果

        return user;
    }

    public static ArrayList<UserVo> selectNotDeleteList() { //用户查询方法
        Dbmanage dbmanage = new Dbmanage();
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        UserVo user = null;

        ArrayList<UserVo> list = new ArrayList<UserVo>();
        try {
            conn = dbmanage.initDB();
            sta = conn.createStatement();
            String sql = "SELECT * FROM user";
            rs = sta.executeQuery(sql);
            while (rs.next()) {
                user = new UserVo();
                user.setUsername(rs.getString("username"));
                user.setPassword(rs.getString("password"));
                list.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 执行完关闭数据库
            dbmanage.closeDB(rs, sta, conn);
        }
        return list;
    }


    public void UserStudent(UserVo user) {  // 用户增加方法
        Dbmanage dbmanage = new Dbmanage();
        Connection conn = null;
        Statement sta = null;
        try {
            conn = dbmanage.initDB();
            sta = conn.createStatement();
            String sql = "INSERT INTO user12.student (Sid,Sname,Sage,Ssex,Sdept,Stel,Stime)VALUES('"
                    + user.getSid()
                    + "','"
                    + user.getSname()
                    + "','"
                    + user.getSage()
                    + "','"
                    + user.getSsex()
                    + "','"
                    + user.getSdept()
                    + "','"
                    + user.getStel()
                    + "','"
                    + user.getStime()
                    + "')";
            sta.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 执行完关闭数据库
            dbmanage.closeDB(sta, conn);
        }
    }

    public static ArrayList<UserVo> selectNotDeleteList1() {//用户查询学生信息方法
        Dbmanage dbmanage = new Dbmanage();
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        UserVo user = null;
        ArrayList<UserVo> list = new ArrayList<UserVo>();
        try {
            conn = dbmanage.initDB();
            sta = conn.createStatement();

            String sql = "SELECT * FROM student";
            rs = sta.executeQuery(sql);
            while (rs.next()) {

                user = new UserVo();

                user.setSid(rs.getString("Sid"));
                user.setSname(rs.getString("Sname"));
                user.setSage(rs.getString("Sage"));
                user.setSsex(rs.getString("Ssex"));
                user.setSdept(rs.getString("Sdept"));
                user.setStel(rs.getString("Stel"));
                user.setStime(rs.getString("Stime"));
                list.add(user);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        } finally {
            // 执行完关闭数据库
            dbmanage.closeDB(rs, sta, conn);
        }
        return list;
    }


    public static UserVo judgeSelectStudent(String Sid, String Sname, String Sage, String Ssex, String Sdept, String Stel, String Stime) {//用户查询学生信息方法
        Dbmanage dbmanage = new Dbmanage();
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        UserVo user = null;

        try {
            conn = dbmanage.initDB();
            sta = conn.createStatement();
            System.out.println(Sid);
            System.out.println(Sname);
            System.out.println(Sage);
            System.out.println(Ssex);
            System.out.println(Sdept);
            System.out.println(Stel);
            System.out.println(Stime);
            String sql = "SELECT * FROM  user12.student WHERE Sid='" + Sid + "'AND Sname='" + Sname + "' AND Sage='" + Sage +
                    "'  AND Ssex='" + Ssex + "'AND Sdept='" + Sdept + "'AND Stel='" + Stel + "'AND Stime='" + Stime + "' ";
            rs = sta.executeQuery(sql);
            while (rs.next()) {
                user = new UserVo();
                user.setSid(rs.getString("Sid"));
                user.setSname(rs.getString("Sname"));
                user.setSage(rs.getString("Sage"));
                user.setSsex(rs.getString("Ssex"));
                user.setSdept(rs.getString("Sdept"));
                user.setStel(rs.getString("Stel"));
                user.setStime(rs.getString("Stime"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {//执行关闭数据库
            dbmanage.closeDB(rs, sta, conn);
        }//返回查询结果

        return user;
    }


    public static UserVo deleteOneUser(int Sid) { //删除单条记录方法
        Dbmanage dbmanage = new Dbmanage();
        Connection conn = null;
        Statement sta = null;

        try {
            conn = dbmanage.initDB();
            sta = conn.createStatement();

            String sql = "DELETE FROM user12.student  WHERE Sid ='" + Sid + "'";
            sta.execute(sql);

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {//执行关闭数据库
            dbmanage.closeDB(sta, conn);
        }
        return null;
    }


    public static UserVo selectOneUserInfo(int Sid){
        // 查看单一用户信息
        Dbmanage dbmanage = new Dbmanage();
        Connection conn = null;
        Statement sta = null;
        ResultSet rs = null;
        UserVo user = null;

        try {
            conn = dbmanage.initDB();
            sta = conn.createStatement();
            String sql = "SELECT * FROM  user12.student WHERE Sid = " + Sid;
            rs = sta.executeQuery(sql);
            while (rs.next()) {
                user = new UserVo();
                user.setSid(rs.getString("Sid"));
                user.setSname(rs.getString("Sname"));
                user.setSage(rs.getString("Sage"));
                user.setSsex(rs.getString("Ssex"));
                user.setSdept(rs.getString("Sdept"));
                user.setStel(rs.getString("Stel"));
                user.setStime(rs.getString("Stime"));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 执行完关闭数据库
            dbmanage.closeDB(rs, sta, conn);
        }
        return user;
    }


    public void updateUser(UserVo user) {//修改学生信息
        Dbmanage dbmanage = new Dbmanage();
        Connection conn = null;
        Statement sta = null;
        try {
            conn = dbmanage.initDB();
            sta = conn.createStatement();
            String sql = "UPDATE  user12.student SET  Sname= '"
                    + user.getSname() + "', Sage= '"
                    + user.getSage() + "',  Ssex= '"
                    + user.getSsex() + "',  Sdept= '"
                    + user.getSdept() + "', Stel= '" + user.getStel()
                    + "', Stime= '" + user.getStime()
                    + "' WHERE Sid= " + user.getSid();
            System.out.println(sql);
            sta.executeUpdate(sql);
            System.out.println("update success");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 执行完关闭数据库
            dbmanage.closeDB(sta, conn);
        }
    }

    public  void  updatePassword(UserVo user) {  // 修改用户密码方法
        Dbmanage dbmanage = new Dbmanage();
        Connection conn = null;
        Statement sta = null;
        try {
            conn = dbmanage.initDB();
            sta = conn.createStatement();
            String sql = "update user SET  Password='"+user.getPassword() + "' WHERE Username= '" + user.getUsername() +"'";
            sta.executeUpdate(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            // 执行完关闭数据库
            dbmanage.closeDB(sta, conn);
        }
    }
}