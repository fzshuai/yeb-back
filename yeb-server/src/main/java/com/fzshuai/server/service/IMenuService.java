package com.fzshuai.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fzshuai.server.pojo.Menu;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 软件二班傅同学
 * @since 2021-02-22
 */
public interface IMenuService extends IService<Menu> {

    /**
     * 根据用户id查询菜单列表
     * @return
     */
    List<Menu> getMenusByAdminId();

    /**
     * 根据角色获取菜单列表
     * @return
     */
    List<Menu> getMenusWithRole();

    /**
     * 查询所有菜单
     * @return
     */
    List<Menu> getAllMenus();
}
