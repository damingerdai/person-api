package org.daming.person.api;

import io.swagger.annotations.Api;
import org.daming.person.pojo.doman.Person;
import org.daming.person.pojo.response.CommonResponse;
import org.daming.person.pojo.response.DataResponse;
import org.daming.person.service.PersonService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
@Api(tags = "Person Api")
public class ApiController {

    private PersonService personService;

    @GetMapping("/person/{id}")
    public DataResponse<Person> get(@PathVariable(name = "id")String id) {
        return new DataResponse<>(personService.get(id));
    }

    @PutMapping("/person")
    public CommonResponse add(Person person) {
        personService.create(person);
        return new CommonResponse();
    }

    @PostMapping("/person")
    public CommonResponse update(Person person) {
        personService.update(person);
        return new CommonResponse();
    }

    @DeleteMapping("/person/{id}")
    public CommonResponse delete(@PathVariable(name = "id")String id) {
        personService.delete(id);
        return new CommonResponse();
    }

    public ApiController(PersonService personService) {
        super();
        this.personService = personService;
    }


}
