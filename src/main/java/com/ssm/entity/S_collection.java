package com.ssm.entity;

import java.io.Serializable;

public class S_collection implements Serializable {
    private Integer clId;

    private Integer clCollectorid;

    private Integer clBookid;

    private String clBookname;

    private Float clBookprice;

    private String clBookcover;

    public Integer getClId() {
        return clId;
    }

    public void setClId(Integer clId) {
        this.clId = clId;
    }

    public Integer getClCollectorid() {
        return clCollectorid;
    }

    public void setClCollectorid(Integer clCollectorid) {
        this.clCollectorid = clCollectorid;
    }

    public Integer getClBookid() {
        return clBookid;
    }

    public void setClBookid(Integer clBookid) {
        this.clBookid = clBookid;
    }

    public String getClBookname() {
        return clBookname;
    }

    public void setClBookname(String clBookname) {
        this.clBookname = clBookname == null ? null : clBookname.trim();
    }

    public Float getClBookprice() {
        return clBookprice;
    }

    public void setClBookprice(Float clBookprice) {
        this.clBookprice = clBookprice;
    }

    public String getClBookcover() {
        return clBookcover;
    }

    public void setClBookcover(String clBookcover) {
        this.clBookcover = clBookcover == null ? null : clBookcover.trim();
    }
}