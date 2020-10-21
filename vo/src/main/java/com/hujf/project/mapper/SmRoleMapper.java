package com.hujf.project.mapper;

import com.hujf.project.model.SmRole;
import com.hujf.project.model.SmRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmRoleMapper {
    long countByExample(SmRoleExample example);

    int deleteByExample(SmRoleExample example);

    int insert(SmRole record);

    int insertSelective(SmRole record);

    List<SmRole> selectByExample(SmRoleExample example);

    int updateByExampleSelective(@Param("record") SmRole record, @Param("example") SmRoleExample example);

    int updateByExample(@Param("record") SmRole record, @Param("example") SmRoleExample example);
}