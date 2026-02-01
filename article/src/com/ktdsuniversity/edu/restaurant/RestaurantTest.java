package com.ktdsuniversity.edu.restaurant;

public class RestaurantTest {
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
