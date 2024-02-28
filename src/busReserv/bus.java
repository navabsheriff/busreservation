package busReserv;

public class bus {
    private int busNo;
    private boolean ac;
    private int capacity;//get and set

    bus(int no, boolean ac, int cap) {
        this.busNo = no;
        this.ac = ac;
        this.capacity = cap;
    }

    public int getcapacity() {//accessor method
        return capacity;
    }
    public  int getBusNo(){
        return  busNo;
    }

    public void setcapacity(int cap) {//mutator method
        capacity = cap;
    }
    public  void  displayBusinfo( ){
        System.out.println("bus no"+ busNo +" Ac" + ac + "total capacity" + capacity);
    }

}
