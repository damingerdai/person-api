package org.daming.person.pojo.exceptions;

import org.apache.commons.lang3.builder.ToStringBuilder;

public class PersonException extends RuntimeException {
    private static final long serialVersionUID = 3438293102481957478L;

    private String code;

    private String message;

    private Throwable cause;

    public String getCode() {
        return code;
    }

    public PersonException setCode(String code) {
        this.code = code;
        return this;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public PersonException setMessage(String message) {
        this.message = message;
        return this;
    }

    @Override
    public Throwable getCause() {
        return cause;
    }

    public PersonException setCause(Throwable cause) {
        this.cause = cause;
        return this;
    }

    public PersonException() {
        super();
    }

    public PersonException(String code, String message) {
        super();
        this.code = code;
        this.message = message;
    }

    public PersonException(String code, String message, Throwable cause) {
        super();
        this.code = code;
        this.message = message;
        this.cause = cause;
    }


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("code", code)
                .append("message", message)
                .append("cause", cause)
                .toString();
    }
}
