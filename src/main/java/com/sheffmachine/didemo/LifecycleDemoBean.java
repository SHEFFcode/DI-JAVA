package com.sheffmachine.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class LifecycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
    public LifecycleDemoBean() {
        System.out.println("I'm the lifecycle bean constructor");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory has been set.");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean name has been set.");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Destroy method has been called.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Properties have been set.");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context has been set.");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post construct is running");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("Destroy method has been called.");
    }

    public void beforeInit() {
        System.out.println("Before init.");
    }

    public void afterInit() {
        System.out.println("After init.");
    }

    public void postInit() {
        System.out.println("Post init");
    }
}
