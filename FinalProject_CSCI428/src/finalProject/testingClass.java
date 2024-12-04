package finalProject;

import java.util.ArrayList;
import java.util.Scanner;

public class testingClass {

	private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Object> testObjects = new ArrayList<>(); //array list to allow to loop through all objects later in code
    	
        Character testCharacter;
       
        AviationHabitat aviationHabitat;
        JungleHabitat jungleHabitat;
        AquaticHabitat aquaticHabitat;
        
        AviationAnimal aviationAnimal;
        JungleAnimal jungleAnimal;
        AquaticAnimal aquaticAnimal;
        
        System.out.println("Enter name to create an object for the Character class.");
        String userInput = scanner.nextLine();  
        testCharacter = new Character(userInput, 0); 
        testObjects.add(testCharacter);
        
        System.out.println("Enter habitat name to create an object for the AviationHabitat class.");
        userInput = scanner.nextLine();
        aviationHabitat = new AviationHabitat(userInput);
        testObjects.add(aviationHabitat);
        
        System.out.println("Enter habitat name to create an object for the JungleHabitat class.");
        userInput = scanner.nextLine();
        jungleHabitat = new JungleHabitat(userInput);
        testObjects.add(jungleHabitat);
        
        System.out.println("Enter habitat name to create an object for the AquaticHabitat class.");
        userInput = scanner.nextLine();
        aquaticHabitat = new AquaticHabitat(userInput);
        testObjects.add(aquaticHabitat);
        
        //public AviationAnimal(String name, int quirk, int relationshipLevel, boolean inSanctuary)
        System.out.println("Enter name for aviationAnimal.");
        String aviationName = scanner.nextLine();
        System.out.println("Enter quirk for aviationAnimal (1, 2 or 3.)");
        int aviationQuirk = scanner.nextInt();
        System.out.println("Enter relationship level (int)");
        int aviationRelationship = scanner.nextInt();
        System.out.println("Enter 'true' or 'false' for whether or not aviationAnimal is in sanctuary.");
        scanner.nextLine();
        boolean aviationBool = Boolean.parseBoolean(scanner.nextLine());
        aviationAnimal = new AviationAnimal(aviationName, aviationQuirk, aviationRelationship, aviationBool);
        testObjects.add(aviationAnimal);
        
        //public JungleAnimal(String name, int quirk, int relationshipLevel, boolean inSanctuary)
        System.out.println("Enter name for jungleAnimal.");
        String jungleName = scanner.nextLine();
        System.out.println("Enter quirk for jungleAnimal (1, 2 or 3.)");
        int jungleQuirk = scanner.nextInt();
        System.out.println("Enter relationship level (int)");
        int jungleRelationship = scanner.nextInt();
        System.out.println("Enter 'true' or 'false' for whether or not jungleAnimal is in sanctuary.");
        scanner.nextLine();
        boolean jungleBool = Boolean.parseBoolean(scanner.nextLine());
        jungleAnimal = new JungleAnimal(jungleName, jungleQuirk, jungleRelationship, jungleBool);
        testObjects.add(jungleAnimal);
        
        //public AquaticAnimal(String name, int quirk, int relationshipLevel, boolean inSanctuary)
        System.out.println("Enter name for aquaticAnimal.");
        String aquaticName = scanner.nextLine();
        System.out.println("Enter quirk for aquaticAnimal (1, 2 or 3.)");
        int aquaticQuirk = scanner.nextInt();
        System.out.println("Enter relationship level (int)");
        int aquaticRelationship = scanner.nextInt();
        System.out.println("Enter 'true' or 'false' for whether or not aquaticAnimal is in sanctuary.");
        scanner.nextLine();
        boolean aquaticBool = Boolean.parseBoolean(scanner.nextLine());
        aquaticAnimal = new AquaticAnimal(aquaticName, aquaticQuirk, aquaticRelationship, aquaticBool);
        testObjects.add(aquaticAnimal);
        
        for (Object objects : testObjects) {
            System.out.println(objects.toString()); //uses respective class toString() function
        }

    }
}