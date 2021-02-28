package com.pasword.reminder.password_reminder.service;

import com.pasword.reminder.password_reminder.model.User;
import com.pasword.reminder.password_reminder.model.dto.UserRequest;
import com.pasword.reminder.password_reminder.model.dto.UserResponse;
import com.pasword.reminder.password_reminder.repository.UserRepository;
import com.pasword.reminder.password_reminder.utils.UserConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void save(UserRequest userRequest) {
        User user = UserConverter.converteUserRequestToUser(userRequest);
        repository.save(user);
    }

    public UserResponse findById(Long id){
        User user = repository.findById(id).orElse(null);
        return UserConverter.convertUserToUserResponse(user);
    }
}
