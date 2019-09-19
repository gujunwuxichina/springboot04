package com.gujun.springboot04.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias(value = "role")
public class Role implements Serializable {

    private static final long serialVersionUID = -7732848509651459039L;

    private Integer rId;

    private String rName;

    private String note;

    public Role() {
    }

    public Integer getrId() {
        return rId;
    }

    public void setrId(Integer rId) {
        this.rId = rId;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "Role{" +
                "rId=" + rId +
                ", rName='" + rName + '\'' +
                ", note='" + note + '\'' +
                '}';
    }

}
