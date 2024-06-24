package Figures;

import java.util.Map;

/*
 * Leaf node of the Figure tree
 */
public class FigureAtom extends Figure {
    // FIELD 
    // CONSTRUCTOR
    
    FigureAtom(){
        super();
    }

    // METHOD
    @Override
    public void addChild(Long id, Figure figure) {
        throw new UnsupportedOperationException("Adding children to " + this.getClass() + " is forbidden");
    }

    @Override
    public void removeChild(Long id) {
        throw new UnsupportedOperationException("Removing children from " + this.getClass() + " is forbidden");
    }

    @Override
    public Figure getChild(Long id) {
        throw new UnsupportedOperationException("Getting child(ren) from " + this.getClass() + " is forbidden");
    }

    @Override
    public Map<Long, Figure> getChildren() {
        throw new UnsupportedOperationException("Getting child(ren) from " + this.getClass() + " is forbidden");
    }

    
    
}
