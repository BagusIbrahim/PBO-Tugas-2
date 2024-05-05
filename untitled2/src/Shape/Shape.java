// Abstract class
abstract class Shape {
    // Abstract method (tidak memiliki implementasi)
    abstract double hitungLuas();

    // Concrete method (dengan implementasi)
    void display() {
        System.out.println("Ini adalah sebuah bentuk.");
    }
}