package org.daming.person.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.daming.person.pojo.doman.Person;

@Mapper
public interface PersonMapper {

    Person get(String id);
}
