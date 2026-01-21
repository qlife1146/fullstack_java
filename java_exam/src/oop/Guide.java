package oop;

/**
 * <pre>
 * 손님 인원 체크 후 입장/퇴장
 * </pre>
 */
public class Guide {
  // 빈 테이블이 인원에 맞는지 확인
  // 입장 가능하면 테이블 감소

  /**
   * <pre>
   * 남은 테이블 수
   * 모두 4인 테이블
   * 들어온 손님 수에 맞춰 테이블 감소
   * 
   * 예: 5명 => 테이블 2개 감소
   * </pre>
   */
  int tableCount;
  /**
   * 들어온 손님 수
   */
  int consumerCount;

  /**
   *
   */
  boolean check;

  /**
   * <pre>
   * 손님 수를 계산해 테이블이 남아있으면
   * 남은 테이블 감소 및 대기 손님 감소
   * </pre>
   */
  public void tableCheck(int consumer) {
    if (Math.ceil((double) consumer / 4) <= tableCount) {
      tableCount -= Math.ceil((double) consumer / 4);
      check = true;
    } else {
      System.out.println("Table not empty.");
    }
  }

  /**
   * 테이블 수 원상복귀
   * 
   * @param table: 청소할 테이블 수
   */
  public void cleanTable(int table) {
    tableCount += table;
  }
}
