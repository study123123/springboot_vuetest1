package com.jxd.emp.model;

import java.util.List;

/**
 * @ClassName Menus
 * @Description TODO
 * @Author lixiaoru
 * @Date 2021/8/16
 * @Version 1.0
 */
public class Menus {
    /*一级菜单基本属性*/
    private int id;
    private String title;
    private String path;

    /*子菜单*/
    private List<Menus> subMenu;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public List<Menus> getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(List<Menus> subMenu) {
        this.subMenu = subMenu;
    }
}
