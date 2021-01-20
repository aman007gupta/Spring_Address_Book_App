package com.bridgelabz.addressbookapp.controllers;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, new AddressBookDTO("Aman", "Gupta", "Orai", "Uttar Pradesh", 285001, 94502917));
        ResponseDTO responseDTO = new ResponseDTO("GET Call Successful", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{srNo}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("srNo") int srNo) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, new AddressBookDTO("Aman", "Gupta", "Orai", "Uttar Pradesh", 285001, 94502917));
        ResponseDTO responseDTO = new ResponseDTO("GET Call for Serial No Successful", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(
            @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created Address Book Data Successfully", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<ResponseDTO> updateAddressBookData(
            @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Updated Address Book Data Successfully", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{srNo}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("srNo") int srNo) {
        ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully", "Deleted Serial No:" + srNo);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
