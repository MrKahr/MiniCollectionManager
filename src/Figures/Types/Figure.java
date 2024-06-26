package Figures.Types;

import java.time.Instant;
// TODO: Implement cloneable s.t. system may make shallow copies of figures - there may be multiple of the same figure type e.g. three elven archers
// TODO: Add mutex to id generator
// TODO: Implement uniformally distributed random number generator - time is not a secure way of generating ids 
import Figures.FigureStatus;
import Figures.Creation.Coater;
import Figures.Creation.Creator;
import Figures.Parts.Arm;
import Figures.Parts.Body;
import Figures.Parts.Head;
import Figures.Parts.Leg;

import Figures.Parts.Weapon;

/* Abstraction part of bridge pattern */
public abstract class Figure {
    // Field 
    private final long id; 
    private Double price;
    private FigureStatus status;
    private Head head;
    private Arm rightarm;
    private Arm leftarm;
    private Body body;
    private Leg rightleg;
    private Leg leftleg;
    private Weapon weapon;
    private Creator creator;
    private Coater coater;


    // Constructor 
    public Figure(){
        // Secure enough for current id generation
        id = Instant.now().getEpochSecond();
        price = 0.0;
        this.status = FigureStatus.INSPRUCE;
    }

    public Figure(Double price){
        // Secure enough for current id generation
        id = Instant.now().getEpochSecond();
        this.price = price;
        this.status = FigureStatus.INSPRUCE;
    }

    // Method 
    public Long getId() {
        return id;
    }

    public void setStatus(FigureStatus status) {
        this.status = status;
    }

    public void print(){
        System.out.println(this.id);
    }
}
