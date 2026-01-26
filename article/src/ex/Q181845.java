package ex;

public class Q181845 {
  public String check(int n) {
    return Integer.toString(n);
  }

  public static void main(String[] args) {
    Q181845 a = new Q181845();
    System.out.println(a.check(123));
    System.out.println(a.check(2573));
  }
}