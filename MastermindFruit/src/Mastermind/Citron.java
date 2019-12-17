package Mastermind;

public class Citron extends Fruits{
	
	public String name;
	
	public Citron(String name) {
		super(name);
		this.isPeelable = true;
		this.withSeed = true;
		this.attr = "ne se mange pas directement mais se sert uniquement en jus";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
