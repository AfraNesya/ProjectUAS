public class Tester implements EIPhone {
    public String brand;
    public String OS;

    @Override
    public void start(){
        System.out.println("Phone is getting starting..");
    }
    @Override
    public void shutdown(){
        System.out.println("Shutting down..");
    }
}