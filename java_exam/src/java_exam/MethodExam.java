package java_exam;

public class MethodExam {

  public static void printSum(int n) {
    int sum = 0;
    for (int i = 0; i <= n; i++) {
      sum += i;
    }
    System.out.println(sum);
  }

  public static void printPrime(int p) {
    int count = 0;
    for (int i = 4; i <= p; i += 1) {
      count = 0;
      for (int j = 2; j * j <= i; j += 1) {
        if (i % j == 0) {
          count += 1;
        }
      }
      if (count == 0) {
        System.out.print(i + " ");
      }
    }
    System.out.println();
  }

  public static void printMax(int x, int y) {
    if (x > y) {
      System.out.println(x);
    } else if (x < y) {
      System.out.println(y);
    } else {
      return;
    }
  }

  public static void printAge(int age) {
    if (age >= 20) {
      System.out.println("성인");
    } else if (age < 20) {
      System.out.println("미성년");
    } else {
      return;
    }
  }

  public static void main() {
    printSum(10);
    printPrime(20);
    printMax(10, 20);
    printAge(20);
    printAge(15);
  }
}