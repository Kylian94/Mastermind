package Mastermind;

public class Raisin extends Fruits{
	
	public String name;
	
	public Raisin(String name) {
		super(name);
		this.isPeelable = false;
		this.withSeed = true;
		this.attr = "est en grappe";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
