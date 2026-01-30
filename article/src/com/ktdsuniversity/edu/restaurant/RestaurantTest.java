package com.ktdsuniversity.edu.restaurant;

public class RestaurantTest {

  // TODO: 배부름의 정도와 취함의 정도를 기준으로 예외를 발생시키도록 합니다.
  // 각 호출 단계에서 발생할 수 있는 NullPointerExcpetion, ArrayIndexOutOfBoundsException에 대한
  // 예외처리가 반드시 필요합니다.
  // 배부름이 일정 수치를 초과하면 "FullException" throw,
  // 취함이 일정 수치를 초과하면 "DrunkenException" throw
  // 그 외 다양한 예외 상황도 관련된 예외를 만들어 throw
  // throw한 것을 catch해 알맞은 메시지가 출력되도록.

  public static void main(String[] args) {
    Menu[] aMenu = {
        new Menu(true, 50),
        new Menu(true, 100),
        new Menu(true, 250),
        new Menu(false, 16),
        new Menu(false, 5),
        new Menu(false, 40),
    };

    Restaurant aRestaurant = new Restaurant(500, 10, aMenu);

    Menu[] bMenu = {
        new Menu(true, 20),
        new Menu(true, 70),
        new Menu(true, 100),
        new Menu(false, 18),
        new Menu(false, 10),
        new Menu(false, 70),
    };

    Restaurant bRestaurant = new Restaurant(300, 20, bMenu);

    Customer aa = new Customer(450, 8);

    aa.order(aRestaurant, 0);
    aa.order(aRestaurant, 7);
    aa.order(aRestaurant, 5);
    aa.order(aRestaurant, 5);

    aa.order(bRestaurant, 0);
    aa.order(bRestaurant, 3);

  }
}
