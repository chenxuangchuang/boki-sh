package com.chenxc.cxcboki.util;

import com.alibaba.fastjson.JSON;
import org.aspectj.lang.ProceedingJoinPoint;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.jws.WebService;

/**
 * <p>Description: </p>
 *
 * @author chenxc
 * @date 2021/12/29 15:57
 */
public class TraceAdvice {
    private static final Logger logger = LoggerFactory.getLogger(TraceAdvice.class);

    /**
     * Dubbo调用客户端代理
     *
     * @param joinPoint
     * @throws Throwable
     */
    public Object dubboClientInvoke(ProceedingJoinPoint joinPoint) throws Throwable {
        return rpcClientInvoke(joinPoint, "DUBBO");
    }

    /**
     * 远程服务调用 类包含@RpcService注解，或者CXF的@WebService注解，则认为是客户端接口
     *
     * @param joinPoint
     * @throws Throwable
     */
    private Object rpcClientInvoke(ProceedingJoinPoint joinPoint, String protocol) throws Throwable {
        long start = System.currentTimeMillis();
        Class<?> clazz = joinPoint.getSignature().getDeclaringType();


        String serviceName = joinPoint.getSignature().getDeclaringTypeName();
        String methodName = joinPoint.getSignature().getName();
        String request = "null";
        if (joinPoint.getArgs().length > 0) {
            request = JSON.toJSONString(joinPoint.getArgs()[0]);
        }

        Object response = null;
        long costTime = 0;
        logger.info("调用{}远程服务{}.{}开始", protocol, serviceName, methodName);
        try {
            response = joinPoint.proceed();
            costTime = System.currentTimeMillis() - start;
//            String printLogConfig = getLogConfig(joinPoint, clazz);
            logger.info("\nRPC入参:\n" + (request) + "\nRPC出参:\n"+ (JSON.toJSONString(response)),"耗时"+costTime);
            return response;
        } catch (Exception e) {
            costTime = System.currentTimeMillis() - start;
            logger.info("\nRPC入参:\n" + request + "\nRPC异常:\n" + e.toString(),"耗时"+costTime);
            throw e;
        }
    }
}
