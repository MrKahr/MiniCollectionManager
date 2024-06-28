package figures.parts;

import java.util.ArrayList;
import java.util.Collection;

import figures.coats.*;

public class FigurePart{
    // FIELD 
    private Collection<Color> colors;
    private Collection<Varnish> varnishs;
    private Collection<Primer> primers;

    // Construtor 
    FigurePart(){
        this.colors = new ArrayList<Color>();
        this.varnishs = new ArrayList<Varnish>();
        this.primers = new ArrayList<Primer>();
    }
    
    // METHOD
    public Collection<Color> getColors() {
        return colors;
    }

    public Collection<Primer> getPrimers() {
        return primers;
    }

    public Collection<Varnish> getVarnishs() {
        return varnishs;
    }

}
