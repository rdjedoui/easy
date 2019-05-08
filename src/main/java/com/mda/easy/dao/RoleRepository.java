package com.mda.easy.dao;

import com.mda.easy.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository<a> extends JpaRepository<Role, Integer> {
    a
}
