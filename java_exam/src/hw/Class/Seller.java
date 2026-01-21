package hw.Class;

public class Seller {
  int money;
  int productAmount;

  public void sell(int amount) {
    if (productAmount < 1) {
      System.out.println("품절되었습니다");
    } else {
      if (amount > productAmount) {
        money += (productAmount * 1000);
        productAmount = 0;
      } else {
        productAmount -= amount;
        money += (amount * 1000);
      }
    }
  }
}