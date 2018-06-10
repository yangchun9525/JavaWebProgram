package com.weixin.demo.service.impl;

import com.weixin.demo.dao.AreaDao;
import com.weixin.demo.entity.Area;
import com.weixin.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;

    @Override
    public List<Area> queryArea() {
        return areaDao.queryArea();
    }

    @Override
    public Area queryAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }

    //事物
    @Transactional
    @Override
    public boolean addArea(Area area) {
        if (area.getAreaName() != null && !"".equals(area.getAreaName())) {
            area.setCreateTime(new Date());
            area.setLastEditTime(new Date());
            try {
                int num = areaDao.insertArea(area);
                if (num > 0) {
                    return true;
                } else {
                    throw new RuntimeException("插入失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("插入失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("插入数据不能为空");
        }
    }

    @Override
    public boolean updateArea(Area area) {
        if (area.getAreaName() != null && !"".equals(area.getAreaName())) {
            area.setLastEditTime(new Date());
            try {
                int num = areaDao.updateArea(area);
                if (num > 0) {
                    return true;
                } else {
                    throw new RuntimeException("更新失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("更新失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("更新数据不能为空");
        }
    }

    @Override
    public boolean deleteArea(int areaId) {
        if (areaId > 0) {
            try {
                int num = areaDao.deleteArea(areaId);
                if (num > 0) {
                    return true;
                } else {
                    throw new RuntimeException("删除失败");
                }
            } catch (Exception e) {
                throw new RuntimeException("删除失败" + e.getMessage());
            }
        } else {
            throw new RuntimeException("删除的id不能为空");
        }
    }
}
