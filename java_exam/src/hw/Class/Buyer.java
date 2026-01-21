package hw.Class;

public class Buyer {
  int cartCount;
  int money;
  int maxWeight;
  int cartWeight;

  public void buy(int amount) {
    if (maxWeight < amount * 500) {
      System.out.println("더 이상 장바구니를 들 수 없습니다.");
    } else if (money < amount * 1000) {
      System.out.println("돈이 부족합니다");
    } else {
      money -= amount * 1000;
      cartWeight += amount * 500;
      cartCount += amount;
    }
  }

}
