package com.ktdsuniversity.edu.datetime.mart;

import java.time.LocalDate;
import java.util.ArrayList;

public class TestMart {
  public static void main(String[] args) {
    Store store = new Store(new ArrayList<>());
    store.addItem(new Item("p0", LocalDate.parse("2026-01-31")));
    store.addItem(new Item("p1", LocalDate.parse("2026-02-01")));
    store.addItem(new Item("p2", LocalDate.parse("2026-02-03")));
    store.addItem(new Item("n3", LocalDate.parse("2026-02-04")));
    store.addItem(new Item("n4", LocalDate.parse("2026-02-04")));
    store.addItem(new Item("n5", LocalDate.parse("2026-02-04")));
    store.addItem(new Item("f6", LocalDate.parse("2026-02-05")));
    store.addItem(new Item("f7", LocalDate.parse("2026-02-08")));
    store.addItem(new Item("f8", LocalDate.parse("2026-02-09")));

    store.sell(8);

  }
}
