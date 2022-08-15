package com.jxd.emp.service.impl;

import com.jxd.emp.dao.IMenuDao;
import com.jxd.emp.model.Menu;
import com.jxd.emp.service.IMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName MenuServiceImpl
 * @Description TODO
 * @Author lixiaoru
 * @Date 2021/8/15
 * @Version 1.0
 */
@Service
public class MenuServiceImpl implements IMenuService {
    @Autowired
    private IMenuDao menuDao;

    @Override
    public List<Menu> getMenuList() {
        return menuDao.getMenuList();
    }
}
