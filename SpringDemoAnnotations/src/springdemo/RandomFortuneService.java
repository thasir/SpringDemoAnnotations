package springdemo;

import java.util.Random;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class RandomFortuneService implements FortuneService {
// create a array of strings 
	private String[] arr = { "Life Before Death", "Stregnth Before Weakness", "Journey Before Destination" };
//create a random no generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(arr.length);
		
		String theFortune = arr[index];
		
		return theFortune;
	}

}
