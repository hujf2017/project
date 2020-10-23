package com.hujf.project.service;

import com.hujf.project.model.SmResource;
import com.hujf.project.model.SmRole;

import java.util.List;

/**
 * @author Hujf
 * @title: RoleService
 * @date 2020/10/23 0023上午 10:58
 * @description: TODO
 */
public interface RoleService {

    int addRole(String roleName);

    int addResourceToRole(String roleId, List<String> resources);

    List<SmRole> getAllRole();

    int addRoleToUser(String memberId, String roles);
}
