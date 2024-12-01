package finalProject;

import java.util.ArrayList;
import java.util.Random;

public abstract class Habitat{
	private String habitatName;
	private ArrayList<Animal> animalsInHabitat; //array list so we can modify animals in habitat dynamically
	
	public Habitat(String habitatName) {
		this.habitatName = habitatName;
		this.animalsInHabitat = new ArrayList<>();
	
	}
	
	public String getHabitatName() {
		return habitatName;
	}
	
	public void setHabitatName(String habitatName){
		this.habitatName = habitatName;
	}
	
	public void addToHabitat(Animal animal) {
		animalsInHabitat.add(animal);
	}
	
	public void removeFromHabitat(Animal animal) {
		animalsInHabitat.remove(animal);
	}
	
	public boolean hasAnimalsInHabitat() {
		return !animalsInHabitat.isEmpty();
	}
	
	public ArrayList<Animal> getAnimalsInHabitat(){
		return animalsInHabitat;
	}
	
	public void viewAnimalsInHabitat() {
		
		for (Animal animal : animalsInHabitat) {
			System.out.println("Name: " + animal.getName() + "Quirk: " + animal.getQuirk() + "Relationship Level: " + animal.getRelationshipLevel());
		}
	}
		
	public void explore() { //will override in habitat subclasses for specific gameplay
		System.out.println("You gaze at the habitat with wonder and your mind fills with determination as you go on your next adventure!");
	}
	
	public Animal getRandomAnimal() {
        if (!hasAnimalsInHabitat()) {
            System.out.println("No animals left in " + habitatName + "!");
        }
        
        Random random = new Random();
        return animalsInHabitat.get(random.nextInt(animalsInHabitat.size()));
    }
	
	@Override
	public String toString()
	{
		return "Class: Habitat, habitatName: " + getHabitatName();
	}
}