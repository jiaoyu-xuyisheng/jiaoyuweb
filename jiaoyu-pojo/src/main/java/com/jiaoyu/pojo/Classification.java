package com.jiaoyu.pojo;

import java.io.Serializable;

public class Classification  implements Serializable{
    private Integer cfid;

    private String cfname;

    public Integer getCfid() {
        return cfid;
    }

    public void setCfid(Integer cfid) {
        this.cfid = cfid;
    }

    public String getCfname() {
        return cfname;
    }

    public void setCfname(String cfname) {
        this.cfname = cfname == null ? null : cfname.trim();
    }
}