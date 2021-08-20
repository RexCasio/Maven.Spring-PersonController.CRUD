package io.zipcoder.crudapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonController {
    ResponseEntity responseEntity;

    @Autowired
    public PersonRepository personRepository;

    @PostMapping("/person/{firstName}/{lastName}")
    public ResponseEntity createPerson(@PathVariable String firstName, @PathVariable String lastName) {
     Person person = new Person(firstName, lastName);
     //setid if it doesnt work
        personRepository.save(person);
     return new ResponseEntity<>("Person Created", HttpStatus.CREATED);
    }
    @GetMapping
    public Person getPerson(Integer id) {
        return personRepository.findOne(id);
    }
//    @GetMapping
//    public Iterable<Person> getPersonList() {
//        return personRepository.findAll();
//    }
    @PutMapping
    public Person updatePerson(Person p){
        return personRepository.save(p);
    }
    @DeleteMapping
    public void deletePerson(@PathVariable() Integer id) {

    }
}