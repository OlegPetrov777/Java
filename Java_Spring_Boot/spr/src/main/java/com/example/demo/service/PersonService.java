package com.example.demo.service;

import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // ну типа сервис
public class PersonService {
    @Autowired // нет конструтора, нет создания обьектов
    private PersonRepository personRepository;

    public void create(Person person){
        personRepository.save(person);
    }

    public List<Person> findAll(){
        return personRepository.findAll();
    }

    public Optional<Person> find(Long id){
        return personRepository.findById(id);
    }
}
