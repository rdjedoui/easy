package com.mda.easy.service;

import com.mda.easy.model.Role;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

public interface RoleService {

    public List<Role> getAllRole();

    public Role getRole(final Integer id);

    public Role addRole(final Role role);

    public Role updateRole(Integer id, Role role) throws Exception;

    public void deleteRole(final Integer id);

    public void deleteAllRole();
}
