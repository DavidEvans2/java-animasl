package us.mattgreen;

public class inputTypeVerifier {

    //booleans
    int mice;
    int age;
    public inputTypeVerifier(){

    }
    public int scanMice(String conMice){//Checks the mice to see how many the cat killed
        try{
            mice = Integer.parseInt(conMice);
        }catch (NumberFormatException e)
        {
            System.out.println("(NaN) Not a number! Try again");//If invalid input is entered, back to square one
        }
        return mice;
    }

    public int scanAge(String conAge){//Checks the age of the teacher
        try{
            age = Integer.parseInt(conAge);
        }catch (NumberFormatException e)
        {
            System.out.println("Uh oh, that isn't a valid number. Try again.");//If invalid input is entered, back to square one
        }
        return age;
    }
}
