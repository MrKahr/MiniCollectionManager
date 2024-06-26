package Figures.Creation;

import Figures.Coats.Coat;
import Figures.Parts.FigurePart;

public class ColorCoater extends Coater{
    @Override
     public void applyCoat(FigurePart figurePart, Coat coat){
        if (figurePart.getCoats().contains(coat)) {
            System.out.println("Coat is already applied");
        } else {
            figurePart.getCoats().add(coat);
        }
    }

    @Override
    public void removeCoat(FigurePart figurePart, Coat coat) {
        if (!(figurePart.getCoats().contains(coat))) {
            System.out.println("Coat has is not applied");
        } else {
            figurePart.getCoats().remove(coat);
        }
    }

    @Override
    public void showCoats(FigurePart figurePart) {
        for (Coat coat : figurePart.getCoats()) {
            System.out.println(coat);
        }
    }
}
