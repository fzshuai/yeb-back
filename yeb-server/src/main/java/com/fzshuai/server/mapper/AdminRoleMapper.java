package com.fzshuai.server.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fzshuai.server.pojo.AdminRole;
import com.fzshuai.server.pojo.RespBean;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 软件二班傅同学
 * @since 2021-02-22
 */
public interface AdminRoleMapper extends BaseMapper<AdminRole> {

    /**
     * 更新操作员角色
     * @param adminId
     * @param rids
     * @return
     */
    Integer addAdminRole(@Param("adminId") Integer adminId, @Param("rids") Integer[] rids);
}
