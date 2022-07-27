package ru.gegcuk.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifaCycleDemoApp {

	public static void main(String[] args) {
		//load the spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
		
		
		//Retrieve bean from spring container		
		Coach theCoach = context.getBean("myCoach", Coach.class);
		
		//check if they are same
		System.out.println(theCoach.getDailyWorkout());

		//close the context
		context.close();
	}

}
