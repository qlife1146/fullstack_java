package ex;

public class Q11720 {
  public int check(int x, int y) {
    int sum = 0;
    String strY = y + "";
    // System.out.println(strY);
    for (int i = 0; i < x; i += 1) {
      var a = strY.charAt(i) - '0';
      // System.out.println(a);
      sum = sum + a;
    }
    return sum;
  }

  public static void main(String[] args) {
    Q11720 check = new Q11720();
    System.out.println(check.check(5, 54321));
  }
}
