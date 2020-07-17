package com.example.hackathon.data;

public class NGOData {

    String ngoName, ngoEmail, ngoMobile, ngoAddress;

    public String getNgoName() {
        return ngoName;
    }

    public NGOData setNgoName(String ngoName) {
        this.ngoName = ngoName;
        return this;
    }

    public String getNgoEmail() {
        return ngoEmail;
    }

    public NGOData setNgoEmail(String ngoEmail) {
        this.ngoEmail = ngoEmail;
        return this;
    }

    public String getNgoMobile() {
        return ngoMobile;
    }

    public NGOData setNgoMobile(String ngoMobile) {
        this.ngoMobile = ngoMobile;
        return this;
    }

    public String getNgoAddress() {
        return ngoAddress;
    }

    public NGOData setNgoAddress(String ngoAddress) {
        this.ngoAddress = ngoAddress;
        return this;
    }

    public NGOData(String ngoName, String ngoEmail, String ngoMobile, String ngoAddress) {
        this.ngoName = ngoName;
        this.ngoEmail = ngoEmail;
        this.ngoMobile = ngoMobile;
        this.ngoAddress = ngoAddress;
    }
}
