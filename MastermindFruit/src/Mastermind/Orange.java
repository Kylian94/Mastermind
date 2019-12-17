package Mastermind;

public class Orange extends Fruits{
	
	public String name;
	
	public Orange(String name) {
		super(name);
		this.isPeelable = true;
		this.withSeed = true;
		this.attr = "a le même nom que sa couleur";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
