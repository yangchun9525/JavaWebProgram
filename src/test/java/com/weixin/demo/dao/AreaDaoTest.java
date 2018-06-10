package com.weixin.demo.dao;

import com.weixin.demo.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaDaoTest {
    @Autowired
    private AreaDao areaDao;

    @Test
    public void queryArea() {
        List<Area> areaList = areaDao.queryArea();
        System.out.print("areaList:" + areaList.size());
        //预期值为2，如果不为2会报错
        assertEquals(2, areaList.size());
    }

    @Test
    public void queryAreaById() {
        Area area = areaDao.queryAreaById(1);
        System.out.print("area:" + area.toString());
    }

    @Test
    public void insertArea() {
        Area area = new Area();
        area.setAreaName("南苑");
        area.setPriority(1);
        int num = areaDao.insertArea(area);
        System.out.print("insertArea:" + num);
    }

    @Test
    public void updateArea() {
        Area area = new Area();
        area.setAreaId(4);
        area.setAreaName("北苑");
        area.setLastEditTime(new Date());
        int num = areaDao.updateArea(area);
        System.out.print("updateArea:" + num);
    }

    @Test
    public void deleteArea() {
        int num = areaDao.deleteArea(4);
        System.out.print("deleteArea:" + num);
    }
}