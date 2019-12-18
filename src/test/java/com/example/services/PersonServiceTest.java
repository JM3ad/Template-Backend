package com.example.services;

import com.example.models.Person;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceTest {

    @Autowired
    private PersonService personService;

    @Ignore
    @Test
    public void whenApplicationStarts_thenHibernateCreatesInitialRecords() {
        List<Person> people = personService.list();

        Assert.assertEquals(people.size(), 3);
    }
}