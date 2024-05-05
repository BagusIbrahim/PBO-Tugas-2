public class Main {
    public static void main(String[] args) {
        // Shape s = new Shape(); // Tidak dapat membuat objek dari abstract class
        Lingkaran lingkaran = new Lingkaran(7);
        PersegiPanjang persegi = new PersegiPanjang(5, 10);

        lingkaran.display();
        System.out.println("Luas Lingkaran: " + lingkaran.hitungLuas());

        persegi.display();
        System.out.println("Luas Persegi Panjang: " + persegi.hitungLuas());
    }
}