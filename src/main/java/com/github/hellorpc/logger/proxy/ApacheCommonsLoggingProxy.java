/*
 * Author : George <GeorgeNiceWorld@gmail.com> | <Georgeinfo@163.com>
 * Copyright (C) George (https://www.georgeinfo.com), All Rights Reserved.
 */
package com.github.hellorpc.logger.proxy;

import com.github.hellorpc.logger.GeorgeLogger;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Apache Commons logging 日志框架代理类
 *
 * @author George <GeorgeNiceWorld@gmail.com>
 */
public class ApacheCommonsLoggingProxy implements GeorgeLogger {

    private Log logger = null;

    public ApacheCommonsLoggingProxy() {

    }

    @Override
    public Object bindingClassInitLogger(Class<?> clazz) {
        //使用Apache Common 日志框架
        logger = LogFactory.getLog(clazz);
        return logger;
    }

    public boolean isTraceEnabled() {
        return logger.isTraceEnabled();
    }

    public void trace(String msg) {
        logger.trace(msg);
    }

    public void trace(String msg, Throwable t) {
        logger.trace(msg, t);
    }

    public void trace(Throwable t) {
        logger.trace(t.getMessage(), t);
    }

    public boolean isDebugEnabled() {
        return logger.isDebugEnabled();
    }

    public void debug(String msg) {
        logger.debug(msg);
    }

    public void debug(String msg, Throwable t) {
        logger.debug(msg, t);
    }

    public void debug(Throwable t) {
        logger.debug(t.getMessage(), t);
    }

    public boolean isInfoEnabled() {
        return logger.isInfoEnabled();
    }

    public void info(String msg) {
        logger.info(msg);
    }

    public void info(String msg, Throwable t) {
        logger.info(msg, t);
    }

    public void info(Throwable t) {
        logger.info(t.getMessage(), t);
    }

    public boolean isWarnEnabled() {
        return logger.isWarnEnabled();
    }

    public void warn(String msg) {
        logger.warn(msg);
    }

    public void warn(String msg, Throwable t) {
        logger.warn(msg, t);
    }

    public void warn(Throwable t) {
        logger.warn(t.getMessage(), t);
    }

    public boolean isErrorEnabled() {
        return logger.isErrorEnabled();
    }

    public void error(String msg) {
        logger.error(msg);
    }

    public void error(String msg, Throwable t) {
        logger.error(msg, t);
    }

    public void error(Throwable t) {
        logger.error(t.getMessage(), t);
    }
}
