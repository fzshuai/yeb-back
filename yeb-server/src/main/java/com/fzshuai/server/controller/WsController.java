package com.fzshuai.server.controller;

import com.fzshuai.server.pojo.Admin;
import com.fzshuai.server.pojo.ChatMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;

import java.time.LocalDateTime;

/**
 * @author 软件二班傅同学
 * @description websocket
 * @date 2021-03-27 11:36
 */
@Controller
public class WsController {

    @Autowired
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/ws/chat")
    public void handleMsg(Authentication authentication, ChatMsg chatMsg) {
        Admin admin = (Admin) authentication.getPrincipal();
        chatMsg.setFrom(admin.getUsername());
        chatMsg.setFormNickName(admin.getName());
        chatMsg.setData(LocalDateTime.now());
        simpMessagingTemplate.convertAndSendToUser(chatMsg.getTo(), "/queue/chat", chatMsg);
    }
}
