package com.ktdsuniversity.edu.restaurant;

public class Customer {

  private int hunger;
  private float tipsiness;

  public Customer(int hunger, float tipsiness) {
    this.hunger = hunger;
    this.tipsiness = tipsiness;
  }

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
    try {
      if (restaurant == null) {
        throw new NullPointerException("식당 정보가 없습니다.");
      }
      Menu menu = restaurant.getMenu(menuIndex);
      Boolean isFood = menu.getIsFood();
      if (isFood == null) {
        throw new NullPointerException("메뉴 타입이 없습니다.");
      }

      if (isFood.booleanValue()) {
        int newHunger = this.hunger + menu.getAmount();
        // 배부름 기준 초과 시 FullException 발생
        if (newHunger > restaurant.getStandardHunger()) {
          throw new FullException(
              "배부름 수치를 초과했습니다: " + newHunger + "/" + restaurant.getStandardHunger());
        }
        this.setHunger(newHunger);
      } else {
        float newTipsiness = this.tipsiness + menu.getAmount() / 10f;
        // 취함 기준 초과 시 DrunkenException 발생
        if (newTipsiness > restaurant.getStandardTipsiness()) {
          throw new DrunkenException(
              "취함 수치를 초과했습니다: " + newTipsiness + "/" + restaurant.getStandardTipsiness());
        }
        this.setTipsiness(newTipsiness);
      }

      System.out.println("고객 배부름: " + this.hunger + "/" + restaurant.getStandardHunger());
      System.out.println("고객 취함: " + this.tipsiness + "/" + restaurant.getStandardTipsiness());
      System.out.println();
    } catch (ArrayIndexOutOfBoundsException ex) {
      // 메뉴 인덱스 범위 오류 처리
      System.out.println("없는 인덱스입니다.: " + menuIndex);
      System.out.println();
    } catch (NullPointerException ex) {
      // 필수 데이터 누락(null) 처리
      System.out.println("필수 데이터가 없습니다: " + ex.getMessage());
      System.out.println();
    }
  }

  public char[] getName() {
    throw new UnsupportedOperationException("Unimplemented method 'getName'");
  }
}
