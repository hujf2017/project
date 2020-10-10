package com.hujf.project.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SmUser implements Serializable {
    @ApiModelProperty(value = "用户主键")
    private String userPk;

    @ApiModelProperty(value = "用户id")
    private String userId;

    @ApiModelProperty(value = "用户名")
    private String userName;

    @ApiModelProperty(value = "密码")
    private String userPassword;

    @ApiModelProperty(value = "电话")
    private String userPhone;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "最后修改时间")
    private Date modifiedTime;

    @ApiModelProperty(value = "创建人")
    private String creator;

    @ApiModelProperty(value = "最后修改人")
    private String modifier;

    @ApiModelProperty(value = "用户状态")
    private String status;

    @ApiModelProperty(value = "登录token")
    private String accessToken;

    private static final long serialVersionUID = 1L;

    public String getUserPk() {
        return userPk;
    }

    public void setUserPk(String userPk) {
        this.userPk = userPk;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifiedTime() {
        return modifiedTime;
    }

    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getModifier() {
        return modifier;
    }

    public void setModifier(String modifier) {
        this.modifier = modifier;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", userPk=").append(userPk);
        sb.append(", userId=").append(userId);
        sb.append(", userName=").append(userName);
        sb.append(", userPassword=").append(userPassword);
        sb.append(", userPhone=").append(userPhone);
        sb.append(", createTime=").append(createTime);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", creator=").append(creator);
        sb.append(", modifier=").append(modifier);
        sb.append(", status=").append(status);
        sb.append(", accessToken=").append(accessToken);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}