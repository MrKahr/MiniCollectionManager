package figures.collecting;

import java.util.HashMap;
import java.util.Map;

import figures.types.Figure;

public class FigureCollection {
    // FIELD 
    private String name;
    private String publisher;
    private Integer size;
    private Map<Long, Figure> figureMap;

    // CONSTRUCTOR 
    FigureCollection(String name, String publisher){
        this.name = name;
        this.publisher = publisher;
        size = 0;
        figureMap = new HashMap<Long, Figure>();
    }

    // METHOD 
    public Map<Long, Figure> getFigureMap() {
        return figureMap;
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
