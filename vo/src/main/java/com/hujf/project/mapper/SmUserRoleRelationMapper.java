package com.hujf.project.mapper;

import com.hujf.project.model.SmUserRoleRelation;
import com.hujf.project.model.SmUserRoleRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmUserRoleRelationMapper {
    long countByExample(SmUserRoleRelationExample example);

    int deleteByExample(SmUserRoleRelationExample example);

    int insert(SmUserRoleRelation record);

    int insertSelective(SmUserRoleRelation record);

    List<SmUserRoleRelation> selectByExample(SmUserRoleRelationExample example);

    int updateByExampleSelective(@Param("record") SmUserRoleRelation record, @Param("example") SmUserRoleRelationExample example);

    int updateByExample(@Param("record") SmUserRoleRelation record, @Param("example") SmUserRoleRelationExample example);
}