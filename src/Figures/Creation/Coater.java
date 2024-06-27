package Figures.Creation;
import Figures.Coats.Coat;
import Figures.Parts.FigurePart;

/*Attempted decorator pattern */
public abstract class Coater implements Creator {
    public abstract void applyCoat(FigurePart figurePart, Coat coat);
    public abstract void removeCoat(FigurePart figurePart, Coat coat);
    public abstract void showCoats(FigurePart figurePart);
}
