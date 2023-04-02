package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Получите от пользователя радиус окружности.
// По введённым координатам точки определите, попадает ли она внутрь, на границу или
// вне окружности с указанным радиусом и центром в точке O (0, 0).
public class Circle {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int r = Integer.parseInt(br.readLine());
    Point point = Point.read(br);
    check(r, point);
  }

  public static void check(int r, Point point) {
    int x = point.getX();
    int y = point.getY();
    double r1 = Math.sqrt(x * x + y * y);
    if (r1 < (double) r) {
      System.out.println("Точка " + point.toString() + " лежит внутри окружности радиусом " + r);
    }
    if (r1 == (double) r) {
      System.out.println("Точка " + point.toString() + " лежит на окружности радиусом " + r);
    }
    if (r1 > (double) r) {
      System.out.println("Точка " + point.toString() + " лежит вне окружности радиусом " + r);
    }
  }
}
