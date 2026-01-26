package ex;

public class Q1152 {
  public int check(String s) {
    String[] a = s.split(" ");
    int sum = 0;
    // System.out.println(a[0]);
    for (int i = 0; i < a.length; i++) {
      // System.out.println(a[i]);
      if (!a[i].isBlank()) {
        sum++;
      }
    }
    return sum;
  }

  public static void main(String[] args) {
    Q1152 a = new Q1152();

    System.out.println(a.check("The Curious Case of Benjamin Button"));
    System.out.println(a.check(" The first character is a blank"));
    System.out.println(a.check("The last character is a blank \n" + //
        ""));
  }
}