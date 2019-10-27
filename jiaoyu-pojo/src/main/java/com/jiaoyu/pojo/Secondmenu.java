package com.jiaoyu.pojo;

import java.io.Serializable;

public class Secondmenu  implements Serializable {
    private Integer smId;

    private String smName;

    private String smUrl;

    private Integer smFatherId;

    public Integer getSmId() {
        return smId;
    }

    public void setSmId(Integer smId) {
        this.smId = smId;
    }

    public String getSmName() {
        return smName;
    }

    public void setSmName(String smName) {
        this.smName = smName == null ? null : smName.trim();
    }

    public String getSmUrl() {
        return smUrl;
    }

    public void setSmUrl(String smUrl) {
        this.smUrl = smUrl == null ? null : smUrl.trim();
    }

    public Integer getSmFatherId() {
        return smFatherId;
    }

    public void setSmFatherId(Integer smFatherId) {
        this.smFatherId = smFatherId;
    }
}