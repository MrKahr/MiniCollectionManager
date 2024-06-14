package ModelComponent;

import java.util.HashMap;

public class Figure implements Paintable{
    // Field 
    HashMap<String, Coat> coatMap;

    // Constructor 
    public Figure(){
        coatMap = new HashMap<String, Coat>();
    }

    // Method 
    @Override
    public void applyCoat(Coat coat) {
        if(coatMap.containsValue(coat)){
            System.out.println("Coat already applied");
        } else {
            coatMap.put(coat.getId(), coat);
        }
    }

    public void removeCoat(Coat coat){
        if (!coatMap.containsValue(coat)) {
            System.out.println("Coat has is not applied");
        } else {
            coatMap.remove(coat.getId(), coat);
        }
    }

    public void showCoats(){
        for (String coatName : coatMap.keySet()) {
            System.out.println(coatName);
        }
    }

}
