package Figures.Creation;

/*Director part of a builder pattern */
public class Director {
    //FIELD 
    private Builder builder; 

    //CONSTRUCTOR
    Director(Builder builder){
        this.builder = builder;
    } 

    //METHOD 
    private void setBuilder(Builder builder){
        this.builder = builder;
    }
    public void makeMeleeInfantry(){
        
    }
    //public void makeRangedInfantry();
    //public void makeCavalry();
    //public void makeMonster();
}
