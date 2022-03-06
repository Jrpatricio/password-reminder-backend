package com.pasword.reminder.password_reminder.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AppsResponse {
    Long userId;
    String name;
    String user;
    List<AppResponse> apps;
}
