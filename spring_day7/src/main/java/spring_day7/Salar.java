package spring_day7;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class Salar implements Movie{

	@Override
	public void name() {
		System.out.println("Salar movie belongs to Prabhas");
		
	}

}
