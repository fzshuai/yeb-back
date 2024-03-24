package com.fzshuai.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fzshuai.server.mapper.MenuRoleMapper;
import com.fzshuai.server.pojo.MenuRole;
import com.fzshuai.server.pojo.RespBean;
import com.fzshuai.server.service.IMenuRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 软件二班傅同学
 * @since 2021-02-22
 */
@Service
public class MenuRoleServiceImpl extends ServiceImpl<MenuRoleMapper, MenuRole> implements IMenuRoleService {

    @Autowired
    private MenuRoleMapper menuRoleMapper;

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     * @return
     */
    @Override
    public RespBean updateMenuRole(Integer rid, Integer[] mids) {
        menuRoleMapper.delete(new QueryWrapper<MenuRole>().eq("rid", rid));
        if (null == mids || 0 == mids.length) {
            return RespBean.success("更新成功！");
        }
        Integer result = menuRoleMapper.insertRecord(rid, mids);
        if (result == mids.length) {
            return RespBean.success("更新成功！");
        }
        return RespBean.error("更新失败！");
    }
}
