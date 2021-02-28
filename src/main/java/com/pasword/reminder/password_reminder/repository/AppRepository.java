package com.pasword.reminder.password_reminder.repository;

import com.pasword.reminder.password_reminder.model.App;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AppRepository extends JpaRepository<App, Long> {

    List<App> findByUser_Id(Long id);
}
