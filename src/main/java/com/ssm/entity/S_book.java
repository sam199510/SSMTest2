package com.ssm.entity;

import java.util.List;

public class S_book {
    private Integer bId;

    private String bBookname;

    private String bAuthor;

    private Float bPrice;

    private String bIntroduce;

    private String bPublisher;

    private Long bIsbn;

    private Integer bRepertory;

    private String bCover;

    private Integer bType;

    private List<S_collection> s_collections;

    private List<S_comment> s_comments;

    private List<S_indent> s_indents;

    public Integer getbId() {
        return bId;
    }

    public void setbId(Integer bId) {
        this.bId = bId;
    }

    public String getbBookname() {
        return bBookname;
    }

    public void setbBookname(String bBookname) {
        this.bBookname = bBookname == null ? null : bBookname.trim();
    }

    public String getbAuthor() {
        return bAuthor;
    }

    public void setbAuthor(String bAuthor) {
        this.bAuthor = bAuthor == null ? null : bAuthor.trim();
    }

    public Float getbPrice() {
        return bPrice;
    }

    public void setbPrice(Float bPrice) {
        this.bPrice = bPrice;
    }

    public String getbIntroduce() {
        return bIntroduce;
    }

    public void setbIntroduce(String bIntroduce) {
        this.bIntroduce = bIntroduce == null ? null : bIntroduce.trim();
    }

    public String getbPublisher() {
        return bPublisher;
    }

    public void setbPublisher(String bPublisher) {
        this.bPublisher = bPublisher == null ? null : bPublisher.trim();
    }

    public Long getbIsbn() {
        return bIsbn;
    }

    public void setbIsbn(Long bIsbn) {
        this.bIsbn = bIsbn;
    }

    public Integer getbRepertory() {
        return bRepertory;
    }

    public void setbRepertory(Integer bRepertory) {
        this.bRepertory = bRepertory;
    }

    public String getbCover() {
        return bCover;
    }

    public void setbCover(String bCover) {
        this.bCover = bCover == null ? null : bCover.trim();
    }

    public Integer getbType() {
        return bType;
    }

    public void setbType(Integer bType) {
        this.bType = bType;
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