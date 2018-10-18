package test.vo;

public class UserVo {

    private String Username;            //用户姓名
    private String Password;            //用户密码


    private String  Sid;                  //学生学号
    private String  Sname;                //学生姓名
    private String  Sage;                 //学生姓名
    private String  Ssex;                 //学生性别
    private String  Sdept;                //学生系别
    private String  Stel;                 //学生电话
    private String  Stime;                //更新时间


    public String getStime() {
        return Stime;
    }

    public void setStime(String stime) {
        Stime = stime;
    }

    public String getSid() {
        return Sid;
    }

    public void setSid(String sid) {
        Sid = sid;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public String getSage() {
        return Sage;
    }

    public void setSage(String sage) {
        Sage = sage;
    }

    public String getSsex() {
        return Ssex;
    }

    public void setSsex(String ssex) {
        Ssex = ssex;
    }

    public String getSdept() {
        return Sdept;
    }

    public void setSdept(String sdept) {
        Sdept = sdept;
    }

    public String getStel() {
        return Stel;
    }

    public void setStel(String stel) {
        Stel = stel;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

}
