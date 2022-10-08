package designpatterns.factory;

public class TransportFactory {
    public Transport createTransportVehicle(String registrationid){
        return new RoadTransport(registrationid);
    }
}
