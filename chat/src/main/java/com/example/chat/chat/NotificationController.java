package com.example.chat.chat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    private final NotificationService notificationService;

    @Autowired
    public NotificationController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    @GetMapping("/notify")
    public String notifyUser(@RequestParam String userId, @RequestParam String message) {
        notificationService.notifyUser(userId, message);
        return "Notification sent to user: " + userId;
    }
}
