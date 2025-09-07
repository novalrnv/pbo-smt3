package Jobsheet1.Tugas;

public class LaptopGaming extends Laptop {
    String gpu;
    int refreshrate;

    void setGaming(String m, String g, String l, int r) {
        merk = m;
        gpu = g;
        layar = l;
        refreshrate = r;
    }

    void main(String game) {
        System.out.println("Laptop "+merk+" sedang digunakan main "+game);
    }

    void live(String platform) {
        System.out.println("Laptop "+merk+" sedang digunakan live streaming di "+platform);
    }

    void cetakInfo() {
        System.out.println("Merk Laptop : "+merk);
        System.out.println("Layar Laptop "+merk+" : "+layar);
        System.out.println("Laptop "+merk+" memiliki refreshrate : "+refreshrate+" Hz");
    }
}
