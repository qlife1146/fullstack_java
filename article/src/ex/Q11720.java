package ex;

public class Q11720 {
  public long check(long x, long y) {
    int sum = 0;
    String strY = y + "";
    for (int i = 0; i < x; i += 1) {
      var a = strY.charAt(i) - '0';
      sum = sum + a;
    }
    return sum;
  }

  public static void main(String[] args) {
    Q11720 check = new Q11720();
    System.out.println(check.check(1, 1));
    System.out.println(check.check(5, 54321));
  }
}
