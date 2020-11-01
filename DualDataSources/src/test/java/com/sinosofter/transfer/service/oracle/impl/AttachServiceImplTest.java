package com.sinosofter.transfer.service.oracle.impl;

import com.sinosofter.transfer.model.oracle.Attach;
import com.sinosofter.transfer.service.oracle.AttachService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AttachServiceImplTest {

    @Autowired
    private AttachService attachService;

    @Test
    public  void  testOraclAttach(){
        List<Attach> attaches = attachService.selectAllAttachService();
        for (Attach attach:attaches
             ) {
            System.out.println(attach);
        }

    }
}