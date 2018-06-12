package com.weixin.demo.controller;

import com.weixin.demo.entity.Area;
import com.weixin.demo.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    public AreaService areaService;

    @RequestMapping(value = "/listArea", method = RequestMethod.GET)
    public Map<String, Object> listArea() {
        System.out.print("listArea");
        System.out.print("\n");
        Map<String, Object> map = new HashMap<String, Object>();
        List<Area> list = areaService.queryArea();
        map.put("areaList", list);
        return map;
    }

    @RequestMapping(value = "/getareabyid", method = RequestMethod.GET)
    public Map<String, Object> getAreaById(Integer areaId) {
        Map<String, Object> map = new HashMap<String, Object>();
        Area are = areaService.queryAreaById(areaId);
        map.put("area", are);
        return map;
    }

    @RequestMapping(value = "/addarea", method = RequestMethod.POST)
    public Map<String, Object> addArea(@RequestBody Area area) {
        Map<String, Object> map = new HashMap<String, Object>();
        boolean addFlag = areaService.addArea(area);
        map.put("success", addFlag);
        return map;
    }

    @RequestMapping(value = "/updatearea", method = RequestMethod.POST)
    public Map<String, Object> updateArea(@RequestBody Area area) {
        Map<String, Object> map = new HashMap<String, Object>();
        boolean updateFlag = areaService.updateArea(area);
        map.put("success", updateFlag);
        return map;
    }

    @RequestMapping(value = "/deletearea", method = RequestMethod.POST)
    public Map<String, Object> deleteArea(Integer areaId) {
        Map<String, Object> map = new HashMap<String, Object>();
        boolean deleteFlag = areaService.deleteArea(areaId);
        map.put("success", deleteFlag);
        return map;
    }
}
