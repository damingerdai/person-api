package org.daming.person.api;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.daming.person.enums.Gender;
import org.daming.person.pojo.doman.Person;
import org.daming.person.pojo.response.CommonResponse;
import org.daming.person.pojo.response.DataResponse;
import org.daming.person.service.PersonService;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path = "api/v1")
@Api(tags = "Person Api")
public class ApiController {

    private PersonService personService;

    @ApiOperation(value = "查询个人信息", notes = "根据ID查询个人信息")
    @ApiImplicitParam(name = "id", value = "个人ID", paramType = "path", required = true, dataType = "String")
    @ApiResponses({
            @ApiResponse(code=200,message="成功",response=DataResponse.class),
    })
    @GetMapping("/person/{id}")
    public DataResponse<Person> get(@PathVariable(name = "id")String id) {
        return new DataResponse<>(personService.get(id));
    }

    @ApiOperation(value = "创建个人信息", notes = "创建一个全新的个人信息")
    @ApiImplicitParam(name = "person", value = "用户信息", required = true, paramType = "body", dataType = "Person")
    @PutMapping("/person")
    public CommonResponse add(@RequestBody Person person) {
        personService.create(person);
        return new CommonResponse();
    }

    @ApiOperation(value = "更新个人信息", notes = "根据个人ID去更新个人信息")
    @ApiImplicitParam(name = "person", value = "用户信息", required = true, paramType = "body", dataType = "Person")
    @PostMapping("/person")
    public CommonResponse update(Person person) {
        personService.update(person);
        return new CommonResponse();
    }

    @ApiOperation(value = "删除个人信息", notes = "根据ID物理删除个人信息")
    @ApiImplicitParam(name = "id", value = "个人ID", paramType = "path", required = true, dataType = "String")
    @ApiResponses({
            @ApiResponse(code=200,message="成功",response=CommonResponse.class),
    })
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
