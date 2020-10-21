package com.hujf.project.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SmUserRoleRelation implements Serializable {
    @ApiModelProperty(value = "用户角色关联主键")
    private String userRolePk;

    @ApiModelProperty(value = "角色pk")
    private String rolePk;

    @ApiModelProperty(value = "用户pk")
    private String userPk;

    @ApiModelProperty(value = "授权人")
    private String creator;

    @ApiModelProperty(value = "授权时间")
    private Date creationTime;

    @ApiModelProperty(value = "用户id")
    private Integer userId;

    private static final long serialVersionUID = 1L;

    public String getUserRolePk() {
        return userRolePk;
    }

    public void setUserRolePk(String userRolePk) {
        this.userRolePk = userRolePk;
    }

    public String getRolePk() {
        return rolePk;
    }

    public void setRolePk(String rolePk) {
        this.rolePk = rolePk;
    }

    public String getUserPk() {
        return userPk;
    }

    public void setUserPk(String userPk) {
        this.userPk = userPk;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userRolePk=").append(userRolePk);
        sb.append(", rolePk=").append(rolePk);
        sb.append(", userPk=").append(userPk);
        sb.append(", creator=").append(creator);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", userId=").append(userId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}