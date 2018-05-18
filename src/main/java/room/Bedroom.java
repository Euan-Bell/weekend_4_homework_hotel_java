package room;

import enums.BedroomType;

public class Bedroom extends Room{



    private int number;
    private BedroomType type;
    private double rate;



    public Bedroom(int number, BedroomType type, double rate){
        super(type.getCapacity());
        this.number = number;
        this.type = type;
        this.rate = rate;
    }



    public int getCapacity(){
        return this.type.getCapacity();
    }

    public double getRate(){
        return this.rate;
    }

    public int getNumber(){
        return this.number;
    }

    public BedroomType getType(){
        return this.type;
    }

}