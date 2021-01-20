package com.bridgelabz.addressbookapp.controllers;

import com.bridgelabz.addressbookapp.dto.addAddressBookDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbookservice")
public class AddressBookController {

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<String> getAddressBookData() {
        return new ResponseEntity<String>("Get Call Success", HttpStatus.OK);
    }

    @GetMapping("/get/{srNo}")
    public ResponseEntity<String> getAddressBookData(@PathVariable("srNo") int srNo) {
        return new ResponseEntity<String>("Get Call Success for id:" + srNo, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<String> addAddressBookData(
            @RequestBody addAddressBookDTO addressBookDTO) {
        return new ResponseEntity<>("Create Address Book data for: " + addressBookDTO,
                HttpStatus.OK);
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateAddressBookData(
            @RequestBody addAddressBookDTO addressBookDTO) {
        return new ResponseEntity<>("Update Address Book data for: " + addressBookDTO,
                HttpStatus.OK);
    }

    @DeleteMapping("/delete/{srNo}")
    public ResponseEntity<String> deleteAddressBookData(@PathVariable("srNo") int srNo) {
        return new ResponseEntity<String>("Delete Call Success for id: " + srNo, HttpStatus.OK);
    }
}
