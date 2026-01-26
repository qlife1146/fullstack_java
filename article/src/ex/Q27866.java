package ex;

public class Q27866 {
  public String check(String s, int i) {
    String result = s.substring(i - 1, i);
    return result;
  }

  public static void main(String[] args) {
    Q27866 check = new Q27866();
    System.out.println(check.check("Sprout", 3));
    System.out.println(check.check("shiftpsh", 6));
    System.out.println(check.check("Baekjoon", 4));
  }
}
