package org.daming.person.pojo;

import java.io.Serializable;

public class ApiError implements Serializable {

    private static final long serialVersionUID = -354720617069723966L;

    private String code;

    private String message;

    public String getCode() {
        return code;
    }

    public ApiError setCode(String code) {
        this.code = code;
        return this;
    }

    public String getMessage() {
        return message;
    }

    public ApiError setMessage(String message) {
        this.message = message;
        return this;
    }
}
