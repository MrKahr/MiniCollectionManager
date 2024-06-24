package Figures;

import java.time.Instant;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
// TODO: Implement cloneable s.t. system may make shallow copies of figures - there may be multiple of the same figure type e.g. three elven archers
// TODO: Add mutex to id generator
// TODO: Implement uniformally distributed random number generator


public abstract class Figure implements Paintable{
    // Field 
    protected final long id; 
    protected Collection<Coat> coats;
  

    // Constructor 
    public Figure(){
        // Secure enough for current id generation
        id = Instant.now().getEpochSecond();
        coats = Collections.synchronizedSet(new HashSet<>());
    }

    // Method 
    @Override
    public void applyCoat(Coat coat) {
        if(coats.contains(coat)){
            System.out.println("Coat already applied");
        } else {
            coats.add(coat);
        }
    }

    @Override
    public void removeCoat(Coat coat){
        if (!(coats.contains(coat))) {
            System.out.println("Coat has is not applied");
        } else {
            coats.remove(coat);
        }
    }

    @Override
    public void showCoats(){
        for (Coat coat : coats) {
            System.out.println(coat);
        }
    }

    public Long getId() {
        return id;
    }

    public Collection<Coat> getCoatMap() {
        return coats;
    }

    public abstract void addChild(Long id, Figure figure);

    public abstract void removeChild(Long id);

    public abstract Figure getChild(Long id);

    public abstract Map<Long,Figure> getChildren();
}
