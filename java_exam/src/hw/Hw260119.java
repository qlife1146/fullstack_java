package hw;

public class Hw260119 {
  public static void main(String[] args) {
    // 소수: 약수가 1과 본인 뿐인 수
    for (int i = 2; i <= 100000; i += 1) {
      int count = 0;
      for (int j = 2; j * j <= i; j += 1) {
        if (i % j == 0) {
          // 본인 외 다른 수와 나눠지면 count 상승 = 소수 아님
          count = count + 1;
        }
      }
      if (count == 0) {
        // count가 0일 때 = 소수일 때만 해당 수 출력
        System.out.println(i);
      }
    }
  }
}
