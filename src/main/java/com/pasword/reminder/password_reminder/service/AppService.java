package com.pasword.reminder.password_reminder.service;

import com.pasword.reminder.password_reminder.model.App;
import com.pasword.reminder.password_reminder.model.User;
import com.pasword.reminder.password_reminder.model.dto.AppRequest;
import com.pasword.reminder.password_reminder.model.dto.AppResponse;
import com.pasword.reminder.password_reminder.model.dto.AppsResponse;
import com.pasword.reminder.password_reminder.repository.AppRepository;
import com.pasword.reminder.password_reminder.repository.UserRepository;
import com.pasword.reminder.password_reminder.utils.AppConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppService {

    @Autowired
    private AppRepository repository;

    @Autowired
    private UserRepository userRepository;


    public void save(AppRequest appRequest) {
        User user = userRepository.findById(appRequest.getUserId()).orElseThrow(RuntimeException::new);
        App app = AppConverter.coverteAppDtoToApp(appRequest, user);
        repository.save(app);
    }

    public AppResponse findByAppId(Long id) {
        App app = repository.findById(id).orElseThrow(RuntimeException::new);
        return AppConverter.coverteAppToAppResponse(app);
    }

    public AppsResponse findByUserId(Long id) {
        List<App> apps = repository.findByUser_Id(id);
        return AppConverter.converteApptoAppsResponse(apps);
    }
}
