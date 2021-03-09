package com.pasword.reminder.password_reminder.model.dto;

import lombok.Builder;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Builder
@Data
public class AppRequest {

    @NotBlank
    private String appName;

    @NotBlank
    private String user;

    @NotBlank
    private String password;

    @NotNull
    private Long userId;
}
