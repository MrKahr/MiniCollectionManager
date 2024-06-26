package Figures.FigureCollections;

import java.util.HashMap;

/* Singleton pattern */
public class SystemCollection {
    // FIELD
    private static SystemCollection instance;
    private HashMap<String, FigureCollection> miniatureSystems;

    // CONSTRUCTOR 
    SystemCollection(){
        this.miniatureSystems = new HashMap<String, FigureCollection>();
    }

    // METHOD  
    public static SystemCollection getInstance() {
        if (instance == null) {
            instance = new SystemCollection();

        }
        return instance;
    }

    public void addSystem(String name, String publisher){
        miniatureSystems.put(name, new FigureCollection(name, publisher));
    }

}