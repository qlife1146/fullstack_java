package ex;

public class Q11654 {
  public int check(String s) {
    return (int) s.charAt(0);
  }

  public static void main(String[] args) {
    Q11654 check = new Q11654();
    System.out.println(check.check("A"));
    System.out.println(check.check("C"));
    System.out.println(check.check("0"));
    System.out.println(check.check("9"));
    System.out.println(check.check("a"));
  }
}
