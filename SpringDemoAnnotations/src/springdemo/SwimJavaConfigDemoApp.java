package springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {

		// read configuration file
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		// get a bean from spring container
		SwimCoach theCoach = context.getBean("swimCoach", SwimCoach.class);
		// call a method on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		System.out.println("email: " +theCoach.getEmail());
		System.out.println("team: " + theCoach.getTeam());
		// close context
		context.close();

	}

}
