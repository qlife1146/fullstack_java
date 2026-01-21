package oop;

public class Restaurant {
  public static void main(String[] args) {
    Guide gui = new Guide();
    gui.tableCount = 10;

    Consumer con = new Consumer();
    con.count = 5;
    con.money = 100000;

    gui.tableCheck(con.count);
    if (gui.check) {
      con.isSeat = true;
    }

    con.order(80000);
    con.done();

    gui.cleanTable((int) Math.ceil((double) con.count / 4));
  }
}
