package Figures;

import java.util.HashMap;

public class FigureCollection {
    // FIELD
    private static FigureCollection instance;
    private HashMap<Long, Figure> figureMap;

    // CONSTURCTOR
    FigureCollection() {
        figureMap = new HashMap<Long, Figure>();
    }

    // METHOD
    public static FigureCollection getInstance() {
        if (instance == null) {
            instance = new FigureCollection();

        }
        return instance;
    }

    public HashMap<Long, Figure> getFigureMap() {
        return figureMap;
    }

    public void printFigure(Long key){
        System.out.println(instance.figureMap.get(key));
    }

    public void printCollection(){
        System.out.println("Your current collection contains:");
        for (Long figureIdentifier : instance.getFigureMap().keySet()){
            System.out.println(figureIdentifier);
        }
    }

    public void addFigure(Figure figure){
        this.figureMap.put(figure.getId(), figure);
    }

    public void removeFigure(Figure figure){
        if (!figureMap.containsValue(figure)) {
            System.out.println("Figure is not in collection");
        } else {
            figureMap.remove("", figure);
        }
    }

}