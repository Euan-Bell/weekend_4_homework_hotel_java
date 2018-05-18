package room;

import enums.DiningType;



public class Dining extends Room {

    private String name;
    private DiningType type;

    public Dining(String name, DiningType type){
        super(type.getCapacity());
        this.name = name;
        this.type = type;
    }

    public DiningType getType(){
        return this.type;
    }

    public String getName(){
        return this.name;
    }

    public int getCapacity(){
        return this.type.getCapacity();
    }

}




