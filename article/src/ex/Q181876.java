package ex;

public class Q181876 {
  public String solution(String myString) {
    return myString.toLowerCase();
  }

  public static void main(String[] args) {
    Q181876 a = new Q181876();
    System.out.println(a.solution("aBcDeFg"));
    System.out.println(a.solution("aaa"));
  }
}
