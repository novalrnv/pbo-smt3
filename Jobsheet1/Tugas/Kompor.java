package Jobsheet1.Tugas;

public class Kompor {
    String merk;
    int jumlahTungku;

    void setKompor(String m, int jmlh) {
        merk = m;
        jumlahTungku = jmlh;
    }

    void nyalakan() {
        System.out.println("Kompor gas " + merk + " dinyalakan.");
    }

    void matikan() {
        System.out.println("Kompor gas " + merk + " dimatikan.");
    }

    void cetakInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Jumlah tungku: " + jumlahTungku);
    }
}