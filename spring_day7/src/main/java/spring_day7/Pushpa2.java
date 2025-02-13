package spring_day7;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Pushpa2 implements Movie{

	@Override
	public void name() {
		System.out.println("pushpa2 belongs to bhAAi");
		
	}

}
