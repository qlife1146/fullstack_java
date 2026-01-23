package com.ktdsuniversity.edu.restaurant;

public class Customer {

  private int hunger;
  private float tipsiness;

  public Customer(int hunger, float tipsiness) {
    this.hunger = hunger;
    this.tipsiness = tipsiness;
  }

  // public boolean isFull(Restaurant restaurant) {
  // return !(this.hunger > restaurant.getStandardHunger());
  // }

  // public boolean isDrunk(Restaurant restaurant) {
  // return !(this.tipsiness > restaurant.getStandardTipsiness());
  // }

  public int getHunger() {
    return this.hunger;
  }

  public float getTipsiness() {
    return this.tipsiness;
  }

  public void setHunger(int hunger) {
    this.hunger = hunger;
  }

  public void setTipsiness(float tipsiness) {
    this.tipsiness = tipsiness;
  }

  public void order(Restaurant restaurant, int menuIndex) {
    // 1. 주문 확인
    if (menuIndex < 0 || menuIndex >= restaurant.menues.length) {
      System.out.println("존재하지 않는 메뉴 번호입니다.");
      return;
    }

    boolean isFood = restaurant.menues[menuIndex].getIsFood();

    if (isFood) {
      // 2. true = 음식
      // 2-1. 음식이면 손님의 허기 확인
      if (!restaurant.isFull(this.hunger)) {
        // 2-1-1. 손님의 허기를 [menuIndex]의 amount만큼 증가(setHunger)
        this.setHunger(this.getHunger() + restaurant.menues[menuIndex].getAmount());
      } else {
        System.out.println(this.hunger + "/" + restaurant.getStandardHunger() + " -> 배 부르시니 안 팔아요.");
        return;
      }
    } else {
      // 2. false = 술
      // 2.2 술이면 손님의 취기 확인
      if (!restaurant.isDrunk(this.tipsiness)) {
        // 2-2-1. 손님의 취기를 [menuIndex]의 amount/10만큼 증가
        this.setTipsiness(this.getTipsiness() + restaurant.menues[menuIndex].getAmount() / 10f);
      } else {
        System.out.println(this.tipsiness + "/" + restaurant.getStandardTipsiness() + " -> 취하셨으니 안 팔아요.");
        return;
      }
    }
    System.out.println("손님 허기: " + this.hunger + "/" + restaurant.getStandardHunger());
    System.out.println("손님 취기: " + this.tipsiness + "/" + restaurant.getStandardTipsiness());
    System.out.println();
  }
}
