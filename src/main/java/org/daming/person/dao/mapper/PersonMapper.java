package org.daming.person.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.daming.person.pojo.doman.Person;
import org.daming.person.pojo.type.handler.GenderTypeHandler;

@Mapper
public interface PersonMapper {

    @Select("SELECT id, `name`, surname,gender,birthday, tellphone, province, city, `area`, address FROM person WHERE id = #{id}")
    @Results({
            @Result(column = "gender", property = "gender", typeHandler = GenderTypeHandler.class)
    })
    Person get(@Param("id") String id);

    @Update("UPDATE person SET `name` = #{name}, gender = #{gender}, surname = #{surname}, birthday = #{birthday}, tellphone = #{tellphone}, province = #{province}, city = #{city}, `area` = #{area}, update_user = 'system', update_date = NOW() WHERE id = #{id}")
    void update(Person person);

    void add(Person person);

    void delete(String id);
}
