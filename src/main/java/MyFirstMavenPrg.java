public class MyFirstMavenPrg {

  public static void main(String[] args) {

    hello("World");
    hello("Vasia");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной "+ s.l + "=" + s.area());
    Rectangle r = new Rectangle(3, 8);
    System.out.println("Площадь прямоугольника "+ r.a + " "+ r.b + " = " + r.arear());
  }

    private static void hello(String some) {
    System.out.println("Hello " + some + "!");
  }

  }
