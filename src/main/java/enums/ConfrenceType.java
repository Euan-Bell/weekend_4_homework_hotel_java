package enums;

public enum ConfrenceType {

        SMALL(10),
        LARGE(20);

        private final int capacity;

       ConfrenceType(int capacity){
            this.capacity = capacity;
        }
        public int getCapacity(){
            return capacity;
        }
}
