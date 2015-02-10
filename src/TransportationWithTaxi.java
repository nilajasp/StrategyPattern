/**
 * Created by nilajapatankar on 2/10/15.
 */
public class TransportationWithTaxi implements ITransportationStrategy {
    @Override
    public double TransportToAirport(double distance) {
        return distance * 10;
    }
}
