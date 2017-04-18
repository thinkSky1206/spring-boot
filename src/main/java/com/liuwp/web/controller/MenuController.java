package com.liuwp.web.controller;

import com.liuwp.model.Menu;
import com.liuwp.service.MenuService;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: liuwuping
 * Date: 17/4/18
 * Description:
 */
@RestController
@RequestMapping("/menus")
public class MenuController {


    @Autowired
    private MenuService menuService;


    @RequestMapping("/list")
    public List<Menu> getMenus() {
        return menuService.listMenu();
    }

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

}
