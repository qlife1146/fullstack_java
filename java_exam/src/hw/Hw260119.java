package hw;

public class Hw260119 {
  public static void main(String[] args) {
    for (int i = 2; i * i <= 1000000; i += 1) {
      if (100000 % i == 0) {
        System.out.println(100000 % i);
      }
    }
  }
}
