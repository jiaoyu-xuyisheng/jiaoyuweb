package com.jiaoyu.pojo;

import java.io.Serializable;
import java.util.Date;

public class Jyuser implements Serializable {
    private String jyUsername;

    private String jyPassword;

    private String jyPhone;

    private Integer jyScore;

    private String jyHeadpic;

    private Date jyCreatedate;

    private Date jyUpdate;

    private String jyAnswer1;

    private String jyAnswer2;

    private String jyAnswer3;

    private String jyAsk1;

    private String jyAsk2;

    private String jyAsk3;

    private String jyEmall;

    private Integer jyLevel;

    private Integer role;

    private String company;

    public String getJyUsername() {
        return jyUsername;
    }

    public void setJyUsername(String jyUsername) {
        this.jyUsername = jyUsername == null ? null : jyUsername.trim();
    }

    public String getJyPassword() {
        return jyPassword;
    }

    public void setJyPassword(String jyPassword) {
        this.jyPassword = jyPassword == null ? null : jyPassword.trim();
    }

    public String getJyPhone() {
        return jyPhone;
    }

    public void setJyPhone(String jyPhone) {
        this.jyPhone = jyPhone == null ? null : jyPhone.trim();
    }

    public Integer getJyScore() {
        return jyScore;
    }

    public void setJyScore(Integer jyScore) {
        this.jyScore = jyScore;
    }

    public String getJyHeadpic() {
        return jyHeadpic;
    }

    public void setJyHeadpic(String jyHeadpic) {
        this.jyHeadpic = jyHeadpic == null ? null : jyHeadpic.trim();
    }

    public Date getJyCreatedate() {
        return jyCreatedate;
    }

    public void setJyCreatedate(Date jyCreatedate) {
        this.jyCreatedate = jyCreatedate;
    }

    public Date getJyUpdate() {
        return jyUpdate;
    }

    public void setJyUpdate(Date jyUpdate) {
        this.jyUpdate = jyUpdate;
    }

    public String getJyAnswer1() {
        return jyAnswer1;
    }

    public void setJyAnswer1(String jyAnswer1) {
        this.jyAnswer1 = jyAnswer1 == null ? null : jyAnswer1.trim();
    }

    public String getJyAnswer2() {
        return jyAnswer2;
    }

    public void setJyAnswer2(String jyAnswer2) {
        this.jyAnswer2 = jyAnswer2 == null ? null : jyAnswer2.trim();
    }

    public String getJyAnswer3() {
        return jyAnswer3;
    }

    public void setJyAnswer3(String jyAnswer3) {
        this.jyAnswer3 = jyAnswer3 == null ? null : jyAnswer3.trim();
    }

    public String getJyAsk1() {
        return jyAsk1;
    }

    public void setJyAsk1(String jyAsk1) {
        this.jyAsk1 = jyAsk1 == null ? null : jyAsk1.trim();
    }

    public String getJyAsk2() {
        return jyAsk2;
    }

    public void setJyAsk2(String jyAsk2) {
        this.jyAsk2 = jyAsk2 == null ? null : jyAsk2.trim();
    }

    public String getJyAsk3() {
        return jyAsk3;
    }

    public void setJyAsk3(String jyAsk3) {
        this.jyAsk3 = jyAsk3 == null ? null : jyAsk3.trim();
    }

    public String getJyEmall() {
        return jyEmall;
    }

    public void setJyEmall(String jyEmall) {
        this.jyEmall = jyEmall == null ? null : jyEmall.trim();
    }

    public Integer getJyLevel() {
        return jyLevel;
    }

    public void setJyLevel(Integer jyLevel) {
        this.jyLevel = jyLevel;
    }

    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }
}