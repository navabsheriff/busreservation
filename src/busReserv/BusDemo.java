package busReserv;
import java.util.Scanner;
import  java.util.ArrayList;
public class BusDemo {
    public static void main(String[] args) {
        ArrayList <bus> buses=new ArrayList<bus>();
        ArrayList<booking> bookings=new ArrayList<booking>();
        buses.add(new bus(1,true,2));
        buses.add(new bus(2,true,45));
        buses.add(new bus(3,false,45));

        int userOpt=1;
        Scanner sc=new Scanner(System.in);
        for (bus b:buses) {
            b.displayBusinfo();

        }
        while(userOpt==1) {
            System.out.println("enter 1 to book and 2 to exit");
            userOpt= sc.nextInt();
            if(userOpt==1){
                System.out.println("booking.....");
                booking book=new booking();
                if(book.isAvailable(bookings,buses)){
                    bookings.add(book);
                    System.out.println("booking confirmed");
                }
                else {
                    System.out.println("sorry bus is full.try another date or bus");
                }
            }
        }

    }
}
