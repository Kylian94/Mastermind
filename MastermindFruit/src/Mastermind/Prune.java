package Mastermind;

public class Prune extends Fruits{
	
	public String name;

	public Prune(String name) {
		super(name);
		this.isPeelable = false;
		this.withSeed = true;
		this.attr = "a un noyau";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
