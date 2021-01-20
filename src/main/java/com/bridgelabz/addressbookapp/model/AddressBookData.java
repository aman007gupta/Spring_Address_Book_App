package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;

public class AddressBookData {
    private int srNo;
    private String fName;
    private String lName;
    private String city;
    private String state;
    private long zip;
    private long mobNo;

    public AddressBookData() {
    }

    public AddressBookData(int srNo, AddressBookDTO addressBookDTO) {
        this.srNo = srNo;
        this.fName = addressBookDTO.fName;
        this.lName = addressBookDTO.lName;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.zip = addressBookDTO.zip;
        this.mobNo = addressBookDTO.mobNo;
    }

    public int getSrNo() {
        return srNo;
    }

    public void setSrNo(int srNo) {
        this.srNo = srNo;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public long getZip() {
        return zip;
    }

    public void setZip(long zip) {
        this.zip = zip;
    }

    public long getMobNo() {
        return mobNo;
    }

    public void setMobNo(long mobNo) {
        this.mobNo = mobNo;
    }
}
