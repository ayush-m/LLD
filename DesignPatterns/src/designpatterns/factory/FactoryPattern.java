package designpatterns.factory;
import designpatterns.DefaultPattern;

public class FactoryPattern extends DefaultPattern {
    @Override
    public void runExample() {
        TransportFactory roadTransportFactory = new RoadTransportFactory();
        TransportFactory seaTransportFactory = new SeaTransportFactory();
        System.out.println("Creating a Road Transport");
        Transport roadVehicle = roadTransportFactory.createTransportVehicle("KA53HX5890");
        roadVehicle.deliver();
        System.out.println("Creating Sea Transport");
        Transport seaVehicle = seaTransportFactory.createTransportVehicle("KA-BLR-325687");
        seaVehicle.deliver();
    }
}
