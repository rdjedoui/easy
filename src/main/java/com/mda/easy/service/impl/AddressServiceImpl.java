package com.mda.easy.service.impl;

import com.mda.easy.dao.AddressReposiory;
import com.mda.easy.model.Address;
import com.mda.easy.service.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class AddressServiceImpl implements AddressService {

    @Autowired
    AddressReposiory addressReposiory;

    @Override
    public List<Address> getAllAddress() {
        return addressReposiory.findAll();
    }

    @Override
    public Address getAddress(Integer id) {
        return addressReposiory.findById(id).get();
    }

    @Override
    public Address addAddress(Address address) {
        return addressReposiory.save(address);
    }

    @Override
    public Address updateAddress(Integer id, Address address) throws Exception {
        if (!addressReposiory.existsById(id)) throw new Exception("Address with id " + id + " not exist");
        address.setId(id);
        return addressReposiory.save(address);
    }

    @Override
    public void deleteAddress(Integer id) {
        addressReposiory.deleteById(id);
    }

    @Override
    public void deleteAllAddress() {
        addressReposiory.deleteAll();
    }
}
