package com.pasword.reminder.password_reminder.controller;

import com.pasword.reminder.password_reminder.model.dto.AppRequest;
import com.pasword.reminder.password_reminder.model.dto.AppResponse;
import com.pasword.reminder.password_reminder.model.dto.AppsResponse;
import com.pasword.reminder.password_reminder.service.AppService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@CrossOrigin("*")
@RestController
@RequestMapping("apps")
public class AppController {

    @Autowired
    private AppService service;

    @PostMapping
    public void cria(@Valid @RequestBody AppRequest app){
        service.save(app);
    }

    @GetMapping("{id}")
    public AppResponse buscaApps(@PathVariable Long id){
        return service.findByAppId(id);
    }

    @GetMapping
    public AppsResponse buscaAppPorUsuario(@RequestParam("user") Long id){
        return service.findByUserId(id);
    }
}