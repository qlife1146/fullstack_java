package hw;

public class ConvenienceStore extends Mart {
  float savingRate = 0.001f;

  public ConvenienceStore(Product[] products) {
    super(products);
  }

  @Override
  protected int calcPointToUse(Customer customer, int discountedPrice, int usePoint) {
    if (customer.getPoint() < 100) {
      return 0;
    }
    return customer.getPoint();
  }

  @Override
  protected int calcEarnPoint(Customer customer, int totalPrice) {
    return (int) (totalPrice * savingRate);
  }
}
