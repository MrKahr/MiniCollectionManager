package Interfaces.UserInterface;

public enum FunctionSelection {
    ADDCOAT(1), 
    REMOVECOAT(2),
    LISTFIGURE(3);

    private final Integer optionNumber; // Allows custom enums

    FunctionSelection(Integer optionNumber){
        this.optionNumber = optionNumber;
    }
}
