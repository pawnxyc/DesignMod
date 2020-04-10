package springboot.service;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AopManager {

    private static Logger log = LoggerFactory.getLogger(AopManager.class);
    @Pointcut("execution(public * springboot.service.MessageImpl.*(..))")
    public void pointCut(){

    }
    @Around("pointCut()")
    public Object Around(ProceedingJoinPoint pjp) throws Throwable {

        Object object = pjp.proceed();
        log.info("around执行方法之后--返回值：" +object);
        return object;
    }}
