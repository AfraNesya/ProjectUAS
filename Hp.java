public class Hp extends Barang {
    int harga;
    int diskon;

    public Hp(int harga, int diskon){
        this.harga = harga;
        this.diskon = diskon;
    }

    public float total() {
        return (float) (harga - diskon);
    }

    public void draw(){
        System.out.println("IPHONE 14 PRO MAX");
        System.out.println("MEMPROSES HARGA...............");
        System.out.println("HARGA SUDAH TERMASUK DISKON...");
    }
}