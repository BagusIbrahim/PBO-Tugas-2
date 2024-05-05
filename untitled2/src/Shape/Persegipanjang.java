// Subclass lainnya
class Persegipanjang extends Shape {
    double panjang;
    double lebar;

    Persegipanjang(double p, double l) {
        panjang = p;
        lebar = l;
    }

    // Implementasi dari abstract method hitungLuas untuk PersegiPanjang
    double hitungLuas() {
        return panjang * lebar;
    }
}