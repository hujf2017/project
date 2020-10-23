package com.hujf.project.dao;

import com.hujf.project.model.SmResource;
import com.hujf.project.model.SmRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author Hujf
 * @title: SmUserRoleRelationDao
 * @date 2020/10/22 0022上午 9:16
 * @description: TODO
 */
public interface SmUserRoleRelationDao {

    /**
     * 获取用于所有角色
     */
    List<SmRole> getRoleList(String memberId) ;

    /**
     * 获取当前用户所有的资源
     */
    List<SmResource> getUserResource(String userPk);

}
