package busReserv;
import java.text.ParseException;
import  java.util.*;
import  java.text.SimpleDateFormat;
public class booking {
    String passengerName;
    int busNo;
    Date date;
    booking(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter  name of passenger");
        passengerName=sc.next();
        System.out.println("enter bus no:");
        busNo=sc.nextInt();
        System.out.println(" enter date dd:mm:yyyy");
        String dateinput=sc.next();
        SimpleDateFormat dateformat=new SimpleDateFormat("dd-MM-yyyy");
        try {
            date=dateformat.parse(dateinput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
    public boolean isAvailable(ArrayList<booking> bookings, ArrayList<bus> buses){
        int capacity=0;
        for(bus b:buses) {
            if (b.getBusNo() == busNo) {
                capacity = b.getcapacity();
            }}
            int booked = 0;
            for (booking B : bookings) {
                if (B.busNo == busNo && B.date.equals(date))
                    booked++;
            }



        return booked<capacity?true:false;

    }

}


