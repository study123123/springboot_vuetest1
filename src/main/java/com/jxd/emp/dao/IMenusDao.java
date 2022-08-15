package com.jxd.emp.dao;


import com.jxd.emp.model.Menus;

import java.util.List;

public interface IMenusDao {
    /*查询所有的一级菜单*/
    List<Menus> getMenuList();
}
