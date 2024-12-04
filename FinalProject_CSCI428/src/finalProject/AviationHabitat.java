package finalProject;

public class AviationHabitat extends Habitat{ //inherits from Habitat class
	public AviationHabitat(String habitatName)
	{
		super(habitatName);
	}
	
	@Override
	public void explore() {
		System.out.println("You gaze at the habitat with wonder as birds caw and fluffy clouds block the harsh morning sun. Your mind fills with determination as you go on your next adventure!");
	}
	
	@Override
	public String toString()
	{
		return "Class: AviationHabitat, habitatName: " + getHabitatName();
	}
}

