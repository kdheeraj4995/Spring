package com.practice.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class App 
{
    @SuppressWarnings("resource")
	public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        context.registerShutdownHook();
        User user = (User)context.getBean("user");
        
        user.display();
        user.getTrial().Call();
        
          
    }
}
