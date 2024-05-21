package Interfaces.UserInterface;


public class SimpleCLI {
    //TODO: Process based approach like in CAOS 
    //TODO: Maybe remove singleton pattern and replace with private constructor? - We only want a single CLI! 

    // FIELD 
    private static SimpleCLI instance;

    // CONSTURCTOR 
    SimpleCLI(){
        if (instance == null) {
            instance = new SimpleCLI();
        }
    }
    // METHOD 
    public static SimpleCLI getInstance() {
        return instance;
    }

    public void showOptions(){
        System.out.println("Welcome to the shell - you have the following options: ");
        System.out.println("Show");
    }
}
