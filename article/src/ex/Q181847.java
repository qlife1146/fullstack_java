package ex;

public class Q181847 {
  public String solution(String n_str) {
    int i = 0;
    while (i < n_str.length() && n_str.charAt(i) == '0') {
      i++;
    }
    if (i == n_str.length()) {
      return "0";
    }
    return n_str.substring(i);
  }

  public static void main(String[] args) {
    Q181847 a = new Q181847();
    System.out.println(a.solution("0010"));
    System.out.println(a.solution("854020"));
  }
}
