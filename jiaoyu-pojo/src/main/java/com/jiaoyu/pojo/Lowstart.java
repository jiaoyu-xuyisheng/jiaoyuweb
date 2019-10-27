package com.jiaoyu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Lowstart implements Serializable{
    private Integer lowid;

    private String lowusername;

    private Integer answerid;

    private String anusername;

    private Date lowcreatedate;

    public Integer getLowid() {
        return lowid;
    }

    public void setLowid(Integer lowid) {
        this.lowid = lowid;
    }

    public String getLowusername() {
        return lowusername;
    }

    public void setLowusername(String lowusername) {
        this.lowusername = lowusername == null ? null : lowusername.trim();
    }

    public Integer getAnswerid() {
        return answerid;
    }

    public void setAnswerid(Integer answerid) {
        this.answerid = answerid;
    }

    public String getAnusername() {
        return anusername;
    }

    public void setAnusername(String anusername) {
        this.anusername = anusername == null ? null : anusername.trim();
    }

    public Date getLowcreatedate() {
        return lowcreatedate;
    }

    public void setLowcreatedate(Date lowcreatedate) {
        this.lowcreatedate = lowcreatedate;
    }
}