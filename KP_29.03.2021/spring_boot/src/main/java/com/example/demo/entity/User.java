package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.text.DateFormat;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String login;

    private String last_name;

    private String first_name;

    private String patronymic;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate birthday;

    @OneToMany(targetEntity = Task.class)
    private List task;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate date_of_create;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate date_of_update;
}
