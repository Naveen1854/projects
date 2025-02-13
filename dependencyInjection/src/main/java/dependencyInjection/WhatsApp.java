package dependencyInjection;

public class WhatsApp implements Mobile{

	@Override
	public void open() {
		System.out.println("Opening WhatsApp");
		
	}

}
