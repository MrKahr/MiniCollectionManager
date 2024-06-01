import Interfaces.UserInterface.SimpleCLI;
import ModelComponent.Figure;
import ModelComponent.Collection;
import ModelComponent.Color;

public class App {
    public static void main(String[] args) throws Exception {
        Collection currentCollection = Collection.getInstance();
        currentCollection.addFigure();
        Figure currentFigure = currentCollection.getFigureMap().get("");
        currentFigure.applyCoat(new Color("1", "bob", 2.33, "33443"));
        currentCollection.removeFigure(new Figure());
        
        SimpleCLI.getInstance().run();
    }
}
