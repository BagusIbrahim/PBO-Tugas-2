// Subclass lainnya
class PersegiPanjang extends Shape {
    double panjang;
    double lebar;

    PersegiPanjang(double p, double l) {
        panjang = p;
        lebar = l;
    }

    // Implementasi dari abstract method hitungLuas untuk PersegiPanjang
    double hitungLuas() {
        return panjang * lebar;
    }
}