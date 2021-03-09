package com.pasword.reminder.password_reminder.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class App implements Serializable {

    private static final long serialVersionUID = 6861698493877608766L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String appName;

    @NotBlank
    private String userApp;

    @NotBlank
    private String passwordApp;

    @ManyToOne
    private User user;
}
