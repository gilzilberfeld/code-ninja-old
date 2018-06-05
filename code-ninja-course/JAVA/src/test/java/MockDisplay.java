
public class MockDisplay implements IDisplay {
	String display = "";
	public String getDisplay() {
		return display;
	}

	@Override
	public void send(String display) {
		this.display = display;
	}

}
