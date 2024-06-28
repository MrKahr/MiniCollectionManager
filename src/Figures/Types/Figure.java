package figures.types;

import java.time.Instant;
import figures.FigureMaterial;
import figures.FigureStatus;
import figures.creation.*;
import figures.parts.*;

// TODO: Implement cloneable s.t. system may make shallow copies of figures - there may be multiple of the same figure type e.g. three elven archers
// TODO: Add mutex to id generator
// TODO: Implement uniformally distributed random number generator - time is not a secure way of generating ids 

/* Abstraction part of bridge pattern */
public class Figure {
    // Field 
    protected final long id; 
    protected Double price;
    protected FigureMaterial figureMaterial;
    protected FigureStatus status;
    protected Creator creator;
    protected Coater coater;
    protected Head head;
    protected Arm rightarm;
    protected Arm leftarm;
    protected Body body;
    protected Leg rightleg;
    protected Leg leftleg;
    protected Weapon weapon;
 
    // Constructor 
    public Figure(){
        this.id = Instant.now().getEpochSecond();
    }

    // Method 
    public Long getId() {
        return id;
    }

    public Double getPrice() {
        return price;
    }

    public FigureMaterial getFigureMaterial() {
        return figureMaterial;
    }

    public FigureStatus getStatus() {
        return status;
    }

    public Creator getCreator() {
        return creator;
    }

    public Coater getCoater() {
        return coater;
    }

    public Head getHead() {
        return head;
    }

    public Arm getRightarm() {
        return rightarm;
    }

    public Arm getLeftarm() {
        return leftarm;
    }

    public Body getBody() {
        return body;
    }

    public Leg getRightleg() {
        return rightleg;
    }

    public Leg getLeftleg() {
        return leftleg;
    }

    public Weapon getWeapon() {
        return weapon;
    }
    
    public void setPrice(Double price) {
        this.price = price;
    }

    public void setFigureMaterial(FigureMaterial figureMaterial) {
        this.figureMaterial = figureMaterial;
    }

    public void setStatus(FigureStatus status) {
        this.status = status;
    }

    public void setCreator(Creator creator) {
        this.creator = creator;
    }

    public void setCoater(Coater coater) {
        this.coater = coater;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public void setRightarm(Arm rightarm) {
        this.rightarm = rightarm;
    }

    public void setLeftarm(Arm leftarm) {
        this.leftarm = leftarm;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public void setRightleg(Leg rightleg) {
        this.rightleg = rightleg;
    }

    public void setLeftleg(Leg leftleg) {
        this.leftleg = leftleg;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public void print(){
        System.out.println(this.id);
    }
}
