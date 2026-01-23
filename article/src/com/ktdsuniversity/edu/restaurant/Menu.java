package com.ktdsuniversity.edu.restaurant;

public class Menu {
  private Boolean isFood;
  private int amount;

  public Menu(Boolean isFood, int amount) {
    this.isFood = isFood;
    this.amount = amount;
  }

  /** true = 음식, false = 술 */
  public boolean getIsFood() {
    return this.isFood;
  }

  /** 음식 = 무게, 술 = 도수 */
  public int getAmount() {
    return this.amount;
  }

}
