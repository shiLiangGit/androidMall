package com.example.myfirstapp.entity;

public class Menu {
    public int icon;
    public String menuName;

    public Menu(int icon, String menuName) {
        this.setIcon(icon);
        this.setMenuName(menuName);
    }

    public int getIcon() {
        return icon;
    }

    public void setIcon(int icon) {
        this.icon = icon;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }
}
