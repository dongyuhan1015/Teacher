package cn.happy.entity;

/**
 * Created by lenovo on 2017/9/27.
 */
public class User {
    private Integer userid;
    private String username;
    private String userpwd;
    private int usettype;
    private Dic dic;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public int getUsettype() {
        return usettype;
    }

    public void setUsettype(int usettype) {
        this.usettype = usettype;
    }

    public Dic getDic() {
        return dic;
    }

    public void setDic(Dic dic) {
        this.dic = dic;
    }
}
