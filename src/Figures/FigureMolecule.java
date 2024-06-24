package Figures;

import java.util.HashMap;
import java.util.Map;

/*
 * Composite node of a figure tree
 */
public class FigureMolecule extends Figure {   
    // FIELD 
    protected Map<Long, Figure> childMap;

    // CONSTRUCTOR 
    public FigureMolecule(){
        super();
        childMap = new HashMap<Long, Figure>();
    }

    // METHOD 
    public void addChild(Long id, Figure figure){
        childMap.put(id, figure);
    }

    public void removeChild(Long id){
        childMap.remove(id);
    }

    public Figure getChild(Long id){
        return childMap.get(id);
    }
        
    public Map<Long,Figure> getChildren() {
        return childMap;
    }

}
