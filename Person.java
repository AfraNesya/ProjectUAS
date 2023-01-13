public class Person {
    public String nama;
    public String gender;
    // overload Constructor
    public Person (String nama, String gender){
        this.nama = nama;
        this.gender = gender;
    }


    public String getNama() {
        return nama;
    }

    public String getGender() {
        return gender;
    }


    // Overriding
    public void display (){
        System.out.println("\nNama \t\t : " +getNama());
        System.out.println("Gender \t\t : " +getGender());
    }
}