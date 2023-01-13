public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("ABDUL SOMAD", "LAKI LAKI");
        person1.display();
		
		// buat object dari class Barang
        Barang hp = new Hp(9000000, 500000);
        //memanggil method gambar
        hp.draw();

        //mencetak hasil dari class hp
        System.out.println("Total Harga: " + hp.total());
        System.out.println();
        System.out.println();
		
		
		//membuat object dari class spesifikasi hp
        Spesifikasi egssy = new Spesifikasi("IPhone 14 Pro Max ", "Bionic A16");

        //memanggil attribut dan nilai
        egssy.brand = "IPhone 14";
        egssy.start();
        egssy.run();
        egssy.shutdown();
    }
}