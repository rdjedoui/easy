package com.mda.easy;

import ch.qos.logback.core.net.SyslogOutputStream;
import com.mda.easy.dto.UserDTO;
import com.mda.easy.model.*;
import com.mda.easy.model.enums.AuthorityUser;
import com.mda.easy.service.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class EasyApplication implements CommandLineRunner {

    private static final Logger LOGGER = LoggerFactory.getLogger(EasyApplication.class);

    @Autowired
    UserService userService;

    @Autowired
    AuthorityService authorityService;

    @Autowired
    EmployeeService employeeService;

    @Autowired
    CorporateEntityService corporateEntityService;

    @Autowired
    LocationService locationService;

    @Autowired
    RoleService roleService;

    public static void main(String[] args) {
        SpringApplication.run(EasyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //clearData();
        //saveData();
        showData();
    }

    private void clearData() {
        userService.deleteAllUser();
        authorityService.deleteAllAuthority();

        employeeService.deleteAllEmployee();
        roleService.deleteAllRole();
    }

    private void saveData() {

    }

    private void showData() {

        System.out.println("=================== locations info: ==================");

        List<Location> locations = locationService.getAllLocation();

        locations.stream().forEach(loc -> {
            System.out.println(loc);
            loc.getEmployees().stream().forEach(System.out::println);
        });

    }

}
