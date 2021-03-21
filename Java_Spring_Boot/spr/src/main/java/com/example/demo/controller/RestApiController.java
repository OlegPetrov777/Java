package com.example.demo.controller;

import com.example.demo.entity.Person;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // ну типа контроллер (важно)
public class RestApiController {
    private final PersonService personService;

    @Autowired // нет конструтора, нет создания обьектов
    public RestApiController(PersonService personService){
        this.personService = personService;
    }

    @PostMapping(value = "/api/persons")
    public ResponseEntity<?> create(@RequestBody Person person){
        personService.create(person);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @GetMapping(value = "/api/persons")
    public ResponseEntity<?> findAll(){
        final List<Person> personList = personService.findAll();

        return personList != null && !personList.isEmpty()
                ? new ResponseEntity<>(personList, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping(value = "/api/persons/{id}")
    public ResponseEntity<Optional<Person>> find(@PathVariable(name="id") Long id){
        final Optional<Person> person = personService.find(id);

        return person.isPresent()
                ? new ResponseEntity<>(person, HttpStatus.OK)
                : new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
