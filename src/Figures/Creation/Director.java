package figures.creation;

import figures.parts.*;

/*Director part of a builder pattern */
public class Director implements Creator {
    //FIELD 
    private FigureBuilder figureBuilder; 

    //CONSTRUCTOR
    Director(FigureBuilder figureBuilder){
        this.figureBuilder = figureBuilder;
    } 

    //METHOD 
    private void setFigureBuilder(FigureBuilder figureBuilder){
        this.figureBuilder = figureBuilder;
    }
    public void MakeInfantry(FigureBuilder figureBuilder){
        figureBuilder.setCreator(new InfantryBuilder()); 
        figureBuilder.setCoater(new ColorCoater());
        figureBuilder.setBody(new Body());
        figureBuilder.setHead(new Head());
        figureBuilder.setRightArm(new Arm());
        figureBuilder.setLeftArm(new Arm());
        figureBuilder.setRightLeg(new Leg());
        figureBuilder.setLeftLeg(new Leg());
        figureBuilder.setWeapon(new Weapon());
    }
    public void MakeCavalry(FigureBuilder figureBuilder){
        figureBuilder.setCreator(null); 
        figureBuilder.setCoater(null);
        figureBuilder.setBody(null);
        figureBuilder.setHead(null);
        figureBuilder.setRightArm(null);
        figureBuilder.setLeftArm(null);
        figureBuilder.setRightLeg(null);
        figureBuilder.setLeftLeg(null);
        figureBuilder.setWeapon(null);
    }
    public void makeMonster(FigureBuilder figureBuilder){
        figureBuilder.setCreator(null); 
        figureBuilder.setCoater(null);
        figureBuilder.setBody(null);
        figureBuilder.setHead(null);
        figureBuilder.setRightArm(null);
        figureBuilder.setLeftArm(null);
        figureBuilder.setRightLeg(null);
        figureBuilder.setLeftLeg(null);
        figureBuilder.setWeapon(null);
    }
}
