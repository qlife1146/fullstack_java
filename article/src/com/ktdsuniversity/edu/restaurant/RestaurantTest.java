package com.ktdsuniversity.edu.restaurant;

public class RestaurantTest {

  // 각 호출 단계에서 발생할 수 있는 NullPointerExcpetion, ArrayIndexOutOfBoundsException에 대한
  // 예외처리가 반드시 필요합니다.
  // 배부름이 일정 수치를 초과하면 "FullException" throw,
  // 취함이 일정 수치를 초과하면 "DrunkenException" throw
  // 그 외 다양한 예외 상황도 관련된 예외를 만들어 throw
  // throw한 것을 catch해 알맞은 메시지가 출력되도록.

  public static void main(String[] args) {
    Menu[] menu = {
        new Menu(true, 100),
        new Menu(false, 30)
    };
    Restaurant restaurant = new Restaurant(150, 5, menu);
    Customer customer = new Customer(120, 4);

    // FullException 테스트
    try {
      customer.order(restaurant, 0);
    } catch (FullException ex) {
      System.out.println("FullException - " + ex.getMessage());
      System.out.println();
    }

    // DrunkenException 테스트
    try {
      customer.order(restaurant, 1);
    } catch (DrunkenException ex) {
      System.out.println("DrunkenException - " + ex.getMessage());
      System.out.println();
    }

    // ArrayIndexOutOfBoundsException
    customer.order(restaurant, 5);

    // NullPointerException 테스트
    customer.order(null, 0);
  }
}
