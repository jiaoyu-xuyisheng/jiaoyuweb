package com.jiaoyu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Kelist  implements Serializable{
    private Integer listId;

    private Integer keId;

    private String listTitle;

    private String listUrl1;

    private String listUrl2;

    private Integer listOrder;

    private Date createdate;

    public Integer getListId() {
        return listId;
    }

    public void setListId(Integer listId) {
        this.listId = listId;
    }

    public Integer getKeId() {
        return keId;
    }

    public void setKeId(Integer keId) {
        this.keId = keId;
    }

    public String getListTitle() {
        return listTitle;
    }

    public void setListTitle(String listTitle) {
        this.listTitle = listTitle == null ? null : listTitle.trim();
    }

    public String getListUrl1() {
        return listUrl1;
    }

    public void setListUrl1(String listUrl1) {
        this.listUrl1 = listUrl1 == null ? null : listUrl1.trim();
    }

    public String getListUrl2() {
        return listUrl2;
    }

    public void setListUrl2(String listUrl2) {
        this.listUrl2 = listUrl2 == null ? null : listUrl2.trim();
    }

    public Integer getListOrder() {
        return listOrder;
    }

    public void setListOrder(Integer listOrder) {
        this.listOrder = listOrder;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}