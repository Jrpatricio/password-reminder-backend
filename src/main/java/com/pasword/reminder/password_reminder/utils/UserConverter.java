package com.pasword.reminder.password_reminder.utils;

import com.pasword.reminder.password_reminder.model.User;
import com.pasword.reminder.password_reminder.model.dto.UserRequest;
import com.pasword.reminder.password_reminder.model.dto.UserResponse;
import org.springframework.util.ObjectUtils;

public class UserConverter {

    private UserConverter() {
        throw new IllegalStateException("Utility class");
    }

    public static User converteUserRequestToUser(UserRequest userRequest) {
        return User.builder().name(userRequest.getName()).email(userRequest.getUsername()).password(userRequest.getPassword()).build();
    }

    public static UserResponse convertUserToUserResponse(User user) {
        if (ObjectUtils.isEmpty(user)) {
            return new UserResponse();
        }
        return UserResponse.builder().id(user.getId()).name(user.getName()).email(user.getEmail()).password(user.getPassword()).build();
    }
}
