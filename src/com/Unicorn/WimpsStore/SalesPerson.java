package com.Unicorn.WimpsStore;

import java.math.BigDecimal;

/**
 * Class for representing sales persons
 * @author mojiza
 */



public class SalesPerson {

   private Item[] soldItem;

   private final double WEEKLY_PAY = 200;

   private  final double COMMISSION_RATE = 0.09;

   public Item[] getSoldItem() {
      return soldItem;
   }

   public void setSoldItem(Item[] soldItem) {
      this.soldItem = soldItem;
   }

   public double calculateEarnings() {
      double commission = BigDecimal.ZERO.doubleValue();
      for (int i = 0; i < soldItem.length; i++) {
         commission += soldItem[i].getValueSold() * COMMISSION_RATE;

      }
      double earnings = WEEKLY_PAY + commission;
      return earnings;

   }
}
