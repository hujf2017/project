package com.hujf.project.service.impl;

import com.hujf.project.common.util.UUIDUtil;
import com.hujf.project.mapper.SmResourceMapper;
import com.hujf.project.mapper.SmRoleMapper;
import com.hujf.project.mapper.SmRoleResourceRelationMapper;
import com.hujf.project.mapper.SmUserRoleRelationMapper;
import com.hujf.project.model.*;
import com.hujf.project.service.MemberService;
import com.hujf.project.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

/**
 * @author Hujf
 * @title: RoleServiceImpl
 * @date 2020/10/23 0023上午 11:01
 * @description: TODO
 */
@Service
public class RoleServiceImpl implements RoleService {

    @Autowired
    MemberService memberService;
    @Resource
    SmRoleMapper smRoleMapper;
    @Resource
    SmRoleResourceRelationMapper smRoleResourceRelationMapper;
    @Resource
    SmUserRoleRelationMapper smUserRoleRelationMapper;

    @Override
    public int addRole(String roleName) {
        SmRole smRole = new SmRole();
        smRole.setRoleName(roleName);
        smRole.setRolePk(UUIDUtil.getUUid());
        smRole.setCreator(memberService.getCurrentUser().getUserName());
        smRole.setCreationTime(new Date());
      //  smRole.setRoleCode();
        return smRoleMapper.insertSelective(smRole);
    }

    @Override
    public int addResourceToRole(String roleId, List<String> resources) {
        resources.forEach(o->{
            SmRoleResourceRelation smRoleResourceRelation =new SmRoleResourceRelation();
            smRoleResourceRelation.setRoleResourcePk(UUIDUtil.getUUid());
            smRoleResourceRelation.setResourcePk(o);
            smRoleResourceRelation.setRolePk(roleId);
            smRoleResourceRelation.setCreator(memberService.getCurrentUser().getUserName());
            smRoleResourceRelation.setCreateTime(new Date());
            smRoleResourceRelationMapper.insert(smRoleResourceRelation);
        });
        return resources.size();
    }

    @Override
    public List<SmRole> getAllRole(){
        return smRoleMapper.selectByExample(new SmRoleExample());
    }

    @Override
    public int addRoleToUser(String memberId, String roles) {
        SmUserRoleRelation smUserRoleRelation = new SmUserRoleRelation();
        smUserRoleRelation.setUserPk(memberId);
        smUserRoleRelation.setCreationTime(new Date());
        smUserRoleRelation.setCreator(memberService.getCurrentUser().getUserName());
        smUserRoleRelation.setRolePk(roles);
        smUserRoleRelation.setUserRolePk(UUIDUtil.getUUid());
        return smUserRoleRelationMapper.insertSelective(smUserRoleRelation);
    }
}
