package org.daming.person.service;

import org.daming.person.pojo.doman.Person;

public interface PersonService {

    Person get(String id);

    void update(Person person);

    void create(Person person);

    void delete(String id);
}
