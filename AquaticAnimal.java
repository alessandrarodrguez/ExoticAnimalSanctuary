package finalProject;

public class AquaticAnimal extends Animal{ //inherits from Animal class
	public AquaticAnimal(String name, int quirk, int relationshipLevel, boolean inSanctuary) {
		super(name, quirk, relationshipLevel, inSanctuary);
	}
	
	@Override
	public void feedAnimal(Animal animal) {
		System.out.println("You feed the animal yummy fish and crabs!");
		if (animal.getQuirk() == 1) {
			animal.adjustRelationshipLevel(20);
			System.out.println("The animal thinks about you dreamily as it chows down on its seafood boil like a mad-man!");
		}
		
		else if (animal.getQuirk() == 2 || animal.getQuirk() == 3) {
			animal.adjustRelationshipLevel(5);
			System.out.println("This animal feels thankful towards you for concerning yourself with its needs.");
		}
	}
	
	@Override
	public void playWithAnimal(Animal animal) {
		System.out.println("You swim and splash with the animal. It was hysterically fun!"); // will update obviously with different changes to relationshiplevel based on quirk
		if (animal.getQuirk() == 1) {
			animal.adjustRelationshipLevel(5);
			System.out.println("This animal enjoyed swimming with you, but there is something they may enjoy more!");
		}
		
		else if (animal.getQuirk() == 2) {
			System.out.println("This animal does not seem to enjoy swimming much with you.");
		}
		else 
			animal.adjustRelationshipLevel(20);
			System.out.println("Wow! This swimming and splashing time really made the animal's heart grow fonder towards you!");
	}
	
	@Override
	public void giveSpace(Animal animal) {
		System.out.println("You look at the animal longingly and show you care about their aquatic interests from afar."); // will update obviously with different changes to relationshiplevel based on quirk
		if (animal.getQuirk() == 1) {
			animal.adjustRelationshipLevel(5);
		}
		
		else if (animal.getQuirk() == 2) {
			animal.adjustRelationshipLevel(20);
		}
		else 
			System.out.println("This animal does not seem to appreciate personal space much. It wants to swim through the vast oceans with you!");
	
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
		return "Class: AquaticAnimal, name: " + getName() + ", quirk: " + sanctuaryQuirk + ", relationshipLevel: " + getRelationshipLevel() + ", inSanctuary(): " + getInSanctuary();
	}
}
