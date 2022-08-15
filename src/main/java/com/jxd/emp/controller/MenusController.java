package com.jxd.emp.controller;

import com.jxd.emp.model.Menus;
import com.jxd.emp.service.IMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName MenusController
 * @Description TODO
 * @Author lixiaoru
 * @Date 2021/8/16
 * @Version 1.0
 */
@RestController
public class MenusController {
    @Autowired
    private IMenusService menusService;

    @RequestMapping("/getMenu")
    public Map<String,Object> getMenu(){
        Map<String,Object> map = new HashMap<>();
        List<Menus> list = menusService.getMenuList();

        map.put("data",list);
        map.put("code",200);

        return map;
    }
}
