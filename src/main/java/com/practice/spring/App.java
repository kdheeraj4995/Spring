package com.practice.spring;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

 
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        User user = (User)context.getBean("user");
        
        user.display();
        
        ((ClassPathXmlApplicationContext) context).close();  
    }
}
