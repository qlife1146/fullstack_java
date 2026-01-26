package ex;

public class Q181842 {
  public int check(String str1, String str2) {
    return str2.contains(str1) ? 1 : 0;
  }

  public static void main(String[] args) {
    Q181842 a = new Q181842();
    System.out.println(a.check("abc", "aabcc"));
    System.out.println(a.check("tbt", "tbbttb"));
  }
}
