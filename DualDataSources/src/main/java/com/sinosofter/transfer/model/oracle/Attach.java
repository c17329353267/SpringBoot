package com.sinosofter.transfer.model.oracle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Attach {
    private String field_pk;
    private String zonecode;
    private String orgcode;
    private String addr;
}
