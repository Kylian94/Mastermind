package Mastermind;

public class Framboise extends Fruits{
	
	public String name;

	public Framboise(String name) {
		super(name);
		this.isPeelable = false;
		this.withSeed = false;
		this.attr = "est creuse";// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
