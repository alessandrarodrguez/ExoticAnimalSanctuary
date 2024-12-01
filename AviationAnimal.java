package finalProject;

public class AviationAnimal extends Animal{ //inherits from Animal class
	public AviationAnimal(String name, int quirk, int relationshipLevel, boolean inSanctuary) {
		super(name, quirk, relationshipLevel, inSanctuary);
	}
	
	@Override
	public void feedAnimal(Animal animal) {
		System.out.println("You feed the animal worms and other bugs from the floating trees in the sky!");
		if (animal.getQuirk() == 1) {
			animal.adjustRelationshipLevel(20);
			System.out.println("The animal thinks about you dreamily as it slurps on the bugs like a mad-man!");
		}
		
		else if (animal.getQuirk() == 2 || animal.getQuirk() == 3) {
			animal.adjustRelationshipLevel(5);
			System.out.println("This animal feels thankful towards you for concerning yourself with its needs.");
		}
	}
	
	@Override
	public void playWithAnimal(Animal animal) {
		System.out.println("You fly with the animal clumsily through the skies."); 
		if (animal.getQuirk() == 1) {
			animal.adjustRelationshipLevel(5);
			System.out.println("This animal enjoyed flying with you, but there is something they may enjoy more!");
		}
		
		else if (animal.getQuirk() == 2) {
			System.out.println("This animal does not seem to enjoy flying with you much.");
		}
		else 
			animal.adjustRelationshipLevel(20);
			System.out.println("Wow! This quality flying time really made the animal's heart grow fonder towards you!");
	}
	
	@Override
	public void giveSpace(Animal animal) {
		System.out.println("You look at the animal longingly and show you care about their aviating interests from afar."); // will update obviously with different changes to relationshiplevel based on quirk
		if (animal.getQuirk() == 1) {
			animal.adjustRelationshipLevel(5);
		}
		
		else if (animal.getQuirk() == 2) {
			animal.adjustRelationshipLevel(20);
		}
		else 
			System.out.println("This animal does not seem to appreciate personal space much. It wants to fly around its habitat with you!");
	
}
	@Override
	public String toString()
	{
		String sanctuaryQuirk;
		if (getQuirk() == 1) {
			sanctuaryQuirk = "Piggy Eater";
		}
		else if (getQuirk() == 2) {
			sanctuaryQuirk = "Antisocial";
		}
		else {
			sanctuaryQuirk = "Fun-loving";
		}
		return "Class: AviationAnimal, name: " + getName() + ", quirk: " + sanctuaryQuirk + ", relationshipLevel: " + getRelationshipLevel() + ", inSanctuary(): " + getInSanctuary();
	}
	
}
