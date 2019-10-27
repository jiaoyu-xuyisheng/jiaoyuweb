package com.jiaoyu.pojo;

import java.io.Serializable;

public class Shoucang implements Serializable{
    private Integer scid;

    private String username;

    private Integer keid;

    private String keurl;

    private String keimgurl;

    private Integer keview;

    public Integer getScid() {
        return scid;
    }

    public void setScid(Integer scid) {
        this.scid = scid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Integer getKeid() {
        return keid;
    }

    public void setKeid(Integer keid) {
        this.keid = keid;
    }

    public String getKeurl() {
        return keurl;
    }

    public void setKeurl(String keurl) {
        this.keurl = keurl == null ? null : keurl.trim();
    }

    public String getKeimgurl() {
        return keimgurl;
    }

    public void setKeimgurl(String keimgurl) {
        this.keimgurl = keimgurl == null ? null : keimgurl.trim();
    }

    public Integer getKeview() {
        return keview;
    }

    public void setKeview(Integer keview) {
        this.keview = keview;
    }
}