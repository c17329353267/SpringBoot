package com.sinosofter.transfer.service.mysql.impl;

import com.sinosofter.transfer.mapper.mysql.EmployeeMapper;
import com.sinosofter.transfer.model.mysql.Employee;
import com.sinosofter.transfer.service.mysql.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public List<Employee> selectAllEmployees() {

        return employeeMapper.selectAllEmployees();
    }

    @Override
    public Integer getAllCounts() {
        return employeeMapper.getAllCounts();
    }
}
