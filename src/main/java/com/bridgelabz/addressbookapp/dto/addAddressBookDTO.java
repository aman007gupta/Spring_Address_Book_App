package com.bridgelabz.addressbookapp.dto;

public class addAddressBookDTO {
    private String fName;
    private String lName;
    private String city;
    private String state;
    private long zip;
    private long mobNo;

    public addAddressBookDTO(String fName, String lName, String city, String state, long zip, long mobNo) {
        this.fName = fName;
        this.lName = lName;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.mobNo = mobNo;
    }

    @Override
    public String toString() {
        return "addAddressBookDTO{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip=" + zip +
                ", mobNo=" + mobNo +
                '}';
    }
}
