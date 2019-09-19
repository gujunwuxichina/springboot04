package com.gujun.springboot04.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias(value = "user")
public class User implements Serializable {

    private static final long serialVersionUID = -6669173187129845768L;

    private Integer uId;

    private String username;

    private String password;

    private int available;

    public User() {
    }

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAvailable() {
        return available;
    }

    public void setAvailable(int available) {
        this.available = available;
    }

    @Override
    public String toString() {
        return "User{" +
                "uId=" + uId +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", available=" + available +
                '}';
    }
}
