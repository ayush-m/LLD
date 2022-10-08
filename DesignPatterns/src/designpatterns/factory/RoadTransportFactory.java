package designpatterns.factory;

public class RoadTransportFactory extends TransportFactory{
    @Override
    public Transport createTransportVehicle(String registrationid) {
        return new RoadTransport(registrationid);
    }
}
