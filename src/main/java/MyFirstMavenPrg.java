public class MyFirstMavenPrg {

  public static void main(String[] args) {

    hello("World");
    hello("Vasia");

    double l = 5;
    System.out.println("Площадь квадрата со стороной "+ l + "=" + area(l));
    double a = 3;
    double b = 8;
    System.out.println("Площадь прямоугольника "+ a + " "+ b + " = " + area(a,b));
  }

  private static double area(double len) {
    return len * len;
  }
  private static double area(double s1, double s2) {
    return s1 * s2;
  }
    private static void hello(String some) {
    System.out.println("Hello " + some + "!");
  }

  }
