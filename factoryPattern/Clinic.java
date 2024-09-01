package factoryPattern;

import java.util.Scanner;

public class Clinic {
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        boolean exit = false;

        while (!exit) {
            System.out.println("[1] Dog");
            System.out.println("[2] Cat");
            System.out.println("[3] Exit" );
            System.out.print("\nPlease select an option: ");
            Integer choice = input.nextInt();

            System.out.println();// to display nl for option only

            PetRecord petFile = new PetRecord();
            Pet pet;

            switch(choice){
                case 1: pet = new Dog();
                    petFile.setPetId("D01");
                    petFile.setPetName("Bantay");
                    petFile.setPet(pet);
                    ((Dog) pet).setBreed("German Shepperd");

                    // to display dog's breed
                    System.out.println("Breed: " + ((Dog) pet).getBreed());
                    displayPetDetails(petFile);
                    break;

                case 2: pet = new Cat();
                    petFile.setPetId("C01");
                    petFile.setPetName("Muning");
                    petFile.setPet(pet);
                    ((Cat) pet).setNoOfLives(9);

                    // to display cat's lives
                    System.out.println("Number of lives: " + ((Cat) pet).getNoOfLives());
                    displayPetDetails(petFile);
                    break;

                case 3:
                    exit = true;
                    System.out.println("\nThank you for using the application.\n  /\\_/\\\n(˶ᵔ ᵕ ᵔ˶)\n/ >🌷<\\~⁠♡");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        /*
         we can apply this separate call for displaying the details 
         but adding it to the swtich case may be easier to understand and clear
         if (!exit){ displayPetDetails(petFile); } 
         */

        } 

        input.close();
    }

    public static void displayPetDetails(PetRecord petFile){

        System.out.println("Pet id is " + petFile.getPetId());
        System.out.println("Pet name is " + petFile.getPetName());
        System.out.println("Pet kind: " + petFile.getPet().getClass().getSimpleName());
        System.out.println("Communication sound: "+ petFile.getPet().makeSound());
        System.out.println("Play mode: " + petFile.getPet().play());
        System.out.println("────୨ৎ────\n");// for console's aesthetics only
    }
}