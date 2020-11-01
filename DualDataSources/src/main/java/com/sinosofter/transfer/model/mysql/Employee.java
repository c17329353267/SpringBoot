package com.sinosofter.transfer.model.mysql;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

    private Integer empid;
    private String empName;
    private String partment;
    private String picture;
    private String state;
}
