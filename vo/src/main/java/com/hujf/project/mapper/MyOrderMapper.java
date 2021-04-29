package com.hujf.project.mapper;

import com.hujf.project.model.MyOrder;
import com.hujf.project.model.MyOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MyOrderMapper {
    long countByExample(MyOrderExample example);

    int deleteByExample(MyOrderExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MyOrder record);

    int insertSelective(MyOrder record);

    List<MyOrder> selectByExample(MyOrderExample example);

    MyOrder selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MyOrder record, @Param("example") MyOrderExample example);

    int updateByExample(@Param("record") MyOrder record, @Param("example") MyOrderExample example);

    int updateByPrimaryKeySelective(MyOrder record);

    int updateByPrimaryKey(MyOrder record);
}