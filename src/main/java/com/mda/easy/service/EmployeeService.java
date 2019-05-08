package com.mda.easy.service;

import com.mda.easy.model.Employee;
import com.mda.easy.model.Location;

import java.util.List;

public interface EmployeeService {

    public List<Employee> getAllEmployee();

    public Employee getEmployee(final Integer id);

    public Employee addEmployee(final Employee employee);

    public Employee updateEmployee(Integer id, Employee employee) throws Exception;

    public void deleteEmployee(final Integer id);

    public void deleteAllEmployee();
}
