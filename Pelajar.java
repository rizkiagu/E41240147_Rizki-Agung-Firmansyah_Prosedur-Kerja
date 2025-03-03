
package ManfaatPewaris;

public class Pelajar extends Orang {
    private String nim;
    private String asalSekolah;
    private double nilai; // range: 0-30

    public Pelajar(String nama, double tinggi, double berat, String nim, String sekolah, double nilai) {
        super(nama, tinggi, berat); // Pastikan konstruktor Orang ada dan bisa diakses
        this.nim = nim;
        this.asalSekolah = sekolah;
        this.nilai = nilai;
    }

    public String toString() {
        return super.toString() + "\nNIM: " + nim + "\nSekolah: " + asalSekolah +
               "\nNilai: " + nilai;
    }
}
    

