package com.me.maven.model;

import java.util.Date;

public class User {
    private Long id;

    private String accountBank;

    private String accountCity;

    private String accountNumber;

    private String accountProvince;

    private String accountSubbranch;

    private String address;

    private String contactPersonPhone;

    private String emailAddress;

    private String legalIdcard;

    private Date timestamper;

    private String userName;

    private String userNumber;

    private Long userid;

    private String debtOrderNo;

    public User() {}

	public User(Long id) {
		this.id = id;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAccountBank() {
        return accountBank;
    }

    public void setAccountBank(String accountBank) {
        this.accountBank = accountBank == null ? null : accountBank.trim();
    }

    public String getAccountCity() {
        return accountCity;
    }

    public void setAccountCity(String accountCity) {
        this.accountCity = accountCity == null ? null : accountCity.trim();
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber == null ? null : accountNumber.trim();
    }

    public String getAccountProvince() {
        return accountProvince;
    }

    public void setAccountProvince(String accountProvince) {
        this.accountProvince = accountProvince == null ? null : accountProvince.trim();
    }

    public String getAccountSubbranch() {
        return accountSubbranch;
    }

    public void setAccountSubbranch(String accountSubbranch) {
        this.accountSubbranch = accountSubbranch == null ? null : accountSubbranch.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getContactPersonPhone() {
        return contactPersonPhone;
    }

    public void setContactPersonPhone(String contactPersonPhone) {
        this.contactPersonPhone = contactPersonPhone == null ? null : contactPersonPhone.trim();
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress == null ? null : emailAddress.trim();
    }

    public String getLegalIdcard() {
        return legalIdcard;
    }

    public void setLegalIdcard(String legalIdcard) {
        this.legalIdcard = legalIdcard == null ? null : legalIdcard.trim();
    }

    public Date getTimestamper() {
        return timestamper;
    }

    public void setTimestamper(Date timestamper) {
        this.timestamper = timestamper;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber == null ? null : userNumber.trim();
    }

    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getDebtOrderNo() {
        return debtOrderNo;
    }

    public void setDebtOrderNo(String debtOrderNo) {
        this.debtOrderNo = debtOrderNo == null ? null : debtOrderNo.trim();
    }
}