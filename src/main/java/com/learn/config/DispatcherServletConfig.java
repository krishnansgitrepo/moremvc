package com.learn.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class DispatcherServletConfig  extends AbstractAnnotationConfigDispatcherServletInitializer {
    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() {
        Class[] configClass = {PaymentAppConfig.class};
        return configClass;
    }

    protected String[] getServletMappings() {
        String[] servletMapping = {"/"};
        return servletMapping;
    }
}
