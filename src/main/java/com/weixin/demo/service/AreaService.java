package com.weixin.demo.service;

import com.weixin.demo.entity.Area;

import java.util.List;

public interface AreaService {
    /**
     * 查询所有的area
     *
     * @return
     */
    List<Area> queryArea();

    /**
     * 根据id查询area
     *
     * @param areaId
     * @return
     */
    Area queryAreaById(int areaId);

    /**
     * 新增
     *
     * @param area
     * @return
     */
    boolean addArea(Area area);

    /**
     * 修改
     *
     * @param area
     * @return
     */
    boolean updateArea(Area area);

    /**
     * 删除
     *
     * @param areaId
     * @return
     */
    boolean deleteArea(int areaId);
}
