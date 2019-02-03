package org.daming.person.pojo.exceptions;

import org.daming.person.pojo.logger.LoggerManager;
import org.daming.person.pojo.logger.PersonLogger;
import org.springframework.stereotype.Component;

@Component
public class ExceptionBuilder {

    private PersonLogger logger;

    public PersonException buildPersonException(String code, String message, Throwable cause) {
        var pe = new PersonException(code, message, cause);
        log(pe);
        return pe;
    }

    public PersonException buildPersonException(String code, String message) {
        var pe =  new PersonException(code, message);
        log(pe);
        return pe;
    }

    private void log(PersonException pe) {
        logger.error(() -> pe.getCode() + "," + pe.getMessage());
    }

    public ExceptionBuilder(LoggerManager loggerManager) {
        super();
        this.logger = loggerManager.getErrorLogger();
    }


}
