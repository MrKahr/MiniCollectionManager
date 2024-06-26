package Figures.Creation;
import Figures.Coats.Coat;
import Figures.Parts.FigurePart;


public abstract class Coater implements Creator {
    public void applyCoat(FigurePart figurePart, Coat coat){
        if (figurePart.getCoats().contains(coat)) {
            System.out.println("Coat is already applied");
        } else {
            figurePart.getCoats().add(coat);
        }
    }

    public void removeCoat(FigurePart figurePart, Coat coat) {
        if (!(figurePart.getCoats().contains(coat))) {
            System.out.println("Coat has is not applied");
        } else {
            figurePart.getCoats().remove(coat);
        }
    }
    public void showCoats(FigurePart figurePart) {
        for (Coat coat : figurePart.getCoats()) {
            System.out.println(coat);
        }
    }
}
