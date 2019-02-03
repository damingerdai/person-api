package org.daming.person.api;

import io.swagger.annotations.Api;
import org.daming.person.pojo.UserToken;
import org.daming.person.pojo.response.DataResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1")
@Api(tags = "Token Api")
public class TokenController {

    @PostMapping(path = "/token")
    public DataResponse<UserToken> getToken(@RequestHeader("username") String username, @RequestHeader("password") String password) {
        return null;
    }

    @PutMapping(path = "/token")
    public DataResponse<UserToken> refreshToken(@RequestHeader("refreshToken") String refreshToken) {
        return null;
    }

}
