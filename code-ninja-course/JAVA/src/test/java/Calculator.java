
public class Calculator {
	String storedValue="";
	IDisplay display;
	public Calculator(IDisplay display) {
		this.display = display;
		this.display.send("0");
	}

	public void press(String key) {
		if (key != "0")
		{
			storedValue += key;
		}
		display.send(storedValue);
	}

}
