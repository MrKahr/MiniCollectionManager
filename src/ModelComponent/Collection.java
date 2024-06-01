package ModelComponent;

import java.util.HashMap;

public class Collection {
    // FIELD
    private static Collection instance;
    private HashMap<String, Figure> figureMap;

    // CONSTURCTOR
    Collection() {
        figureMap = new HashMap<String, Figure>();
    }

    // METHOD
    public static Collection getInstance() {
        if (instance == null) {
            instance = new Collection();

        }
        return instance;
    }

    public HashMap<String, Figure> getFigureMap() {
        return figureMap;
    }

    public void addFigure(){
        figureMap.put("",new Figure());
    }

    public void removeFigure(Figure figure){
        if (!figureMap.containsValue(figure)) {
            System.out.println("Figure is not in collection");
        } else {
            figureMap.remove("", figure);
        }
    }

}