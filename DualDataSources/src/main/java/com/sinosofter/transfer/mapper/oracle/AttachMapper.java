package com.sinosofter.transfer.mapper.oracle;

import com.sinosofter.transfer.model.oracle.Attach;
import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;

import java.util.List;

public interface AttachMapper {

    List<Attach> selectAllAttachs();
}
