package cn.tfs.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class TeachFeedBack {
    private Integer feedid;

    private Integer feedperson;

    private String feedtitle;

    private String feedcontent;
    //前台传递给后台的日期
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date feeddate;

    private Integer feedstatus;

    private Boolean feedisdelete;

    private String remark1;

    private String remark2;

    public Integer getFeedid() {
        return feedid;
    }

    public void setFeedid(Integer feedid) {
        this.feedid = feedid;
    }

    public Integer getFeedperson() {
        return feedperson;
    }

    public void setFeedperson(Integer feedperson) {
        this.feedperson = feedperson;
    }

    public String getFeedtitle() {
        return feedtitle;
    }

    public void setFeedtitle(String feedtitle) {
        this.feedtitle = feedtitle == null ? null : feedtitle.trim();
    }

    public String getFeedcontent() {
        return feedcontent;
    }

    public void setFeedcontent(String feedcontent) {
        this.feedcontent = feedcontent == null ? null : feedcontent.trim();
    }

    public Date getFeeddate() {
        return feeddate;
    }

    public void setFeeddate(Date feeddate) {
        this.feeddate = feeddate;
    }

    public Integer getFeedstatus() {
        return feedstatus;
    }

    public void setFeedstatus(Integer feedstatus) {
        this.feedstatus = feedstatus;
    }

    public Boolean getFeedisdelete() {
        return feedisdelete;
    }

    public void setFeedisdelete(Boolean feedisdelete) {
        this.feedisdelete = feedisdelete;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1 == null ? null : remark1.trim();
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2 == null ? null : remark2.trim();
    }
}