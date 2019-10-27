package com.jiaoyu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Upstart implements Serializable{
    private Integer upid;

    private String usename;

    private Integer answerid;

    private String answername;

    private Date uppdate;

    public Integer getUpid() {
        return upid;
    }

    public void setUpid(Integer upid) {
        this.upid = upid;
    }

    public String getUsename() {
        return usename;
    }

    public void setUsename(String usename) {
        this.usename = usename == null ? null : usename.trim();
    }

    public Integer getAnswerid() {
        return answerid;
    }

    public void setAnswerid(Integer answerid) {
        this.answerid = answerid;
    }

    public String getAnswername() {
        return answername;
    }

    public void setAnswername(String answername) {
        this.answername = answername == null ? null : answername.trim();
    }

    public Date getUppdate() {
        return uppdate;
    }

    public void setUppdate(Date uppdate) {
        this.uppdate = uppdate;
    }
}