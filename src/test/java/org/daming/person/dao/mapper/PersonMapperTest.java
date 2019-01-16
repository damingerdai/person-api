package org.daming.person.dao.mapper;

import org.daming.person.Application;
import org.daming.person.pojo.doman.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.*;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class)
public class PersonMapperTest {

    @Autowired
    private PersonMapper personMapper;

    @Test
    public void get() {
        Person person = personMapper.get("1");
        assertNotNull(person);
        assertNotNull(person.getGender());
        System.out.println(person);
    }

}