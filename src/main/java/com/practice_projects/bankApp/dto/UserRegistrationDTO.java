package com.practice_projects.bankApp.dto;

import com.practice_projects.bankApp.enumeration.AccountTypeEnum;
import com.practice_projects.bankApp.enumeration.CurrencyEnum;
import com.practice_projects.bankApp.enumeration.GenderEnum;

public class UserRegistrationDTO {

    private String fullName;

    private String email;

    private String password;

    private String dateOfBirth;

    private GenderEnum gender;

    private String phoneNo;

    private String address;

    private String nationalId;

    private AccountTypeEnum accountType;

    private CurrencyEnum currencyType;

    private String accountNo;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public GenderEnum getGender() {
        return gender;
    }

    public void setGender(GenderEnum gender) {
        this.gender = gender;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public AccountTypeEnum getAccountType() {
        return accountType;
    }

    public void setAccountType(AccountTypeEnum accountType) {
        this.accountType = accountType;
    }

    public CurrencyEnum getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(CurrencyEnum currencyType) {
        this.currencyType = currencyType;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }
}
