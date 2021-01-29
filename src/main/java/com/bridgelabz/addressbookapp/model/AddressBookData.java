package com.bridgelabz.addressbookapp.model;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "address_book")
public @Data
class AddressBookData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contact_id")
    private int srNo;
    @Column(name = "full_name")
    private String fullName;
    private String state;
    private String address;
    private long zip;
    private long mobNo;
    private String city;

    public AddressBookData() {
    }

    public AddressBookData(AddressBookDTO addressBookDTO) {
        this.updateAddressBookData(addressBookDTO);
    }

    public AddressBookData(int srNo, AddressBookDTO addressBookDTO) {
        this.srNo = srNo;
        this.fullName = addressBookDTO.fullName;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.address = addressBookDTO.address;
        this.zip = addressBookDTO.zip;
        this.mobNo = addressBookDTO.mobNo;
    }

    public void updateAddressBookData(AddressBookDTO addressBookDTO) {
        this.fullName = addressBookDTO.fullName;
        this.city = addressBookDTO.city;
        this.state = addressBookDTO.state;
        this.address = addressBookDTO.address;
        this.zip = addressBookDTO.zip;
        this.mobNo = addressBookDTO.mobNo;
    }
}
