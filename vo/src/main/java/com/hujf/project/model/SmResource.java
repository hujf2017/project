package com.hujf.project.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.util.Date;

public class SmResource implements Serializable {
    @ApiModelProperty(value = "资源主键")
    private String resourcePk;

    @ApiModelProperty(value = "资源名")
    private String resourceName;

    @ApiModelProperty(value = "资源url")
    private String resourceUrl;

    @ApiModelProperty(value = "创建时间")
    private Date createTime;

    @ApiModelProperty(value = "创建人")
    private String creator;

    private static final long serialVersionUID = 1L;

    public String getResourcePk() {
        return resourcePk;
    }

    public void setResourcePk(String resourcePk) {
        this.resourcePk = resourcePk;
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    public String getResourceUrl() {
        return resourceUrl;
    }

    public void setResourceUrl(String resourceUrl) {
        this.resourceUrl = resourceUrl;
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
        sb.append(", resourcePk=").append(resourcePk);
        sb.append(", resourceName=").append(resourceName);
        sb.append(", resourceUrl=").append(resourceUrl);
        sb.append(", createTime=").append(createTime);
        sb.append(", creator=").append(creator);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}