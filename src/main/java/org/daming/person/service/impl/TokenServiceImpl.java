package org.daming.person.service.impl;

import org.daming.person.pojo.UserToken;
import org.daming.person.service.TokenService;
import org.springframework.stereotype.Service;

@Service
public class TokenServiceImpl implements TokenService {

    @Override
    public UserToken getToken(String username, String password) {
        return null;
    }

    @Override
    public void validateToken(String token) {

    }

    @Override
    public UserToken refreshToken(String token) {
        return null;
    }
}
