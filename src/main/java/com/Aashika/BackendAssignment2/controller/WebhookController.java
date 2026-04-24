package com.Aashika.BackendAssignment2.controller;


import com.Aashika.BackendAssignment2.dtos.MessageRequestDTO;
import com.Aashika.BackendAssignment2.dtos.MessageResponseDTO;
import com.Aashika.BackendAssignment2.service.BotService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class WebhookController {

    @Autowired
    private BotService botService;

    @PostMapping("/webhook")
    public ResponseEntity<MessageResponseDTO> receiveMessage(@Valid @RequestBody MessageRequestDTO dto) {
        log.info("Incoming message: {}", dto.getMessage());
        String reply = botService.getReply(dto.getMessage());
        return ResponseEntity.ok(MessageResponseDTO.builder().reply(reply).build());
    }

}
