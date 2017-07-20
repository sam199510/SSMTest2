package com.ssm.entity;

import java.util.Date;

public class S_comment {
    private Integer cmId;

    private Integer cmBookid;

    private Integer cmBuyerid;

    private Date cmCommenttime;

    private String cmContent;

    private String cmBuyername;

    public Integer getCmId() {
        return cmId;
    }

    public void setCmId(Integer cmId) {
        this.cmId = cmId;
    }

    public Integer getCmBookid() {
        return cmBookid;
    }

    public void setCmBookid(Integer cmBookid) {
        this.cmBookid = cmBookid;
    }

    public Integer getCmBuyerid() {
        return cmBuyerid;
    }

    public void setCmBuyerid(Integer cmBuyerid) {
        this.cmBuyerid = cmBuyerid;
    }

    public Date getCmCommenttime() {
        return cmCommenttime;
    }

    public void setCmCommenttime(Date cmCommenttime) {
        this.cmCommenttime = cmCommenttime;
    }

    public String getCmContent() {
        return cmContent;
    }

    public void setCmContent(String cmContent) {
        this.cmContent = cmContent == null ? null : cmContent.trim();
    }

    public String getCmBuyername() {
        return cmBuyername;
    }

    public void setCmBuyername(String cmBuyername) {
        this.cmBuyername = cmBuyername == null ? null : cmBuyername.trim();
    }
}