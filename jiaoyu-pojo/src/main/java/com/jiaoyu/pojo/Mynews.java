package com.jiaoyu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Mynews  implements Serializable{
    private Integer newsid;

    private String newcontainer;

    private String newstitle;

    private Date createdate;

    private Integer viewcount;

    private Integer userid;

    private String newurl;

    public Integer getNewsid() {
        return newsid;
    }

    public void setNewsid(Integer newsid) {
        this.newsid = newsid;
    }

    public String getNewcontainer() {
        return newcontainer;
    }

    public void setNewcontainer(String newcontainer) {
        this.newcontainer = newcontainer == null ? null : newcontainer.trim();
    }

    public String getNewstitle() {
        return newstitle;
    }

    public void setNewstitle(String newstitle) {
        this.newstitle = newstitle == null ? null : newstitle.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getViewcount() {
        return viewcount;
    }

    public void setViewcount(Integer viewcount) {
        this.viewcount = viewcount;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getNewurl() {
        return newurl;
    }

    public void setNewurl(String newurl) {
        this.newurl = newurl == null ? null : newurl.trim();
    }
}