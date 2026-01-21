package oop;

/**
 * 
 */
public class Consumer {

  /**
   * 손님의 착석 상태
   */
  boolean isSeat;
  /**
   * 손님 수
   */
  int count;
  /**
   * 손님 소지 현금
   */
  int money;

  /**
   * <pre>
    * 앉을 경우 isSeat을 true로
    * 일어나는 경우 isSeat을 false로
   * </pre>
   */
  public void seat() {
    if (isSeat) {
      isSeat = false;
    } else {
      isSeat = true;
    }
  }

  /**
   * <pre>
   * isSeat이 true일 때 주문이 가능
   * 주문 금액이 가진 금액보다 적거나 같을 때 주문 성공
   * 
   * @param payed : 지불 금액
   */
  public void order(int payed) {
    if (isSeat) {
      if (payed <= money) {
        System.out.println("order done");
      } else {
        System.out.println("Not enough money");
      }
    }
  }

  /**
   * 식사 완료 후 isSeat을 false로 변경
   */
  public void done() {
    isSeat = false;
  }
}
