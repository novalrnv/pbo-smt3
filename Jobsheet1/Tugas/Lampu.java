package Jobsheet1.Tugas;

public class Lampu {
    String merk, warna;
    int watt;

    void setLampu(String m, String w, int d) {
        merk = m;
        warna = w;
        watt = d;
    }

    void digunakan() {
        System.out.println("Lampu "+warna+" sedang nyala!");
    }

    void tidakdigunakan() {
        System.out.println("Lampu "+warna+" mati!");
    }

    void cetakInfo() {
        System.out.println("Brand Lampu : "+merk);
        System.out.println("Warna Lampu : "+warna);
        System.out.println("Daya Lampu : "+watt+" Watt");
    }
}
