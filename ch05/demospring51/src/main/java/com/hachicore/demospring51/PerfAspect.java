package com.hachicore.demospring51;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;

@Component
@Aspect
public class PerfAspect {

    // @Around("execution(* com.hachicore..*.EventService.*(..))")
    // @Around("@annotation(PerLogging)")
    @Around("bean(simpleEventService)")
    public Object logPerf(ProceedingJoinPoint pjp) throws Throwable {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        Object retVal = pjp.proceed();

        stopWatch.stop();

        System.out.println(stopWatch.prettyPrint());
        return retVal;
    }

    @Before("bean(simpleEventService)")
    public void hello() {
        System.out.println("hello");
    }

}
