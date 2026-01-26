package ex;

public class Q181878 {
  public int solution(String myString, String pat) {
    if (myString.toLowerCase().contains(pat.toLowerCase())) {
      return 1;
    } else {
      return 0;
    }
  }

  public static void main(String[] args) {
    Q181878 a = new Q181878();
    System.out.println(a.solution("AbCdEfG", "aBc"));
    System.out.println(a.solution("aaAA", "aaaaa"));
  }
}
