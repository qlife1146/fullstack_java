package com.ktdsuniversity.edu.restaurant;

public class Restaurant {
  Menu[] menues;

  private int standardHunger;
  private float standardTipsiness;

  public Restaurant(int standardFull, float standardDrunk, Menu... menues) {
    this.standardHunger = standardFull;
    this.standardTipsiness = standardDrunk;
    this.menues = new Menu[menues.length];
    for (int i = 0; i < menues.length; i += 1) {
      this.menues[i] = menues[i];
    }
  }

  // public int getMenu(int index) {

  // }

  public boolean isFull(int hunger) {
    return hunger >= getStandardHunger();
  }

  public boolean isDrunk(float tipsiness) {
    return tipsiness >= getStandardTipsiness();
  }

  public int getStandardHunger() {
    return this.standardHunger;
  }

  public float getStandardTipsiness() {
    return this.standardTipsiness;
  }
}
