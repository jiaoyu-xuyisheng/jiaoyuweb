package com.jiaoyu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Kegd implements Serializable {
    private Integer gdid;

    private String gdimg;

    private String gdbackground;

    private String gdurl;

    private Date gdcreatetime;

    private Date gdendtime;

    private Integer isdelete;

    private Integer gduserid;

    private String gdusername;

    public Integer getGdid() {
        return gdid;
    }

    public void setGdid(Integer gdid) {
        this.gdid = gdid;
    }

    public String getGdimg() {
        return gdimg;
    }

    public void setGdimg(String gdimg) {
        this.gdimg = gdimg == null ? null : gdimg.trim();
    }

    public String getGdbackground() {
        return gdbackground;
    }

    public void setGdbackground(String gdbackground) {
        this.gdbackground = gdbackground == null ? null : gdbackground.trim();
    }

    public String getGdurl() {
        return gdurl;
    }

    public void setGdurl(String gdurl) {
        this.gdurl = gdurl == null ? null : gdurl.trim();
    }

    public Date getGdcreatetime() {
        return gdcreatetime;
    }

    public void setGdcreatetime(Date gdcreatetime) {
        this.gdcreatetime = gdcreatetime;
    }

    public Date getGdendtime() {
        return gdendtime;
    }

    public void setGdendtime(Date gdendtime) {
        this.gdendtime = gdendtime;
    }

    public Integer getIsdelete() {
        return isdelete;
    }

    public void setIsdelete(Integer isdelete) {
        this.isdelete = isdelete;
    }

    public Integer getGduserid() {
        return gduserid;
    }

    public void setGduserid(Integer gduserid) {
        this.gduserid = gduserid;
    }

    public String getGdusername() {
        return gdusername;
    }

    public void setGdusername(String gdusername) {
        this.gdusername = gdusername == null ? null : gdusername.trim();
    }
}