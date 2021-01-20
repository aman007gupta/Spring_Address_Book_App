package com.bridgelabz.addressbookapp.dto;

public class AddressBookDTO {
    public String fName;
    public String lName;
    public String city;
    public String state;
    public long zip;
    public long mobNo;

    public AddressBookDTO(String fName, String lName, String city, String state, long zip, long mobNo) {
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
