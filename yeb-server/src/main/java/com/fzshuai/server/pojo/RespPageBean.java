package com.fzshuai.server.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author 软件二班傅同学
 * @description 分页公共返回对象
 * @date 2021-02-25 9:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RespPageBean {
    /**
     * 总条数
     */
    private Long total;
    /**
     * 数据list
     */
    private List<?> data;
}
