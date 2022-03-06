package com.pasword.reminder.password_reminder.utils;

import com.pasword.reminder.password_reminder.model.App;
import com.pasword.reminder.password_reminder.model.User;
import com.pasword.reminder.password_reminder.model.dto.AppRequest;
import com.pasword.reminder.password_reminder.model.dto.AppResponse;
import com.pasword.reminder.password_reminder.model.dto.AppsResponse;

import java.util.ArrayList;
import java.util.List;

public class AppConverter {

    private AppConverter() {
        throw new IllegalStateException("Utility class");
    }

    public static App coverteAppDtoToApp(AppRequest appRequest, User user) {
        return App.builder().appName(appRequest.getAppName()).userApp(appRequest.getUser())
                .passwordApp(appRequest.getPassword()).user(user).build();
    }

    public static AppResponse coverteAppToAppResponse(App app) {
        return AppResponse.builder().id(app.getId()).appName(app.getAppName()).username(app.getUserApp()).password(app.getPasswordApp()).build();
    }

    public static AppsResponse converteApptoAppsResponse(List<App> apps) {

        AppsResponse appsResponse = new AppsResponse();
        if (!apps.isEmpty()) {
            User user = apps.get(0).getUser();
            List<AppResponse> appResponseList = new ArrayList<>();
            appsResponse.setUserId(user.getId());
            appsResponse.setName(user.getName());
            appsResponse.setUser(user.getEmail());
            appsResponse.setApps(appResponseList);
            apps.forEach(app -> {
                AppResponse appResponse = new AppResponse();
                appResponse.setId(app.getId());
                appResponse.setAppName(app.getAppName());
                appResponse.setUsername(app.getUserApp());
                appResponse.setPassword(app.getPasswordApp());
                appResponse.setCreatedAt(app.getCreatedAt());
                appResponse.setUpdatedAt(app.getUpdatedAt());
                appResponseList.add(appResponse);
            });
        }
        return appsResponse;
    }
}
