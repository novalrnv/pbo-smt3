public class Sepeda {
    private String merk;
    private int kecepatan;
    private int gear;

    void setMerk(String newValue) {
        merk = newValue;
    }

    void gantiGear(int newValue) {
        gear = newValue;
    }

    void tambahKecepatan(int increment) {
        kecepatan = kecepatan + increment;
    }

    void rem(int decrement) {
        kecepatan = kecepatan - decrement;
    }

    void cetakStatus() {
        System.out.println("Merek : " + merk);
        System.out.println("Kecepatan : " + kecepatan);
        System.out.println("Gear : " + gear);
    }
}