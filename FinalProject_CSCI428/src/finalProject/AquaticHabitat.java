package finalProject;

public class AquaticHabitat extends Habitat{ //inherits from Habitat class
	public AquaticHabitat(String habitatName)
	{
		super(habitatName);
	}
	
	@Override
	public void explore() {
		System.out.println("You gaze at the habitat with wonder as dolphins leap and salt water cleanses your skin. Your mind fills with determination as you go on your next adventure!");
	}
	
	@Override
	public String toString()
	{
		return "Class: AquaticHabitat, habitatName: " + getHabitatName();
	}
}
