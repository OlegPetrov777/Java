package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate date_of_completion;

    private Boolean complete;

    @ManyToOne
    private Category category;

    @ManyToOne
    private User user;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate date_of_create;

    @JsonFormat(pattern = "dd.MM.yyyy")
    private LocalDate date_of_update;
}
