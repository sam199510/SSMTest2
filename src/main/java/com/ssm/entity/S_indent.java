package com.ssm.entity;

import java.util.Date;

public class S_indent {
    private Integer iId;

    private Integer iBuyerid;

    private Integer iBookid;

    private Date iBargaintime;

    private String iBuyeraddress;

    private String iBookname;

    private String iBookcover;

    private Float iBookprice;

    private String iBookpublisher;

    private Integer iCommentstate;

    private Long iBuyermobile;

    private String iBuyername;

    public Integer getiId() {
        return iId;
    }

    public void setiId(Integer iId) {
        this.iId = iId;
    }

    public Integer getiBuyerid() {
        return iBuyerid;
    }

    public void setiBuyerid(Integer iBuyerid) {
        this.iBuyerid = iBuyerid;
    }

    public Integer getiBookid() {
        return iBookid;
    }

    public void setiBookid(Integer iBookid) {
        this.iBookid = iBookid;
    }

    public Date getiBargaintime() {
        return iBargaintime;
    }

    public void setiBargaintime(Date iBargaintime) {
        this.iBargaintime = iBargaintime;
    }

    public String getiBuyeraddress() {
        return iBuyeraddress;
    }

    public void setiBuyeraddress(String iBuyeraddress) {
        this.iBuyeraddress = iBuyeraddress == null ? null : iBuyeraddress.trim();
    }

    public String getiBookname() {
        return iBookname;
    }

    public void setiBookname(String iBookname) {
        this.iBookname = iBookname == null ? null : iBookname.trim();
    }

    public String getiBookcover() {
        return iBookcover;
    }

    public void setiBookcover(String iBookcover) {
        this.iBookcover = iBookcover == null ? null : iBookcover.trim();
    }

    public Float getiBookprice() {
        return iBookprice;
    }

    public void setiBookprice(Float iBookprice) {
        this.iBookprice = iBookprice;
    }

    public String getiBookpublisher() {
        return iBookpublisher;
    }

    public void setiBookpublisher(String iBookpublisher) {
        this.iBookpublisher = iBookpublisher == null ? null : iBookpublisher.trim();
    }

    public Integer getiCommentstate() {
        return iCommentstate;
    }

    public void setiCommentstate(Integer iCommentstate) {
        this.iCommentstate = iCommentstate;
    }

    public Long getiBuyermobile() {
        return iBuyermobile;
    }

    public void setiBuyermobile(Long iBuyermobile) {
        this.iBuyermobile = iBuyermobile;
    }

    public String getiBuyername() {
        return iBuyername;
    }

    public void setiBuyername(String iBuyername) {
        this.iBuyername = iBuyername == null ? null : iBuyername.trim();
    }
}