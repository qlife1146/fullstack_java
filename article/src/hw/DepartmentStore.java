package hw;

public class DepartmentStore extends ConvenienceStore {
  public DepartmentStore(Product[] products) {
    super(products);
  }

  public void order(Customer customer, int index, int quantity, int usePoint) {
    super.order(customer, index, quantity, usePoint);
  }

  // if (guest instanceof VVIP) {
  // guest.addPoint((int) amount * 0.03);
  // } else if (guest instanceof VIP) {
  // } else if (guest instanceof Guest) {
  // guest.addPoint((int) amount * 0.005);
  // }
  @Override
  protected int calcDiscountedPrice(Customer customer, int totalPrice) {
    if (customer instanceof VVIP) {
      return (int) (totalPrice * 0.9);
    }
    if (customer instanceof VIP) {
      return (int) (totalPrice * 0.97);
    }
    return totalPrice;
  }

  @Override
  protected int calcPointToUse(Customer customer, int discountedPrice, int usePoint) {
    if (customer.getPoint() < 10000) {
      return 0;
    }
    if (usePoint < 0) {
      usePoint = 0;
    }
    if (usePoint > customer.getPoint()) {
      usePoint = customer.getPoint();
    }
    if (usePoint > discountedPrice) {
      usePoint = discountedPrice;
    }
    return usePoint;
  }

  @Override
  protected int calcEarnPoint(Customer customer, int totalPrice) {
    if (customer instanceof VVIP) {
      return (int) (totalPrice * 0.03);
    }
    if (customer instanceof VIP) {
      return 0;
    }
    return (int) (totalPrice * 0.005);
  }

}

class Guest extends Customer {
  public Guest(int money) {
    super(money, 0, 0);
  }

  public Guest(int money, int point) {
    super(money, point, 0);
  }
}

class VIP extends Customer {
  public VIP(int money) {
    super(money, 0, 1);
  }

  public VIP(int money, int point) {
    super(money, point, 1);
  }
}

class VVIP extends Customer {
  public VVIP(int money) {
    super(money, 0, 2);
  }

  public VVIP(int money, int point) {
    super(money, point, 2);
  }
}
