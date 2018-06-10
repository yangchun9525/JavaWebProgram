package com.weixin.demo.dao;

import com.weixin.demo.entity.Area;

import java.util.List;

public interface AreaDao {
    /**
     * 查询所有的area
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据id查询area
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 新增
     * @param area
     * @return
     */
    int insertArea(Area area);

    /**
     * 修改
     * @param area
     * @return
     */
    int updateArea(Area area);

    /**
     * 删除
     * @param areaId
     * @return
     */
    int deleteArea(int areaId);
}
