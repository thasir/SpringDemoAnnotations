package springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		//load spring config file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//Retrieve bean from spring container
		Coach theCoach = context.getBean("tennisCoach",Coach.class);
		Coach alphaCoach = context.getBean("tennisCoach",Coach.class);
		boolean result = (theCoach==alphaCoach);
		System.out.println("pointing to same location: "+result);
		System.out.println("memory location of theCoach = " +theCoach);
		System.out.println("memory location of alphaCoach = "+alphaCoach);
		
		context.close();

	}

}
