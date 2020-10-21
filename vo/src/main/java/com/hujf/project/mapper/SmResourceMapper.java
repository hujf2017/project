package com.hujf.project.mapper;

import com.hujf.project.model.SmResource;
import com.hujf.project.model.SmResourceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmResourceMapper {
    long countByExample(SmResourceExample example);

    int deleteByExample(SmResourceExample example);

    int insert(SmResource record);

    int insertSelective(SmResource record);

    List<SmResource> selectByExample(SmResourceExample example);

    int updateByExampleSelective(@Param("record") SmResource record, @Param("example") SmResourceExample example);

    int updateByExample(@Param("record") SmResource record, @Param("example") SmResourceExample example);
}