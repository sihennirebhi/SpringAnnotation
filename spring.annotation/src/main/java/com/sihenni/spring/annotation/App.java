package com.sihenni.spring.annotation;

import javax.security.auth.login.AppConfigurationEntry;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext factory = new AnnotationConfigApplicationContext(MyAppConfig.class);
    	
    	Samsung j6Pro = factory.getBean(Samsung.class);
        j6Pro.config();
    }
}
