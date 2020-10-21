package com.hujf.project.mapper;

import com.hujf.project.model.SmRoleResourceRelation;
import com.hujf.project.model.SmRoleResourceRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmRoleResourceRelationMapper {
    long countByExample(SmRoleResourceRelationExample example);

    int deleteByExample(SmRoleResourceRelationExample example);

    int insert(SmRoleResourceRelation record);

    int insertSelective(SmRoleResourceRelation record);

    List<SmRoleResourceRelation> selectByExample(SmRoleResourceRelationExample example);

    int updateByExampleSelective(@Param("record") SmRoleResourceRelation record, @Param("example") SmRoleResourceRelationExample example);

    int updateByExample(@Param("record") SmRoleResourceRelation record, @Param("example") SmRoleResourceRelationExample example);
}