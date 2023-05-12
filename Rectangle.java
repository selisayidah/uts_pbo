public class Rectangle {
    private double width;
    private double height;
  
    public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
    }
  
    public double calculateArea() {
      return width * height;
    }
  
    public double calculatePerimeter() {
      return 2 * (width + height);
    }
  
    public static void main(String[] args) {
      // Membuat objek Rectangle dengan lebar 4 dan tinggi 5
      Rectangle rectangle = new Rectangle(4, 5);
  
      // Menghitung luas persegi panjang
      double area = rectangle.calculateArea();
      System.out.println("Luas: " + area);
  
      // Menghitung keliling persegi panjang
      double perimeter = rectangle.calculatePerimeter();
      System.out.println("Keliling: " + perimeter);
    }
  }