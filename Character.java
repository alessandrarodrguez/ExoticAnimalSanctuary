package finalProject;
import java.util.*;
import java.io.*;

public class Character {
	private String name;
	private int currentHabitat;
	private ArrayList<Animal> sanctuary;
	int score = 0;
	
	//interacting with animals methods go in this class
	public Character(String name, int currentHabitat) {
		this.name = name;
		this.currentHabitat = currentHabitat;
		this.sanctuary = new ArrayList<Animal>(); //array list so that we can add animals to sanctuary dynamically
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCurrentHabitat(int currentHabitat) {
		this.currentHabitat = currentHabitat;
	}
	
	public int getCurrentHabitat() {
		return currentHabitat;
	}
	 
	public void exploreHabitat(Habitat habitat) {
		habitat.explore();
		boolean encounter = false;
		if (habitat.hasAnimalsInHabitat()) {
			Animal animal = habitat.getRandomAnimal();
			System.out.println("You just came face to face with a " + animal.getName() + ".");
			encounter = true;
			while(encounter) { //encounter causes a separate menu option for interacting with animals
				
		        System.out.println("***~~***~~***~~***~~***~~***~~***~~***~~***~~***~~***~~***~~**");
		    	System.out.println("*---Please select a menu option to continue your adventure.--*");
		        System.out.println("*--------------------1. Feed Animal--------------------------*");
		        System.out.println("*--------------------2. Play with Animal---------------------*");
		        System.out.println("*--------------------3. Give Animal Space--------------------*");
		        System.out.println("*--------------------4. Leave Animal-------------------------*");
		        System.out.println("*--------------------5. Add Animal to Sanctuary--------------*");
		        System.out.println("***~~***~~***~~***~~***~~***~~***~~***~~***~~***~~***~~***~~**");
		        
		        int choice = Game.getChoice();
	        	
	        	switch (choice) {
	            case 1:
	                animal.feedAnimal(animal);
	                break;
	            case 2:
	                animal.playWithAnimal(animal);
	                break;
	            case 3:
	                animal.giveSpace(animal);
	                break;
	            case 4:
	            	System.out.println("Seeking out different animal.");
	            	encounter = false;
	            	break;
	            case 5:
	            	this.addToSantuary(animal, habitat);
	            	if (sanctuary.contains(animal)) {
	            		encounter = false;
	            	}
	            	break;
	            default:
                    System.out.println("Invalid choice. Select an item from the menu provided.");
                    break;

	        	}
			}
		}
		else {
			System.out.println("You look and you look, but unfortunately there are no animals in this habitat.");
		}
	}
	
	public void addToSantuary(Animal animal, Habitat habitat) {
		if (animal.getRelationshipLevel() >= 25)
		{
			score++;
			sanctuary.add(animal);	
			System.out.println(animal.getName() + " was successfully added to your sanctuary. You can view them at any time from the menu.");
			ArrayList<Animal> currentHabitat = habitat.getAnimalsInHabitat();
			if (currentHabitat != null) {
                currentHabitat.remove(animal);
		}
		}
		else 
		{
			System.out.println("Try further progressing your relationship level with this animal.");
		}
	}
	
	public void viewSanctuary() {
		System.out.println(name + "'s " + "Sanctuary: ");
		
		if (sanctuary.isEmpty()) {
			System.out.println("Unfortunate! You have not befriended any animals for your sanctuary. Go explore and find some exotic friends!");
		}
		
		for (Animal animal : sanctuary) {
			String sanctuaryQuirk;
			if (animal.getQuirk() == 1) {
				sanctuaryQuirk = "Piggy Eater";
			}
			else if (animal.getQuirk() == 2) {
				sanctuaryQuirk = "Antisocial";
			}
			else {
				sanctuaryQuirk = "Fun-loving";
			}
			
			System.out.println("Name: " + animal.getName() + ", Quirk: " + sanctuaryQuirk + ", Relationship Level: " + animal.getRelationshipLevel());
		}
	}
	
	
	public void saveScoreToFile() { //file io to save scores to file by appending them
	    String fileName = "ExoticAnimalSanctuaryScores.txt"; 
	    try (PrintWriter writer = new PrintWriter(new FileWriter(fileName, true))) {
	    	if (score > 0) {
	    		writer.println(name + "'s score of total animals in sanctuary in given gameplay: " + score);  
	    	}
	    } catch (IOException e) {
	        System.out.println("Unfortunately, your score could not be saved.");
	    }
	}
	
	public void readScoresFromFile() {
	    String fileName = "ExoticAnimalSanctuaryScores.txt"; 
	    File file = new File(fileName);

	    try {
	        Scanner scanner = new Scanner(file);
	        
	       // System.out.println("Max sanctuary scores: ");
	        
	        while (scanner.hasNextLine()) {
	            String line = scanner.nextLine();
	            System.out.println(line);  
	        }

	        scanner.close();
	    } catch (IOException e) {
	        System.out.println("Your scores could not be read.");
	    }
	}
	
	@Override
	public String toString()
	{
		return "Class: Character, name: " + getName() + ", currentHabitat: " + getCurrentHabitat();
	}
}

