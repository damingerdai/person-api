package org.daming.person.interceptor;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.daming.person.pojo.logger.LoggerManager;
import org.daming.person.pojo.logger.PersonLogger;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Aspect
@Component
public class ControllerInterceptor {

    private PersonLogger logger;
    private ObjectMapper jsonMapper;

    @Pointcut("execution(* org.daming.person.api..*(..)) && (@annotation(org.springframework.web.bind.annotation.DeleteMapping) || @annotation(org.springframework.web.bind.annotation.GetMapping) || @annotation( org.springframework.web.bind.annotation.PostMapping) || @annotation(org.springframework.web.bind.annotation.PutMapping) || @annotation(org.springframework.web.bind.annotation.RequestMapping))")
    public void controllerMethodPointcut() {}

    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        RequestAttributes ra = RequestContextHolder.getRequestAttributes();
        ServletRequestAttributes sra = (ServletRequestAttributes)ra;
        HttpServletRequest request = sra.getRequest();

        Object result = pjp.proceed();

        return result;
    }

    private String getMethodArgs(Object[] args) throws JsonProcessingException {
        StringBuilder sb = new StringBuilder();
        for (int i=0; i < args.length; i++) {
            sb.append("arg[").append(i).append("]: ").append(jsonMapper.writeValueAsString(args[i])).append(",");
        }
        if (args.length > 0) {
            sb.deleteCharAt(sb.length() - 1);
        }
        return sb.toString();
    }

    public ControllerInterceptor(LoggerManager loggerManager,ObjectMapper jsonMapper) {
        super();
        this.logger = loggerManager.getApiLogger();
        this.jsonMapper = jsonMapper;
    }
}
