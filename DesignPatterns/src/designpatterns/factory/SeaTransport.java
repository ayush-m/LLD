package designpatterns.factory;

public class SeaTransport implements Transport{
    String registrationId;

    SeaTransport(String registrationId){
        this.registrationId = registrationId;
    }

    @Override
    public void deliver() {
        System.out.println("Delivering via water through " + registrationId + " vehicle");
    }
}
