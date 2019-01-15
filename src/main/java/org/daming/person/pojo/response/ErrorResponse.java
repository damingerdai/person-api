package org.daming.person.pojo.response;

import org.daming.person.pojo.ApiError;

public class ErrorResponse extends CommonResponse {
    private static final long serialVersionUID = -5750459301584266674L;

    private ApiError error;

    public ApiError getError() {
        return error;
    }

    public ErrorResponse setError(ApiError error) {
        this.error = error;
        return this;
    }
}
