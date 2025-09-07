package Jobsheet1.Tugas;

public class tugasDemo {
    public static void main(String[] args) {

        // Objek Printer
        Printer print = new Printer();
        print.setPrinter("Cannon", "Inkjet");
        print.cetak();
        print.cetakInfo();
        print.scan();

        System.out.println();
        
        // Objek Lampu
        Lampu lp1 = new Lampu();
        lp1.setLampu("Philips", "Putih", 10);
        lp1.tidakdigunakan();
        lp1.cetakInfo();
        lp1.digunakan();
        
        System.out.println();
        
        // Objek Laptop
        Laptop ltp1 = new Laptop();
        ltp1.setLaptop("Hp", 256, "Oled");
        ltp1.nyalakan();
        ltp1.cetakInfo();
        ltp1.matikan();

        System.out.println();

        // Objek Laptop Gaming
        LaptopGaming lg = new LaptopGaming();
        lg.setGaming("LOQ", "Intel core i7", "Full HD", 144);
        lg.nyalakan();
        lg.cetakInfo();
        lg.main("valorant");
        lg.live("Tiktok");

        System.out.println();

        // Objek Kompor
        Kompor kmpr = new Kompor();
        kmpr.setKompor("Miyako", 2);
        kmpr.matikan();
        kmpr.cetakInfo();
        kmpr.nyalakan();

        System.out.println();

        // Objek Kompor Elektrik
        KomporElektrik ke = new KomporElektrik();
        ke.setKomporElektrik("Oxone", 4, "Induksi", 800);
        ke.nyalakan();
        ke.cetakInfo();
        ke.aturSuhu(150);
        ke.timerMasak(10);
    }
}
