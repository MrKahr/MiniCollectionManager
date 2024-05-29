package Interfaces.UserInterface;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleCLI {
    //TODO: Process based approach like in CAOS 
    //TODO: Maybe remove singleton pattern and replace with private constructor? - We only want a single CLI! 

    // FIELD 
    private static SimpleCLI instance;
    private Scanner scanner;
    private boolean shouldRun;

    // CONSTURCTOR 
    SimpleCLI(){
        scanner = new Scanner(System.in);
        shouldRun = true;
    }
    // METHOD 
    public static SimpleCLI getInstance() {
        if (instance == null) {
            instance = new SimpleCLI();
  
        }
        return instance;
    }

    public void setShouldRun(boolean shouldRun) {
        this.shouldRun = shouldRun;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void showOptions(){
        System.out.println("Welcome to the shell - you have the following options:");
        System.out.println("[0]Add a coat to a figure");
        System.out.println("[1]Remove a coat from a figure");
        System.out.println("[2]List of current figures");
    }

    public Integer getInput(){
        System.out.println("Input integer to select function");
        Integer currentSelection = this.getScanner().nextInt();
        return currentSelection;
    }

    public void run(){
        while (shouldRun) {
            try{
                showOptions();
                // TODO: Make run bug stop
                shouldRun = !(getInput() == 0);
            } catch (InputMismatchException ime){
                System.out.println("Integer not selected as a valid option");
            }
        }
    }
}
