package Mastermind;

public class Banane extends Fruits{
	
	public String name;

	public Banane(String name) {
		super(name);
		this.isPeelable = true;
		this.withSeed = false;
		this.attr = "n’a pas de jus";// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
