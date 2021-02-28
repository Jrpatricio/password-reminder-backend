package com.pasword.reminder.password_reminder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class PasswordReminderApplication {

    public static void main(String[] args) {
        SpringApplication.run(PasswordReminderApplication.class, args);
    }

}
