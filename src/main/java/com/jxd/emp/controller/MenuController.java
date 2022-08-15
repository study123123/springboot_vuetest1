package com.jxd.emp.controller;

import com.jxd.emp.model.Menu;
import com.jxd.emp.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sun.security.krb5.internal.crypto.HmacSha1Aes128CksumType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName MenuController
 * @Description TODO
 * @Author lixiaoru
 * @Date 2021/8/15
 * @Version 1.0
 */
@RestController
public class MenuController {
    @Autowired
    private IMenuService menuService;

    @RequestMapping("/getMenuList")
    public Map<String,Object> getMenu(){
        Map<String,Object> map = new HashMap<>();
        List<Menu> list = menuService.getMenuList();
        map.put("data",list);
        map.put("code",200);
        return map;
    }

}
