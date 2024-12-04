package finalProject;

public abstract class Animal {
		private String name;
		private int quirk;
		private int relationshipLevel; // 3 different kinds of relationshipLevels that are randomly generated on a number system: 1: "Piggy Eater", 2: "Antisocial", 3: "Fun-Loving"
		private boolean inSanctuary; 
		
		public Animal(String name, int quirk, int relationshipLevel, boolean inSanctuary)
		{
			this.name = name;
			this.quirk = quirk;
			this.relationshipLevel = relationshipLevel;
			this.inSanctuary = inSanctuary;
		}
		
		public void setName(String name)
		{
			this.name = name;
		}
		
		public String getName()
		{
			return name;
		}
		
		public void setQuirk(int quirk)
		{
			this.quirk = quirk;
		}
		
		public int getQuirk()
		{
			return quirk;
		}
		
		public void adjustRelationshipLevel (int increment) { 
			if (relationshipLevel > 50)
			{
				relationshipLevel = 50;
				System.out.println("You have the maximum relationship with this animal.");
			}
			
			else {
				this.relationshipLevel += increment;
				System.out.println("Your relationship with this animal is " + relationshipLevel + "/100.");
			}
				
		}
		
		public void setRelationshipLevel(int relationshipLevel)
		{
			this.relationshipLevel = relationshipLevel;
		}
		
		public int getRelationshipLevel()
		{
			return relationshipLevel;
		}
		
		public void setInSanctuary(boolean inSanctuary)
		{
			this.inSanctuary = inSanctuary;
		}
		
		public boolean getInSanctuary()
		{
			return inSanctuary;
		}
		
		public void feedAnimal(Animal animal) { //Will override this class more specifically in Animal subclasses
			System.out.println("You feed the animal its favorite foods!");
			if (animal.getQuirk() == 1) {
				animal.adjustRelationshipLevel(20);
				System.out.println("The animal thinks about you dreamily as it chows down on food like a mad-man!");
			}
			
			else if (animal.getQuirk() == 2 || animal.getQuirk() == 3) {
				animal.adjustRelationshipLevel(5);
				System.out.println("This animal feels thankful towards you for concerning yourself with its needs.");
			}
		}
		
		public void playWithAnimal(Animal animal) { //Will override this class more specifically in Animal subclasses
			System.out.println("You play with the animal.");
			if (animal.getQuirk() == 1) {
				animal.adjustRelationshipLevel(5);
				System.out.println("This animal enjoyed playing with you, but there is something they may enjoy more!");
			}
			
			else if (animal.getQuirk() == 2) {
				System.out.println("This animal does not seem to play much.");
			}
			else 
				animal.adjustRelationshipLevel(20);
				System.out.println("Wow! This quality time really made the animal's heart grow fonder towards you!");
		}
		
		public void giveSpace(Animal animal) { //Will override this class more specifically in Animal subclasses
			System.out.println("You look at the animal longingly and show you care about their interests from afar."); // will update obviously with different changes to relationshiplevel based on quirk
			if (animal.getQuirk() == 1) {
				animal.adjustRelationshipLevel(5);
			}
			
			else if (animal.getQuirk() == 2) {
				animal.adjustRelationshipLevel(20);
			}
			else 
				System.out.println("This animal does not seem to appreciate personal space much.");
		
	}
		
		@Override
		public String toString() //Will override this class more specifically in Animal subclasses
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
			return "Class: Animal, name: " + getName() + ", quirk: " + sanctuaryQuirk + ", relationshipLevel: " + getRelationshipLevel() + ", inSanctuary(): " + getInSanctuary();
		}
}

