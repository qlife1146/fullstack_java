package ex;

public class Q181843 {
  public int check(String my_string, String target) {
    if (my_string.contains(target)) {
      return 1;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    Q181843 a = new Q181843();
    System.out.println(a.check("banana", "ana"));
    System.out.println(a.check("banana", "tbbttb"));
  }
}
