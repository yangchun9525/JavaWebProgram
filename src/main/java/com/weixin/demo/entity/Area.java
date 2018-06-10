package com.weixin.demo.entity;

import java.util.Date;

public class Area {
    //主键地区id,对应数据库字段为area_id
    private Integer areaId;
    //地区名称，对应数据库字段为area_name
    private String areaName;
    //权重值越大越靠前，对应数据库字段为priority
    private Integer priority;
    //上一次修改的时间，对应数据库字段为last_edit_time
    private Date lastEditTime;
    //创建的时间，对应数据库字段为create_time
    private Date createTime;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getLastEditTime() {
        return lastEditTime;
    }

    public void setLastEditTime(Date lastEditTime) {
        this.lastEditTime = lastEditTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Area{" +
                "areaId=" + areaId +
                ", areaName='" + areaName + '\'' +
                ", priority=" + priority +
                ", lastEditTime=" + lastEditTime +
                ", createTime=" + createTime +
                '}';
    }
}
