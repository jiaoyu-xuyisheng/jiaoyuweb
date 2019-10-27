package com.jiaoyu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Asklist implements Serializable{
    private Integer askid;

    private Integer keId;

    private Integer userId;

    private String askContainer;

    private Date askDatetime;

    private String askTitle;

    private Integer view;

    private Integer status;

    private String username;

    private String askurl;

    public Integer getAskid() {
        return askid;
    }

    public void setAskid(Integer askid) {
        this.askid = askid;
    }

    public Integer getKeId() {
        return keId;
    }

    public void setKeId(Integer keId) {
        this.keId = keId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAskContainer() {
        return askContainer;
    }

    public void setAskContainer(String askContainer) {
        this.askContainer = askContainer == null ? null : askContainer.trim();
    }

    public Date getAskDatetime() {
        return askDatetime;
    }

    public void setAskDatetime(Date askDatetime) {
        this.askDatetime = askDatetime;
    }

    public String getAskTitle() {
        return askTitle;
    }

    public void setAskTitle(String askTitle) {
        this.askTitle = askTitle == null ? null : askTitle.trim();
    }

    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getAskurl() {
        return askurl;
    }

    public void setAskurl(String askurl) {
        this.askurl = askurl == null ? null : askurl.trim();
    }
}