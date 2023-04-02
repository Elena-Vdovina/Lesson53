package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// По введённым координатам точки определите, в какой координатной четверти
// (или на какой оси) она находится.
public class Quarter {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Point point = Point.read(br);
    check(point);
  }

  private static void check(Point point) {
    int x = point.getX();
    int y = point.getY();
    if (x == 0 && y == 0) {
      System.out.println("Точка " + point.toString() + " является центром координат");
    }
    if (x == 0 && y != 0) {
      System.out.println("Точка " + point.toString() + " лежит на оси Х");
    }
    if (y == 0 && x != 0) {
      System.out.println("Точка " + point.toString() + " лежит на оси Y");
    }
    if (x > 0 && y > 0) {
      System.out.println("Точка " + point.toString() + " лежит в координатной четверти I");
    }
    if (x < 0 && y > 0) {
      System.out.println("Точка " + point.toString() + " лежит в координатной четверти II");
    }
    if (x < 0 && y < 0) {
      System.out.println("Точка " + point.toString() + " лежит в координатной четверти III");
    }
    if (x > 0 && y < 0) {
      System.out.println("Точка " + point.toString() + " лежит в координатной четверти IV");
    }
  }
}
