package com.jxd.emp.service.impl;

import com.jxd.emp.dao.IMenusDao;
import com.jxd.emp.model.Menus;
import com.jxd.emp.service.IMenusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName MenusServiceImpl
 * @Description TODO
 * @Author lixiaoru
 * @Date 2021/8/16
 * @Version 1.0
 */
@Service
public class MenusServiceImpl implements IMenusService {
    @Autowired
    private IMenusDao menusDao;

    @Override
    public List<Menus> getMenuList() {
        return menusDao.getMenuList();
    }
}
