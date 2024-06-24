import Figures.Color;
import Figures.Figure;
import Figures.FigureCollection;
import Figures.FigureMolecule;
import Interfaces.UserInterface.SimpleCLI;

public class App {
    public static void main(String[] args) throws Exception {
        FigureCollection currentCollection = FigureCollection.getInstance();
        currentCollection.addFigure(new FigureMolecule());
        Figure currentFigure = currentCollection.getFigureMap().get(1);
        currentFigure.applyCoat(new Color(1, "bob", 2.33, 33));
        currentCollection.removeFigure(new FigureMolecule());
        
        SimpleCLI.getInstance().run();
    }
}
