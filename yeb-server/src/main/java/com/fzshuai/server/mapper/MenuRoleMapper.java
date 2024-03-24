package com.fzshuai.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fzshuai.server.pojo.MenuRole;
import org.apache.ibatis.annotations.Param;

import java.net.Inet4Address;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 软件二班傅同学
 * @since 2021-02-22
 */
public interface MenuRoleMapper extends BaseMapper<MenuRole> {

    /**
     * 更新角色菜单
     * @param rid
     * @param mids
     */
    Integer insertRecord(@Param("rid") Integer rid, @Param("mids") Integer[] mids);
}
