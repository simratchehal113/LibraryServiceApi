package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

@Entity
public class LibraryLedger {
    @Id
    @GeneratedValue
    private Integer logId;

    private String issuerName;

    private String issuedToName;

    private String bookName;

//    private SimpleDateFormat issuedOn;

    public Integer getLogId() {
        return logId;
    }

    public void setLogId(Integer logId) {
        this.logId = logId;
    }

    public String getIssuerName() {
        return issuerName;
    }

    public void setIssuerName(String issuerName) {
        this.issuerName = issuerName;
    }

    public String getIssuedToName() {
        return issuedToName;
    }

    public void setIssuedToName(String issuedToName) {
        this.issuedToName = issuedToName;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

//    public SimpleDateFormat getIssuedOn() {
//        return issuedOn;
//    }
//
//    public void setIssuedOn(SimpleDateFormat issuedOn) {
//        this.issuedOn = issuedOn;
//    }
}
