package com.ktdsuniversity.edu.restaurant;

public class RestaurantTest {
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
