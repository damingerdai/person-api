package org.daming.person.service;

import org.daming.person.Application;
import org.daming.person.pojo.doman.Person;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
@Transactional
public class PersonServiceTest {

    private PersonService personService;

    @Before
    public void before() {
        assertNotNull(personService);
    }

    @Test
    public void get() {
        personService.get("1");
    }

    @Test
    public void update() {
        Person person = new Person().setId("1").setName("daming");
        personService.update(person);
    }

    @Test
    public void add() {
        Person person = new Person().setName("daming2");
        personService.create(person);
    }

    @Test
    public void delete() {
        personService.delete("1");
    }

    @Autowired
    public void setPersonService(PersonService personService) {
        this.personService = personService;
    }

}