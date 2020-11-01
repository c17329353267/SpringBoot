package com.sinosofter.transfer.service.mysql.impl;

import com.sinosofter.transfer.model.mysql.Employee;
import com.sinosofter.transfer.service.mysql.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeServiceImplTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void testEmployeeServiceAll(){
        List<Employee> employeeList = employeeService.selectAllEmployees();
        System.out.println(employeeService.getAllCounts());
        for (Employee emp:employeeList
             ) {
            System.out.println(emp);
        }
    }
}