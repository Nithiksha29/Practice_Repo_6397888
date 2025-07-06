package org.example;

import org.aspectj.lang.ProceedingJoinPoint;

public class LoggingAspect {
    public Object logExecutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();

        Object result = joinPoint.proceed(); // Proceed with the method

        long end = System.currentTimeMillis();

        System.out.println("Execution Time of " + joinPoint.getSignature() + ": " + (end - start) + " ms");

        return result;
    }
}
