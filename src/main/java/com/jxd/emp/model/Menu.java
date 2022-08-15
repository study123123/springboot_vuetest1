package com.jxd.emp.model;

import java.util.List;

/**
 * @ClassName Menu
 * @Description TODO
 * @Author lixiaoru
 * @Date 2021/8/15
 * @Version 1.0
 */
public class Menu {
    private int id;
    private String title;
    private String path;
    //子菜单
    private List<Menu> subMenu;

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

    public List<Menu> getSubMenu() {
        return subMenu;
    }

    public void setSubMenu(List<Menu> subMenu) {
        this.subMenu = subMenu;
    }
}
