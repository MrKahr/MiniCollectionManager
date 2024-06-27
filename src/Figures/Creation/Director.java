package Figures.Creation;

/*Director part of a builder pattern */
public class Director implements Creator {
    //FIELD 
    private FigureBuilder figureBuilder; 

    //CONSTRUCTOR
    Director(FigureBuilder builder){
        this.figureBuilder = builder;
    } 

    //METHOD 
    private void setBuilder(FigureBuilder figureBuilder){
        this.figureBuilder = figureBuilder;
    }
    public void MakeInfantry(FigureBuilder figureBuilder){
        
    }
    public void MakeCavalry(FigureBuilder figureBuilder){

    }
    public void makeMonster(FigureBuilder figureBuilder){
        
    }
}
