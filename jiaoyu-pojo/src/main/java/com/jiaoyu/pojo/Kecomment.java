package com.jiaoyu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Kecomment implements Serializable{
    private Integer id;

    private Integer keid;

    private String username;

    private Date commentdate;

    private String start;

    private String userimgurl;

    private String comcontent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getKeid() {
        return keid;
    }

    public void setKeid(Integer keid) {
        this.keid = keid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Date getCommentdate() {
        return commentdate;
    }

    public void setCommentdate(Date commentdate) {
        this.commentdate = commentdate;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start == null ? null : start.trim();
    }

    public String getUserimgurl() {
        return userimgurl;
    }

    public void setUserimgurl(String userimgurl) {
        this.userimgurl = userimgurl == null ? null : userimgurl.trim();
    }

    public String getComcontent() {
        return comcontent;
    }

    public void setComcontent(String comcontent) {
        this.comcontent = comcontent == null ? null : comcontent.trim();
    }
}