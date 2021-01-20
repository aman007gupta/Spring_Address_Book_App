package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService{


    @Override
    public List<AddressBookData> getAddressBookData() {
        List<AddressBookData> addressBookDataList = new ArrayList<>();
        addressBookDataList.add(new AddressBookData(1, new AddressBookDTO("Aman", "Gupta", "Orai",
                "Uttar Pradesh", 285001, 94502917)));
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int srNo) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, new AddressBookDTO("Aman", "Gupta", "Orai",
                "Uttar Pradesh", 285001, 94502917));
        return addressBookData;
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, addressBookDTO);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(1, addressBookDTO);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int srNo) {

    }
}
