package spring_day7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BoxOffice {

//	@Autowired
//	Pushpa2 pushpa2;
//
//	@Autowired
//	Salar salar;
	
	@Qualifier("salar")
	@Autowired
	Movie movie;

	public void collection() {
		movie.name();
	}
}
