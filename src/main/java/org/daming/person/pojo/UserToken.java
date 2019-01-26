package org.daming.person.pojo;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.Serializable;

public class UserToken implements Serializable {
    private static final long serialVersionUID = 6156817161731552023L;

    private String accessToken;

    private String refreshToken;

    private long exp;

    public String getAccessToken() {
        return accessToken;
    }

    public UserToken setAccessToken(String accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public UserToken setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
        return this;
    }

    public long getExp() {
        return exp;
    }

    public UserToken setExp(long exp) {
        this.exp = exp;
        return this;
    }

    public UserToken() {
        super();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("accessToken", accessToken)
                .append("refreshToken", refreshToken)
                .append("exp", exp)
                .toString();
    }
}
