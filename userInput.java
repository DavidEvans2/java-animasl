package us.mattgreen;
import java.util.Scanner;

public class userInput {

    Scanner keyboard = new Scanner(System.in);
    int deadMice;
    int teacherAge;
    inputTypeVerifier check = new inputTypeVerifier();

    public userInput() {}

    public char animalChoose() {
        System.out.println("What kind of animal or person do you wanna make?");
        System.out.println("a. Dog");
        System.out.println("b. Cat");
        System.out.println("c. Teacher");

        String choice = keyboard.nextLine();
        return choice.toLowerCase().charAt(0);
    }

    public boolean friendlyDog(){
        System.out.println("Is your dog cool as a cucumber (friendly)? Please enter (Y/N)");
        String friendInput = keyboard.nextLine();
        if (friendInput.equals("y") || friendInput.equals("Y"))
            return true;
        else if (friendInput.equals("n") || friendInput.equals("N"))
            return false;
        else {
            System.out.println("You have chosen...poorly. Please enter (y/n)");
            friendlyDog();
            return false;
        }
    }

    public String dogName(){
        System.out.println("What is the name of your fluffball?");

        System.out.println("How cool!");
        return keyboard.nextLine();
    }
    public int deadMice(){
        System.out.println("How many mice did the killer cat nab?");
        String deadMiceString = keyboard.nextLine();
        deadMice = check.scanMice(deadMiceString);
        return deadMice;
    }
    public String catName(){
        System.out.println("What is the name of your killer hairball?");
        return keyboard.nextLine();
    }
    public int teacherAge(){
        System.out.println("How old is your teacher?");
        String ageing = keyboard.nextLine();
        teacherAge = check.scanAge(ageing);
        return teacherAge;
    }

    public String teacherName() {
        System.out.println("What is the name of your teacher?");
        return keyboard.nextLine();
    }
}