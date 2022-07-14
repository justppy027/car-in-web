package com.example.carinweb.bean;

public class CiwUser {
    private String phone;
    private String passwd;
    private int status;
    private String name;
    private String ChinaID;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChinaID() {
        return ChinaID;
    }

    public void setChinaID(String chinaID) {
        ChinaID = chinaID;
    }
}
