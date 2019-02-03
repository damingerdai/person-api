package org.daming.person.pojo.logger;

import org.daming.person.constants.CommonConstants;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

@Component
public class LoggerManager {

    private Map<String, PersonLogger> cache;

    public PersonLogger getCommonLogger() {
        return getLogger(CommonConstants.LOGGER_NAME_COMMON);
    }

    public PersonLogger getErrorLogger() {
        return getLogger(CommonConstants.LOGGER_NAME_ERROR);
    }

    public PersonLogger getApiLogger() {
        return getLogger(CommonConstants.LOGGER_NAME_API);
    }

    public PersonLogger getJdbcLogger() {
        return getLogger(CommonConstants.LOGGER_NAME_JDBC);
    }

    public PersonLogger getLogger(String loggerName) {
        return cache.computeIfAbsent(loggerName, this::buildLogger);
    }

    private PersonLogger buildLogger(String loggerName) {
        return new PersonLogger(LoggerFactory.getLogger(loggerName));
    }

    @PostConstruct
    private void init() {
        cache = new HashMap<>();
    }

}