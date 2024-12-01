package finalProject;

import java.util.Scanner;

public class Game {

    private static Scanner scanner = new Scanner(System.in);
    static Character userCharacter;

    public static void main(String[] args) {
    	
        Game game = new Game();
        game.run();
    }

    public void run() { //animals added automatically to game and each animal is added to their respective habitat
        // Create habitats
        JungleHabitat JungleVille = new JungleHabitat("JungleVille");
        AquaticHabitat WaterTown = new AquaticHabitat("WaterTown");
        AviationHabitat SkyOasis = new AviationHabitat("SkyOasis");

        // Create animals
        JungleAnimal Slothee = new JungleAnimal("Slothee", 1, 0, false);
        JungleAnimal Froggin = new JungleAnimal("Froggin", 3, 0, false);
        JungleAnimal Lioness = new JungleAnimal("Lioness", 2, 0, false);
        JungleVille.addToHabitat(Slothee);
        JungleVille.addToHabitat(Froggin);
        JungleVille.addToHabitat(Lioness);

        AquaticAnimal Turtloo = new AquaticAnimal("Turtloo", 2, 0, false);
        AquaticAnimal Sharker = new AquaticAnimal("Sharker", 1, 0, false);
        AquaticAnimal DolphGuy = new AquaticAnimal("DolphGuy", 3, 0, false);
        WaterTown.addToHabitat(Turtloo);
        WaterTown.addToHabitat(Sharker);
        WaterTown.addToHabitat(DolphGuy);

        AviationAnimal Birdy = new AviationAnimal("Birdy", 3, 0, false);
        AviationAnimal Pegasus = new AviationAnimal("Pegasus", 2, 0, false);
        AviationAnimal Storkasaurus = new AviationAnimal("Storkasaurus", 1, 0, false);
        SkyOasis.addToHabitat(Birdy);
        SkyOasis.addToHabitat(Pegasus);
        SkyOasis.addToHabitat(Storkasaurus);

        boolean gameRunning = true;
        
        System.out.println("To begin the game, please enter your name.");
        String userName = scanner.nextLine();  // Get the name from the user
        userCharacter = new Character(userName, 0); //Set current habitat to 0 as a default.
        
        while (gameRunning) {
        	menu(); //menu pops up each time again after choice is made
        	int choice = getChoice();
        	
        	switch (choice) {
            case 1:
                userCharacter.exploreHabitat(JungleVille);
                break;
            case 2:
                userCharacter.exploreHabitat(WaterTown);
                break;
            case 3:
                userCharacter.exploreHabitat(SkyOasis);
                break;
            case 4:
                userCharacter.viewSanctuary();
                break;
            case 5:
            	userCharacter.readScoresFromFile();
            	break;
            case 6:
                System.out.println("Thank you for playing Exotic Animal Sanctuary! Closing game now...");
                userCharacter.saveScoreToFile();
                gameRunning = false;
                break;
            default:
                System.out.println("Invalid choice. Select a number on the menu to continue playing.");
        }
        }
        
        
    }
    
    public void menu() {
    	System.out.println();
    	System.out.println("***~~***~~***~~***EXOTIC ANIMAL SANCTUARY***~~***~~***~~***");
    	System.out.println("*------------Welcome to Exotic Animal Sanctuary!----------*");
    	System.out.println("*---Please select a menu option to begin your adventure.--*");
        System.out.println("*-----------------1. Explore JungleVille------------------*");
        System.out.println("*-----------------2. Explore WaterTown--------------------*");
        System.out.println("*-----------------3. Explore SkyOasis---------------------*");
        System.out.println("*-----------------4. View Sanctuary-----------------------*");
        System.out.println("*-----------------5. View Max Sanctuary Scores------------*");
        System.out.println("*-----------------6. Exit---------------------------------*");
        System.out.println("***~~***~~***~~***~~***~~***~~***~~***~~***~~***~~***~~***~");
        System.out.println();
    	
    }
    
    public static int getChoice() {
    	int choice = 0;
        while (choice < 1 || choice > 6) { //ensures user picks proper choice within menu
            System.out.print("Enter your choice, " + userCharacter.getName() + ": ");
            while (!scanner.hasNextInt()) {  
                System.out.print("Invalid input. Please enter a number on the menu: ");
                scanner.next(); 
            }
            choice = scanner.nextInt();  

            if (choice < 1 || choice > 6) {
                System.out.println("Invalid choice. Please enter a number on the menu.");
            }
        }
        return choice;
    }

}
