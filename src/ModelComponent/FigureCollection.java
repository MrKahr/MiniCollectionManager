package ModelComponent;

import java.util.HashMap;

public class FigureCollection {
    // FIELD
    private static FigureCollection instance;
    private HashMap<String, Figure> figureMap;

    // CONSTURCTOR
    FigureCollection() {
        figureMap = new HashMap<String, Figure>();
    }

    // METHOD
    public static FigureCollection getInstance() {
        if (instance == null) {
            instance = new FigureCollection();

        }
        return instance;
    }

    public HashMap<String, Figure> getFigureMap() {
        return figureMap;
    }

    public static void printFigure(String key){
        System.out.println(instance.figureMap.get(key));
    }

    public static void printCollection(){
        System.out.println("Your current collection contains:");
        for (String figureIdentifier : instance.getFigureMap().keySet()){
            System.out.println(figureIdentifier);
        }
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