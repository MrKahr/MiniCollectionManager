package interfaces.userInterface;

import java.util.Scanner;

public class SimpleCLI {
    // TODO: Implement simple shell s.t. app may communicate with system

    // FIELD
    private static SimpleCLI instance;
    private Scanner scanner;
    private boolean shouldRun;

    // CONSTURCTOR
    SimpleCLI() {
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

    public void selectOption(String option) {
        try {
            // Case sensitive options are error prone
            // TODO: can be optimized by hash map
            switch (FunctionOption.valueOf(option.toUpperCase())) {
                case FunctionOption.ADDCOAT:
                    System.out.println("ADDCOAT");
                    break;
                case FunctionOption.REMOVECOAT:
                    System.out.println("REMOVECOAT");
                    break;
                case FunctionOption.LISTFIGURE:
                    System.out.println("LISTFIGURE");
                    break;
                case FunctionOption.END:
                    setShouldRun(false);
                    break;
            }

        } catch (IllegalArgumentException iae) {
            System.out.println("Unrecognized input " + option);
        } catch (NullPointerException npe){
            System.out.println("Unrecognized input" + option);
        }
    }


    public void showOptions() {
        System.out.println("Welcome to the CLI - you have the following options:");
        for (FunctionOption option : FunctionOption.values()) {
            System.out.println(option);
        }
    }

    public String getInput() {
        System.out.println("Input name of option");
        String currentSelection = this.getScanner().nextLine();
        return currentSelection;
    }

    public void run() {
        while (shouldRun) {
            showOptions();
            selectOption(getInput());
        }
    }
}
