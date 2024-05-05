// Subclass (mewarisi dari Shape)
class Lingkaran extends Shape {
    double jariJari;

    Lingkaran(double r) {
        jariJari = r;
    }

    // Implementasi dari abstract method hitungLuas untuk Lingkaran
    double hitungLuas() {
        return Math.PI * jariJari * jariJari;
    }
}