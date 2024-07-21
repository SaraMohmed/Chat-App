package com.example.chat.chatroom;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatRoomController {

    @Autowired
    private ChatRoomService chatRoomService;

    @PostMapping("/chatrooms")
    public ChatRoom createChatRoom(@RequestBody ChatRoom request) {
        return chatRoomService.createChatRoom(request.getChatId(), request.getSenderId(), request.getRecipientId());
    }
}
