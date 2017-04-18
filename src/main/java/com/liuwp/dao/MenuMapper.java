package com.liuwp.dao;

import com.liuwp.model.Menu;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;


@Repository
public interface MenuMapper {

   List<Menu> selectMenus();

}