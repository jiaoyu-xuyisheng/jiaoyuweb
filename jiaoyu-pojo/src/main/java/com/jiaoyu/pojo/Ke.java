package com.jiaoyu.pojo;

import java.io.Serializable;
import java.util.Date;

import org.apache.solr.client.solrj.beans.Field;

public class Ke  implements Serializable{
	
	@Field
    private Integer id;

	@Field("ke_publisherId")
    private String publisherId;
	
	@Field("ke_title")
    private String title;
   
    @Field("ke_imgurl")
    private String imgurl;

    @Field("ke_keurl")
    private String keurl;

    @Field("ke_charge")
    private String charge;

    @Field("ke_pageView")
    private Integer pageView;

    
    private Integer smId;

    private Integer level;

    @Field("ke_popular")
    private Integer popular;

    private String details;

    private Integer isDelete;

    private Integer isOk;

    private Integer firstId;
    
    @Field("ke_kecreatetime")
    private Date kecreatetime;

    @Field("ke_company")
    private String company;

    @Field("ke_intended")
    private String intended;

    @Field("ke_coursetype")
    private String coursetype;

    @Field("ke_konwledgepoint")
    private String konwledgepoint;

    @Field("ke_sem")
    private String sem;

    @Field("ke_secondname")
    private String secondname;

    @Field("ke_fistname")
    private String fistname;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId == null ? null : publisherId.trim();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl == null ? null : imgurl.trim();
    }

    public String getKeurl() {
        return keurl;
    }

    public void setKeurl(String keurl) {
        this.keurl = keurl == null ? null : keurl.trim();
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge == null ? null : charge.trim();
    }

    public Integer getPageView() {
        return pageView;
    }

    public void setPageView(Integer pageView) {
        this.pageView = pageView;
    }

    public Integer getSmId() {
        return smId;
    }

    public void setSmId(Integer smId) {
        this.smId = smId;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Integer getPopular() {
        return popular;
    }

    public void setPopular(Integer popular) {
        this.popular = popular;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details == null ? null : details.trim();
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getIsOk() {
        return isOk;
    }

    public void setIsOk(Integer isOk) {
        this.isOk = isOk;
    }

    public Integer getFirstId() {
        return firstId;
    }

    public void setFirstId(Integer firstId) {
        this.firstId = firstId;
    }

    public Date getKecreatetime() {
        return kecreatetime;
    }

    public void setKecreatetime(Date kecreatetime) {
        this.kecreatetime = kecreatetime;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public String getIntended() {
        return intended;
    }

    public void setIntended(String intended) {
        this.intended = intended == null ? null : intended.trim();
    }

    public String getCoursetype() {
        return coursetype;
    }

    public void setCoursetype(String coursetype) {
        this.coursetype = coursetype == null ? null : coursetype.trim();
    }

    public String getKonwledgepoint() {
        return konwledgepoint;
    }

    public void setKonwledgepoint(String konwledgepoint) {
        this.konwledgepoint = konwledgepoint == null ? null : konwledgepoint.trim();
    }

    public String getSem() {
        return sem;
    }

    public void setSem(String sem) {
        this.sem = sem == null ? null : sem.trim();
    }

    public String getSecondname() {
        return secondname;
    }

    public void setSecondname(String secondname) {
        this.secondname = secondname == null ? null : secondname.trim();
    }

    public String getFistname() {
        return fistname;
    }

    public void setFistname(String fistname) {
        this.fistname = fistname == null ? null : fistname.trim();
    }
}