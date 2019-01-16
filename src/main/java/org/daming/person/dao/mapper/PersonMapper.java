package org.daming.person.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.daming.person.pojo.doman.Person;

@Mapper
public interface PersonMapper {

    @Select("SELECT id, `name`, surname, birthday, tellphone, province, city, `area`, address FROM person WHERE id = #{id}")
    Person get(@Param("id")String id);
}
