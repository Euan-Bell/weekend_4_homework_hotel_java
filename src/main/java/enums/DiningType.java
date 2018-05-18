package enums;

public enum DiningType {

    BAR(20),
    RESTURANT(40);

    private final int capacity;

    DiningType(int capacity){
        this.capacity = capacity;
    }
    public int getCapacity(){
        return capacity;
    }
}

