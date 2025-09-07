package Jobsheet1.Tugas;

public class KomporElektrik extends Kompor{
    String jenisPemanas;
    int daya;

    void setKomporElektrik(String m, int jmlh, String jp, int d) {
        merk = m;
        jumlahTungku = jmlh;
        jenisPemanas = jp;
        daya = d;
    }

    void aturSuhu(int suhu) {
        System.out.println("Kompor elektrik " + merk + " diatur ke suhu: " + suhu + "°C");
    }

    void timerMasak(int menit) {
        System.out.println("Kompor elektrik " + merk + " disetel untuk memasak selama " + menit + " menit.");
    }

    void cetakInformasi() {
        System.out.println("Merk Kompor Elektrik : "+merk);
        System.out.println("Tungku Kompor ELektrik "+merk+" : "+jumlahTungku);
        System.out.println("Kompor Elektrik memiliki Daya : " + daya + " watt");
        System.out.println("Jenis Pemanas: " + jenisPemanas);
    }
}