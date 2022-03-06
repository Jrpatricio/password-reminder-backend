package com.pasword.reminder.password_reminder.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppResponse {
    Long id;
    String appName;
    String username;
    String password;
    LocalDateTime createdAt;
    LocalDateTime updatedAt;
}
