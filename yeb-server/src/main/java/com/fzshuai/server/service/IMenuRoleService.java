package com.fzshuai.server.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fzshuai.server.pojo.MenuRole;
import com.fzshuai.server.pojo.RespBean;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 软件二班傅同学
 * @since 2021-02-22
 */
public interface IMenuRoleService extends IService<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    RespBean updateMenuRole(Integer rid, Integer[] mids);
}
