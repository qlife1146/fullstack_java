package hw;

public class DepartmentStore extends ConvenienceStore {
  float savingRate = 0.5f;

  public DepartmentStore(Product[] products) {
    super(products);
  }

  public void order(Customer customer, int index, int quantity, float usePoint) {

  }

}
// if (guest instanceof VVIP) {
// guest.addPoint((int) amount * 0.3);
// } else if (guest instanceof VIP) {

// } else if (guest instanceof Guest) {
// guest.addPoint((int) amount * 0.05);
// }
// }

// @Override
// public int discount(Guest guest, int amount) {
// }