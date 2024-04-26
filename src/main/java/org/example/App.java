package org.example;

import org.example.model.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("containerConfig.xml");
        User user=context.getBean("car", User.class);
        System.out.println(user);
    }
}
