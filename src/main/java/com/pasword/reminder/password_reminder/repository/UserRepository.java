package com.pasword.reminder.password_reminder.repository;

import com.pasword.reminder.password_reminder.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
