package com.hujf.project.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SmRoleResourceRelation implements Serializable {
    @ApiModelProperty(value = "用户资源关联")
    private String roleResourcePk;

    @ApiModelProperty(value = "角色主键")
    private String rolePk;

    @ApiModelProperty(value = "资源主键")
    private String resourcePk;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "创建人")
    private String creator;

    private static final long serialVersionUID = 1L;

    public String getRoleResourcePk() {
        return roleResourcePk;
    }

    public void setRoleResourcePk(String roleResourcePk) {
        this.roleResourcePk = roleResourcePk;
    }

    public String getRolePk() {
        return rolePk;
    }

    public void setRolePk(String rolePk) {
        this.rolePk = rolePk;
    }

    public String getResourcePk() {
        return resourcePk;
    }

    public void setResourcePk(String resourcePk) {
        this.resourcePk = resourcePk;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", roleResourcePk=").append(roleResourcePk);
        sb.append(", rolePk=").append(rolePk);
        sb.append(", resourcePk=").append(resourcePk);
        sb.append(", createTime=").append(createTime);
        sb.append(", creator=").append(creator);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}