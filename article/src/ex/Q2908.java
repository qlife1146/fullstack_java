package ex;

public class Q2908 {
  public int check(int a, int b) {
    String[] numberA = (a + "").split("");
    String[] numberB = (b + "").split("");
    String[] revNumberA = new String[3];
    String[] revNumberB = new String[3];
    // System.out.println(numberA[0] + "" + numberB);

    for (int i = 0; i < 3; i++) {
      revNumberA[i] = numberA[2 - i];
      revNumberB[i] = numberB[2 - i];
    }

    int x = Integer.parseInt(revNumberA[0] + revNumberA[1] + revNumberA[2]);
    int y = Integer.parseInt(revNumberB[0] + revNumberB[1] + revNumberB[2]);

    if (x > y) {
      return x;
    } else {
      return y;
    }

  }

  public static void main(String[] args) {
    Q2908 a = new Q2908();

    System.out.println(a.check(121, 234));
    System.out.println(a.check(734, 893));
    System.out.println(a.check(221, 231));
    System.out.println(a.check(839, 237));
  }
}
