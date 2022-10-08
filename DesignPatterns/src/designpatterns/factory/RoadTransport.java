package designpatterns.factory;

public class RoadTransport implements Transport{
    String registraTionId;

    RoadTransport(String registraTionId){
        this.registraTionId = registraTionId;
    }

    @Override
    public void deliver() {
        System.out.println("Delivering by Road using " + registraTionId + " vehicle");
    }
}
