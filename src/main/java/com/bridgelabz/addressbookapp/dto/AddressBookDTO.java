package com.bridgelabz.addressbookapp.dto;

import lombok.ToString;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public @ToString
class AddressBookDTO {

    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}", message = "Contact name Invalid")
    public String fullName;
    //    @NotBlank(message = "City cannot be empty")
    public String city;
    //    @NotBlank(message = "State cannot be empty")
    public String state;
    //    @NotBlank(message = "Zip Code cannot be empty")
    public long zip;
    //    @NotBlank(message = "Mobile No. cannot be empty")
    public long mobNo;
    @NotBlank(message = "Address cannot be empty")
    public String address;

}
