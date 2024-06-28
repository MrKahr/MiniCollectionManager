package figures.creation;
import figures.coats.Coat;
import figures.parts.FigurePart;

/*Attempted decorator pattern */
public abstract class Coater implements Creator {
    public abstract void applyCoat(FigurePart figurePart, Coat coat);
    public abstract void removeCoat(FigurePart figurePart, Coat coat);
    public abstract void showCoats(FigurePart figurePart);
}
