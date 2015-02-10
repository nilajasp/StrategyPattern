/**
 * Created by nilajapatankar on 2/4/15.
 */
public class TransportationWithBus implements ITransportationStrategy {
    @Override
    public double TransportToAirport(double distance) {
        return distance * 2;
    }
}
