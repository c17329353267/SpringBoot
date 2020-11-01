package com.sinosofter.transfer.service.oracle.impl;

import com.sinosofter.transfer.mapper.oracle.AttachMapper;
import com.sinosofter.transfer.model.oracle.Attach;
import com.sinosofter.transfer.service.oracle.AttachService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AttachServiceImpl implements AttachService {
    @Autowired
    private AttachMapper attachMapper;
    @Override
    public List<Attach> selectAllAttachService() {
        return attachMapper.selectAllAttachs();
    }
}
