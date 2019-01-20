package org.daming.person.service.impl;

import org.daming.person.dao.mapper.PersonMapper;
import org.daming.person.pojo.doman.Person;
import org.daming.person.service.PersonService;
import org.daming.person.utils.SnowflakeIdWorker;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

@Service
public class PersonServiceImpl implements PersonService {

    private PersonMapper personMapper;

    private SnowflakeIdWorker snowflakeIdWorker;

    @Override
    public Person get(String id) {
        return personMapper.get(id);
    }

    @Override
    public void update(Person person) {
        personMapper.update(person);
    }

    @Override
    public void create(Person person) {
        if (StringUtils.isEmpty(person.getId())) {
            person.setId(String.valueOf(snowflakeIdWorker.nextId()));
        }
        personMapper.add(person);
    }

    @Override
    public void delete(String id) {

    }

    public PersonServiceImpl(PersonMapper personMapper, SnowflakeIdWorker snowflakeIdWorker) {
        this.personMapper = personMapper;
        this.snowflakeIdWorker = snowflakeIdWorker;
    }
}
