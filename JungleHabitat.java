package finalProject;

import java.util.ArrayList;

public class JungleHabitat extends Habitat{ //inherits from Habitat class
	public JungleHabitat(String habitatName)
	{
		super(habitatName);
	}
	
	@Override
	public void explore() {
		System.out.println("You gaze at the habitat with wonder as trees gust in the wind and wild monkeys screech. Your mind fills with determination as you go on your next adventure!");
	}
	
	@Override
	public String toString()
	{
		return "Class: JungleHabitat, habitatName: " + getHabitatName();
	}

}
