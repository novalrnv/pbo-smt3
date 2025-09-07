package Jobsheet1.Tugas;

public class Laptop {
    String merk, layar;
    int ram;

    void setLaptop(String m, int r, String l) {
        merk = m;
        ram = r;
        layar = l;
    }

    void nyalakan() {
        System.out.println("Laptop "+merk+" sedang digunakan!");
    }

    void matikan() {
        System.out.println("Laptop "+merk+" sedang tidak digunakan!");
    }

    void cetakInfo() {
        System.out.println("Merk Laptop : "+merk);
        System.out.println("Ram Laptop : "+ram);
        System.out.println("Kualitas layar Laptop : "+layar);
    }
}