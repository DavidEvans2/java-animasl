///David Elijah Evans
//1/29/2020
//Lesson 1 Challenge

package us.mattgreen;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    private final static FileOutput outFile = new FileOutput("animals.txt");
    private final static FileInput inFile = new FileInput("animals.txt");


    public static void main(String[] args) {
        ArrayList<Talkable> zoo = new ArrayList<>();
        Scanner keyboard = new Scanner(System.in);
        String animalPerson;



        do {
            System.out.println("Wanna make an animal or person?");//Miraculous process of making an animal or person
            System.out.println("Please enter (Y/N)");
            animalPerson = keyboard.nextLine();

            //The below decides if the user made a valid input or not
            //depending on a y/n input, a,b,or c input, or an invalid input
            if (animalPerson.equals("N") || animalPerson.equals("n")) {
                System.out.println("Nothing was made! Try again?");
                System.out.println();
            }
            else if (animalPerson.equals("Y") || animalPerson.equals("y")) {
                userInput menu = new userInput();
                char choose = menu.animalChoose();
                inputTypeVerifier check = new inputTypeVerifier();
                switch (choose) {

                    case 'a'://Adds new dog
                        zoo.add(new Dog(menu.friendlyDog(), menu.dogName()));
                        break;

                    case 'b':
                        zoo.add(new Cat(menu.deadMice(), menu.catName()));
                        break;

                    case 'c':
                        zoo.add(new Teacher(menu.teacherAge(), menu.teacherName()));
                        break;

                    default:
                        System.out.println("Hold yer horses! Your input is invalid, try again!");
                        System.out.println();
                }
            } else {
                System.out.println(animalPerson + " is an invalid input, try again");
                System.out.println();
            }
            System.out.println();
        }while (!animalPerson.equals("N"));


        for (Talkable thing : zoo) {
            printOut(thing);
        }
        outFile.fileClose();
        inFile.fileRead();
        inFile.fileClose();

        FileInput indata = new FileInput("animals.txt");
        String line;
        while ((line = indata.fileReadLine()) != null) {
            System.out.println(line);
        }
    }

    public static void printOut(Talkable p) {
        System.out.println(p.getName() + " says = " + p.talk());
        outFile.fileWrite(p.getName() + " | " + p.talk());
    }
}
