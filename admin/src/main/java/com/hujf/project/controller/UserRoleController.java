package com.hujf.project.controller;

import com.hujf.project.common.result.CommonResult;
import com.hujf.project.model.SmResource;
import com.hujf.project.service.MemberService;
import com.hujf.project.service.RoleService;
import com.hujf.project.service.SmResourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Hujf
 * @title: UserRoleController
 * @date 2020/10/21 0021下午 4:57
 * @description: 用户权限管理
 */

@Api(value = "UserRoleController",tags = "后台用户权限管理")
@RequestMapping("/role")
@RestController
public class UserRoleController {

    @Autowired
    MemberService memberService;
    @Autowired
    RoleService roleService;
    @Autowired
    SmResourceService smResourceService;

    @ApiOperation(value = "用户修改角色", httpMethod = "POST")
    @RequestMapping(value = "/role/update")
    public CommonResult updateRole(String memberId, String role){
        int count =memberService.updateRole(memberId,role);
        if(count>=0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value = "分配用户角色", httpMethod = "POST")
    @RequestMapping(value = "/role/user")
    public CommonResult addRole(String memberId, String role){
        int count =roleService.addRoleToUser(memberId,role);
        if(count>=0){
            return CommonResult.success(count);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value ="生成角色", httpMethod = "POST")
    @RequestMapping(value = "/role/add")
    public CommonResult addRole(String roleName){
        int num =roleService.addRole(roleName);
        if(num>0){
            return CommonResult.success(num);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value ="展示所有角色列表", httpMethod = "POST")
    @RequestMapping(value = "/role/get")
    public CommonResult getRoleList(){

        return CommonResult.success(roleService.getAllRole());
    }

    @ApiOperation(value ="展示所有资源列表", httpMethod = "POST")
    @RequestMapping(value = "/resource/all")
    public CommonResult<List> getAllResourceList(){
        return CommonResult.success(smResourceService.getAllResource());
    }

    @ApiOperation(value ="根据路径生成资源列表", httpMethod = "POST")
    @RequestMapping(value = "/resource/add")
    public CommonResult addResource(String path,String reName){
        int num =smResourceService.addResource(path,reName);
        if(num>0){
            return CommonResult.success(num);
        }
        return CommonResult.failed();
    }

    @ApiOperation(value ="展示资源列表", httpMethod = "POST")
    @RequestMapping(value = "/resource/get")
    public CommonResult getResourceList(String memberId){
        return CommonResult.failed();
    }

    @ApiOperation(value ="将资源分配给角色", httpMethod = "POST")
    @ApiImplicitParams({
            @ApiImplicitParam( name = "resources", value = "资源组",allowMultiple=true),
    })
    @RequestMapping(value = "/roleAndResource/add")
    public CommonResult addResourceToRole(String roleId, @RequestParam List<String> resources){
        int num = roleService.addResourceToRole(roleId,resources);
        if(num>0){
            return CommonResult.success(num);
        }
        return CommonResult.failed();
    }



}
