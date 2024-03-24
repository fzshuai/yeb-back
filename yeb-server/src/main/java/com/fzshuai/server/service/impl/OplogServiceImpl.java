package com.fzshuai.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fzshuai.server.mapper.OplogMapper;
import com.fzshuai.server.pojo.Oplog;
import com.fzshuai.server.service.IOplogService;
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
public class OplogServiceImpl extends ServiceImpl<OplogMapper, Oplog> implements IOplogService {

}
