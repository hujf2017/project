package com.hujf.project.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SmRole implements Serializable {
    @ApiModelProperty(value = "角色主键")
    private String rolePk;

    @ApiModelProperty(value = "角色名")
    private String roleName;

    @ApiModelProperty(value = "创建时间")
    private Date creationTime;

    @ApiModelProperty(value = "创建人")
    private String creator;

    @ApiModelProperty(value = "最后修改时间")
    private Date modifiedTime;

    @ApiModelProperty(value = "最后修改人")
    private String modifier;

    @ApiModelProperty(value = "角色编码")
    private Integer roleCode;

    private static final long serialVersionUID = 1L;

    public String getRolePk() {
        return rolePk;
    }

    public void setRolePk(String rolePk) {
        this.rolePk = rolePk;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public Integer getRoleCode() {
        return roleCode;
    }

    public void setRoleCode(Integer roleCode) {
        this.roleCode = roleCode;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rolePk=").append(rolePk);
        sb.append(", roleName=").append(roleName);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", creator=").append(creator);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", modifier=").append(modifier);
        sb.append(", roleCode=").append(roleCode);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}