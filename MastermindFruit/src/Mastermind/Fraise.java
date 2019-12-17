package Mastermind;

public class Fraise extends Fruits{
	
	public String name;

	public Fraise(String name) {
		super(name);
		this.isPeelable = false;
		this.withSeed = false;
		this.attr = "est caractérisée par le fait qu’elle a un pédoncule";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
