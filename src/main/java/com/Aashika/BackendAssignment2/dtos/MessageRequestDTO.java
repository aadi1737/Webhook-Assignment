package com.Aashika.BackendAssignment2.dtos;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MessageRequestDTO {

    @NotBlank(message = "Input Message Can't be null.")
    private String message;
}
