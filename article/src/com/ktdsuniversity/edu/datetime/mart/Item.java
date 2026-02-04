package com.ktdsuniversity.edu.datetime.mart;

import java.time.LocalDate;

public class Item {
  private String name;
  private LocalDate expiredDate;

  public Item(String name, LocalDate expiredDate) {
    this.name = name;
    this.expiredDate = expiredDate;
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LocalDate getExpiredDate() {
    return this.expiredDate;
  }

  public void setExpiredDate(LocalDate expiredDate) {
    this.expiredDate = expiredDate;
  }

  // TODO toString
}