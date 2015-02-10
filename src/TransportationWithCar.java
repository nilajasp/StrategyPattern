/**
 * Created by nilajapatankar on 2/4/15.
 */
public class TransportationWithCar implements ITransportationStrategy {
    @Override
    public double TransportToAirport(double distance) {
        return distance * 4;
    }
}
