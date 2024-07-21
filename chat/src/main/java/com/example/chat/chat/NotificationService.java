package com.example.chat.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    private final SimpMessagingTemplate simpMessagingTemplate;

    @Autowired
    public NotificationService(SimpMessagingTemplate simpMessagingTemplate) {
        this.simpMessagingTemplate = simpMessagingTemplate;
    }

    public void notifyUser(String userId, String payload) {
        String destination = "/queue/someQueue";
        simpMessagingTemplate.convertAndSendToUser(userId, destination, payload);
    }
}
