package collection;

public class Member {
    private String userid;
    private String passwd;
    private String name;
    private String tel;
    private String email;

    public Member() {

    }

    public Member(String userid, String passwd, String name, String tel, String email) {
        this.userid = userid;
        this.passwd = passwd;
        this.name = name;
        this.tel = tel;
        this.email = email;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "아이디:" + userid + ", 이름:" + name + ",비번: " + passwd + ", 전화: " + tel + ",이메일:" + email;
    }

}
