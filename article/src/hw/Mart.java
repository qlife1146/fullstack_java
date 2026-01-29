package hw;

public class Mart {
  Product[] products;

  public Mart(Product... products) {
    this.products = new Product[products.length];
    for (int index = 0; index < products.length; index++) {
      this.products[index] = products[index];
    }
  }

  public Product[] getProducts() {
    return this.products;
  }

  public void order(Customer customer, int index, int quantity) {
    order(customer, index, quantity, 0);
  }

  protected void order(Customer customer, int index, int quantity, int usePoint) {
    if (index < 0 || index >= products.length) {
      System.out.println("Invalid index.");
      return;
    }
    if (quantity <= 0) {
      System.out.println("Invalid quantity.");
      return;
    }

    int totalPrice = products[index].getPrice() * quantity;
    int discountedPrice = calcDiscountedPrice(customer, totalPrice);
    int pointsUsed = calcPointToUse(customer, discountedPrice, usePoint);

    if (pointsUsed < 0) {
      pointsUsed = 0;
    }
    if (pointsUsed > customer.getPoint()) {
      pointsUsed = customer.getPoint();
    }

    int pointsApplied = pointsUsed;
    if (pointsApplied > discountedPrice) {
      pointsApplied = discountedPrice;
    }

    int payAmount = discountedPrice - pointsApplied;
    if (payAmount > customer.getMoney()) {
      System.out.println("Not enough money.");
      return;
    }

    customer.setMoney(customer.getMoney() - payAmount);
    applyPoints(customer, totalPrice, pointsUsed);
  }

  protected int calcDiscountedPrice(Customer customer, int totalPrice) {
    return totalPrice;
  }

  // Mart does not use points.
  protected int calcPointToUse(Customer customer, int discountedPrice, int usePoint) {
    return 0;
  }

  protected int calcEarnPoint(Customer customer, int totalPrice) {
    return 0;
  }

  private void applyPoints(Customer customer, int totalPrice, int pointsUsed) {
    if (pointsUsed > 0) {
      customer.setPoint(customer.getPoint() - pointsUsed);
    }

    int earnedPoint = calcEarnPoint(customer, totalPrice);
    if (earnedPoint > 0) {
      customer.setPoint(customer.getPoint() + earnedPoint);
    }
  }
}
