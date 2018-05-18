package enums;

public enum diningType {

    BAR(20),
    RESTURANT(40);

    private final int capacity;

    diningType(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }
}

