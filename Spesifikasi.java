public class Spesifikasi {
    public String brand;
    public Tester handPhone;

    public Spesifikasi(String merkBrand, String OS){
        handPhone = new Tester();
        handPhone.brand = merkBrand;
        handPhone.OS = OS;
    }

    public void start(){
        handPhone.start();
    }

    public void shutdown(){
        handPhone.shutdown();
    }

    public void run(){
        System.out.println("Phone is running..");
    }
}
