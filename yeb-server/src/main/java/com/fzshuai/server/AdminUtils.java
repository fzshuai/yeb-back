package com.fzshuai.server;

import com.fzshuai.server.pojo.Admin;
import org.springframework.security.core.context.SecurityContextHolder;

/**
 * @author 软件二班傅同学
 * @description 操作员工具类
 * @date 2021-02-24 20:39
 */
public class AdminUtils {

    /**
     * 获取当前登录操作员
     *
     * @return
     */
    public static Admin getCurrentAdmin() {
        return (Admin) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
    }
}
