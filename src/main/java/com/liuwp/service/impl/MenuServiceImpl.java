package com.liuwp.service.impl;

import com.liuwp.dao.MenuMapper;
import com.liuwp.model.Menu;
import com.liuwp.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: liuwuping
 * Date: 17/4/18
 * Description:
 */
@Service
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuMapper menuMapper;

    @Override
    public List<Menu> listMenu() {
        return menuMapper.selectMenus();
    }
}
