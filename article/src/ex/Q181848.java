package ex;

public class Q181848 {
  public int check(String n_str) {
    return Integer.parseInt(n_str);
  }

  public static void main(String[] args) {
    Q181848 a = new Q181848();
    System.out.println(a.check("10"));
    System.out.println(a.check("8542"));
  }
}
