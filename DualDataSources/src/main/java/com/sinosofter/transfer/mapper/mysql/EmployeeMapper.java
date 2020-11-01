package com.sinosofter.transfer.mapper.mysql;

import com.sinosofter.transfer.model.mysql.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

public interface EmployeeMapper {

    List<Employee> selectAllEmployees();
    Integer getAllCounts();
}
