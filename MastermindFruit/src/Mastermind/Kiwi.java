package Mastermind;

public class Kiwi extends Fruits{
	
	public String name;
	
	public Kiwi(String name) {
		super(name);
		this.isPeelable = true;
		this.withSeed = false;
		this.attr = "a une peau avec des poils";
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
