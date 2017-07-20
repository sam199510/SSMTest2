package com.ssm.entity;

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
}