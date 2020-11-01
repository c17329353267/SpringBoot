package com.sinosofter.transfer.controller.oracle;

import com.sinosofter.transfer.model.oracle.Attach;
import com.sinosofter.transfer.service.oracle.AttachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("oracle")
public class AttachController {

    @Autowired
    private AttachService attachService;
    @RequestMapping("/getAttaches")
    @ResponseBody
    public List<Attach> getAllAttaches(){

        System.out.println("in oracle getAllAttaches:"+attachService.selectAllAttachService());
        return attachService.selectAllAttachService();
    }
}
