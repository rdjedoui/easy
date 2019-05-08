package com.mda.easy.service;

import com.mda.easy.model.Address;

import java.util.List;

public interface AddressService {

    public List<Address> getAllAddress();

    public Address getAddress(final Integer id);

    public Address addAddress(final Address address);

    public Address updateAddress(Integer id, Address address) throws Exception;

    public void deleteAddress(final Integer id);

    public void deleteAllAddress();
}
