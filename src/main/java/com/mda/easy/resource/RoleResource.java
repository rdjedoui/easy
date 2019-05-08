package com.mda.easy.resource;

import com.mda.easy.model.Role;
import com.mda.easy.model.Role;
import com.mda.easy.service.RoleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RoleResource {

    private static final Logger logger = LoggerFactory.getLogger(RoleResource.class);

    @Autowired
    RoleService roleService;

    @RequestMapping(value = "/roles", method = RequestMethod.GET)
    public List<Role> getAllRole() {
        return roleService.getAllRole();
    }

    @RequestMapping(value = "/roles/{id}", method = RequestMethod.GET)
    public Role getRole(@PathVariable Integer id) {
        return roleService.getRole(id);
    }

    @RequestMapping(value = "/roles", method = RequestMethod.POST)
    public Role addRole(@RequestBody Role role) {
        return roleService.addRole(role);
    }

    @RequestMapping(value = "/roles/{id}", method = RequestMethod.DELETE)
    public void deleteRole(@PathVariable Integer id) {
        roleService.deleteRole(id);
    }

    @RequestMapping(value = "/roles/{id}", method = RequestMethod.PUT)
    public Role updateRole(@PathVariable Integer id, @RequestBody Role role) throws Exception {
        return roleService.updateRole(id, role);
    }

}
