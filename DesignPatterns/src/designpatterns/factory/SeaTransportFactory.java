package designpatterns.factory;

public class SeaTransportFactory extends TransportFactory{
    @Override
    public Transport createTransportVehicle(String registrationid) {
        return new SeaTransport(registrationid);
    }
}
