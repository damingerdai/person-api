package org.daming.person.pojo.exceptions;

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
}
