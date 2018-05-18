package enums;

public enum confrenceType {

        SMALL(10),
        LARGE(20);

        private final int capacity;

       confrenceType(int capacity){
            this.capacity = capacity;
        }
        public int getCapacity(){
            return capacity;
        }
}
