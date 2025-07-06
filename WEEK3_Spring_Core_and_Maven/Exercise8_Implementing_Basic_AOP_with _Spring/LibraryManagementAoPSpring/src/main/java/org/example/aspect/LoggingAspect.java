package org.example.aspect;

import org.aspectj.lang.JoinPoint;

public class LoggingAspect {
    public void logBefore(JoinPoint joinPoint) {
        System.out.println("[BEFORE] Method called: " + joinPoint.getSignature().getName());
    }

    // After method execution
    public void logAfter(JoinPoint joinPoint) {
        System.out.println("[AFTER] Method completed: " + joinPoint.getSignature().getName());
    }
}
