package ex;

import java.util.Arrays;

public class Q181875 {
  public String[] solution(String[] strArr) {
    for (int i = 0; i < strArr.length; i++) {
      if (i % 2 == 0) {
        strArr[i] = strArr[i].toLowerCase();
      } else {
        strArr[i] = strArr[i].toUpperCase();
      }
    }
    return strArr;
  }

  public static void main(String[] args) {
    Q181875 a = new Q181875();
    System.out.println(Arrays.toString(a.solution(new String[] { "AAA", "BBB", "CCC", "DDD" })));
    System.out.println(Arrays.toString(a.solution(new String[] { "aBc", "AbC" })));
  }
}
