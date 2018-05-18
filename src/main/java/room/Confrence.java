package room;

import enums.ConfrenceType;

public class Confrence extends Room{



    private String name;
    private ConfrenceType type;
    private double rate;



    public Confrence(String name, ConfrenceType type, double rate){
        super(type.getCapacity());
        this.name = name;
        this.type = type;
        this.rate = rate;
    }



    public int getCapacity(){
        return this.type.getCapacity();
    }

    public double getRate(){
        return this.rate;
    }

    public String getname(){
        return this.name;
    }

    public ConfrenceType getType(){
        return this.type;
    }

}