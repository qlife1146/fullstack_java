package ex;

public class Q10809 {
  public String check(String s) {
    int[] alphaArray = new int[26];
    for (int i = 0; i < alphaArray.length; i += 1) {
      // 칸 초기화
      alphaArray[i] = -1;
    }

    for (int i = 0; i < s.length(); i += 1) {
      // 문자열의 i번째를 - 'a'에 빼서 a가 0이 되도록 수 맞춤
      int idx = s.charAt(i) - 'a';
      // 중복일 경우에는 변화 x oo
      if (alphaArray[idx] == -1) {
        alphaArray[idx] = i;
      }
    }

    String result = "";
    for (int i = 0; i < alphaArray.length; i += 1) {
      if (i > 0) {
        result += " ";
      }
      result += alphaArray[i];
    }
    return result;
  }

  public static void main(String[] args) {
    Q10809 c = new Q10809();

    System.out.println(c.check("baekjoon"));
  }
}
