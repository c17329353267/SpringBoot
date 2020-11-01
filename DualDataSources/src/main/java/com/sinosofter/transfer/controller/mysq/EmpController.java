package com.sinosofter.transfer.controller.mysq;

import com.sinosofter.transfer.model.mysql.Employee;
import com.sinosofter.transfer.service.mysql.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("mysql")
public class EmpController {

    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/getEmployees")
    @ResponseBody
    public List<Employee> getEmployees(){
        return employeeService.selectAllEmployees();
    }
}
