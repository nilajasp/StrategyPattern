import java.util.Scanner;

/**
 * Created by nilajapatankar on 2/4/15.
 */
public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance :");
        double distance = Double.parseDouble(sc.nextLine());
        ITransportationStrategy modeOfTransportation = new TransportationWithBus();
        System.out.println("Cost for Bus is : "+modeOfTransportation.TransportToAirport(distance));
        modeOfTransportation = new TransportationWithCar();
        System.out.println("Cost for Car is : "+modeOfTransportation.TransportToAirport(distance));
        modeOfTransportation = new TransportationWithTaxi();
        System.out.println("Cost for Taxi is : "+modeOfTransportation.TransportToAirport(distance));
    }
}