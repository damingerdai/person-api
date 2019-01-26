package org.daming.person.service;

import org.daming.person.pojo.UserToken;

public interface TokenService {

    UserToken getToken(String username, String password);

    void validateToken(String token);

    UserToken refreshToken(String token);
}
