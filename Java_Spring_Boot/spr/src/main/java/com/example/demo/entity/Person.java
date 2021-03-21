package com.example.demo.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity // чтобы код понял, что это сущность(таблица)
@Data // no getter & setter
@NoArgsConstructor // no constr
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // авто заполнение id
    private Long id; // Long - большие цифры

    private String firstName;
    private String lastName;
    private String city;
    private String street;
}
