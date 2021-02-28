package com.pasword.reminder.password_reminder.controller;

import com.pasword.reminder.password_reminder.model.dto.UserRequest;
import com.pasword.reminder.password_reminder.model.dto.UserResponse;
import com.pasword.reminder.password_reminder.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("users")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    public void cria(@Valid @RequestBody UserRequest user) {
        service.save(user);
    }

    @GetMapping("{id}")
    public UserResponse buscaPorId(@PathVariable Long id) {
        return service.findById(id);
    }
}
