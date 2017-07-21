package com.ssm.entity;

import java.io.Serializable;
import java.util.List;

public class S_user implements Serializable {
    private Integer uId;

    private String uUsername;

    private String uPassword;

    private Long uMobile;

    private String uAddress;

    private List<S_collection> s_collections;

    private List<S_comment> s_comments;

    private List<S_indent> s_indents;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuUsername() {
        return uUsername;
    }

    public void setuUsername(String uUsername) {
        this.uUsername = uUsername == null ? null : uUsername.trim();
    }

    public String getuPassword() {
        return uPassword;
    }

    public void setuPassword(String uPassword) {
        this.uPassword = uPassword == null ? null : uPassword.trim();
    }

    public Long getuMobile() {
        return uMobile;
    }

    public void setuMobile(Long uMobile) {
        this.uMobile = uMobile;
    }

    public String getuAddress() {
        return uAddress;
    }

    public void setuAddress(String uAddress) {
        this.uAddress = uAddress == null ? null : uAddress.trim();
    }

    public List<S_collection> getS_collections() {
        return s_collections;
    }

    public void setS_collections(List<S_collection> s_collections) {
        this.s_collections = s_collections;
    }

    public List<S_comment> getS_comments() {
        return s_comments;
    }

    public void setS_comments(List<S_comment> s_comments) {
        this.s_comments = s_comments;
    }

    public List<S_indent> getS_indents() {
        return s_indents;
    }

    public void setS_indents(List<S_indent> s_indents) {
        this.s_indents = s_indents;
    }
}