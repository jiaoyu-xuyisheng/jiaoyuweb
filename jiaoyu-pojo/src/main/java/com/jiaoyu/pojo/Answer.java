package com.jiaoyu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Answer implements Serializable {
    private Integer auswerid;

    private Integer userId;

    private String username;

    private Date auswerdate;

    private Integer upstart;

    private Integer lowstart;

    private String jyHeadpic;

    private Integer adopt;

    private String container;

    private Integer askid;

    public Integer getAuswerid() {
        return auswerid;
    }

    public void setAuswerid(Integer auswerid) {
        this.auswerid = auswerid;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getAuswerdate() {
        return auswerdate;
    }

    public void setAuswerdate(Date auswerdate) {
        this.auswerdate = auswerdate;
    }

    public Integer getUpstart() {
        return upstart;
    }

    public void setUpstart(Integer upstart) {
        this.upstart = upstart;
    }

    public Integer getLowstart() {
        return lowstart;
    }

    public void setLowstart(Integer lowstart) {
        this.lowstart = lowstart;
    }

    public String getJyHeadpic() {
        return jyHeadpic;
    }

    public void setJyHeadpic(String jyHeadpic) {
        this.jyHeadpic = jyHeadpic == null ? null : jyHeadpic.trim();
    }

    public Integer getAdopt() {
        return adopt;
    }

    public void setAdopt(Integer adopt) {
        this.adopt = adopt;
    }

    public String getContainer() {
        return container;
    }

    public void setContainer(String container) {
        this.container = container == null ? null : container.trim();
    }

    public Integer getAskid() {
        return askid;
    }

    public void setAskid(Integer askid) {
        this.askid = askid;
    }
}