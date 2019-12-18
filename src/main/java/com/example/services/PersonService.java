package com.example.services;

import com.example.models.Person;
import com.example.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    //@Autowired
    //private PersonRepository personRepository;

    public List<Person> list() {
        return null;//personRepository.findAll();
    }
}
