package com.sinosofter.transfer.service.mysql;

import com.sinosofter.transfer.model.mysql.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> selectAllEmployees();
    Integer getAllCounts();
}
