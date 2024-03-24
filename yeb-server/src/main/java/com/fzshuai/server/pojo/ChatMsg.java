package com.fzshuai.server.pojo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

/**
 * @author 软件二班傅同学
 * @description 消息
 * @date 2021-03-27 10:43
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class ChatMsg {

    private String from;
    private String to;
    private String content;
    private LocalDateTime data;
    private String formNickName;
}
