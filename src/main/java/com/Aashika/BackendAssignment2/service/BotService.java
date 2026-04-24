package com.Aashika.BackendAssignment2.service;

import org.springframework.stereotype.Service;

@Service
public class BotService {

    public String getReply(String message) {
        if(message == null) return "I did not understand that.";
        switch(message.trim().toLowerCase()) {
            case "hi":
                return "Hello!";
            case "bye":
                return "Goodbye!";
            default:
                return "I did not understand that.";
        }
    }
}
