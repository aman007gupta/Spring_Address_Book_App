package com.bridgelabz.addressbookapp.controllers;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.dto.ResponseDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import com.bridgelabz.addressbookapp.services.IAddressBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/addressbookservice")
@CrossOrigin(origins = "http://localhost:3000")
public class AddressBookController {

    @Autowired
    private IAddressBookService addressBookService;

    @RequestMapping(value = {"", "/", "/get"})
    public ResponseEntity<ResponseDTO> getAddressBookData() {
        List<AddressBookData> addressBookDataList = null;
        addressBookDataList = addressBookService.getAddressBookData();
        ResponseDTO responseDTO = new ResponseDTO("GET Call Successful", addressBookDataList);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @GetMapping("/get/{srNo}")
    public ResponseEntity<ResponseDTO> getAddressBookData(@PathVariable("srNo") int srNo) {
        AddressBookData addressBookData = addressBookService.getAddressBookDataById(srNo);
        ResponseDTO responseDTO = new ResponseDTO("GET Call for Serial No Successful", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<ResponseDTO> addAddressBookData(@Valid
                                                          @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = addressBookService.createAddressBookData(addressBookDTO);
        ResponseDTO responseDTO = new ResponseDTO("Created Address Book Data Successfully", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @PutMapping("/update/{srNo}")
    public ResponseEntity<ResponseDTO> updateAddressBookData(@PathVariable("srNo") int srNo,
                                                             @Valid @RequestBody AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = addressBookService.updateAddressBookData(addressBookDTO, srNo);
        ResponseDTO responseDTO = new ResponseDTO("Updated Address Book Data Successfully", addressBookData);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{srNo}")
    public ResponseEntity<ResponseDTO> deleteAddressBookData(@PathVariable("srNo") int srNo) {
        addressBookService.deleteAddressBookData(srNo);
        ResponseDTO responseDTO = new ResponseDTO("Deleted Successfully", "Deleted Serial No:" + srNo);
        return new ResponseEntity<ResponseDTO>(responseDTO, HttpStatus.OK);
    }
}
