package com.bridgelabz.addressbookapp.services;

import com.bridgelabz.addressbookapp.dto.AddressBookDTO;
import com.bridgelabz.addressbookapp.model.AddressBookData;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressBookService implements IAddressBookService{

    private List<AddressBookData> addressBookDataList = new ArrayList<>();
    @Override
    public List<AddressBookData> getAddressBookData() {
        return addressBookDataList;
    }

    @Override
    public AddressBookData getAddressBookDataById(int srNo) {
        return addressBookDataList.get(srNo-1);
    }

    @Override
    public AddressBookData createAddressBookData(AddressBookDTO addressBookDTO) {
        AddressBookData addressBookData = null;
        addressBookData = new AddressBookData(addressBookDataList.size() + 1, addressBookDTO);
        addressBookDataList.add(addressBookData);
        return addressBookData;
    }

    @Override
    public AddressBookData updateAddressBookData(AddressBookDTO addressBookDTO, int srNo) {
        AddressBookData addressBookData = this.getAddressBookDataById(srNo);
        addressBookData.setfName(addressBookDTO.fName);
        addressBookData.setlName(addressBookDTO.lName);
        addressBookData.setCity(addressBookDTO.city);
        addressBookData.setState(addressBookDTO.state);
        addressBookData.setZip(addressBookDTO.zip);
        addressBookData.setMobNo(addressBookDTO.mobNo);
        addressBookDataList.set(srNo-1, addressBookData);
        return addressBookData;
    }

    @Override
    public void deleteAddressBookData(int srNo) {
        addressBookDataList.remove(srNo-1);

    }
}
