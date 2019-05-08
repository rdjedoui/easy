package com.mda.easy.dao;

import com.mda.easy.model.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressReposiory extends JpaRepository<Address, Integer> {
}
