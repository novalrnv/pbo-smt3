package Jobsheet1.Tugas;

public class Printer {
    String merk;
    String jenis;

    void setPrinter(String m, String j) {
        merk = m;
        jenis = j;
    }

    void cetak() {
        System.out.println("Printer " + merk + " mencetak dokumen.");
    }

    void scan() {
        System.out.println("Printer " + merk + " sedang melakukan scan.");
    }

    void cetakInfo() {
        System.out.println("Merk: " + merk);
        System.out.println("Jenis: " + jenis);
    }
}