package org.daming.person.api;

import org.daming.person.doman.Person;
import org.daming.person.pojo.response.DataResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
public class ApiController {

    @GetMapping("/person/{id}")
    public DataResponse<Person> get(@PathVariable(name = "id")int id) {
        return new DataResponse<>(new Person().setName("daming"));
    }
}
