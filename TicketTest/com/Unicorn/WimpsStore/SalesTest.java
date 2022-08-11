package com.Unicorn.WimpsStore;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class SalesTest {

    private SalesPerson Mo;
    private Item iphone;
    private Item[] itemsSold = new Item[1];


    @BeforeEach
  public void setUp(){
        Mo = new SalesPerson();
        iphone = new Item(1000);
        itemsSold [0] = iphone;
        Mo.setSoldItem(itemsSold);
        //Item iphone = new Item(1000);
        //Item[] itemsSold = new Item[5];
        //itemsSold = {iphone};

    }
  @Test
    public void addItem(){
        assertNull(Mo.getSoldItem());
       itemsSold[0] = iphone;
       Mo.setSoldItem(itemsSold);
       assertEquals(1, Mo.getSoldItem().length);
  }


    @Test
    public void calculateEarnings(){
        assertEquals(1, Mo.getSoldItem().length);
        Item itemsSold = Mo.getSoldItem()[0];
        assertEquals(1000, itemsSold.getValueSold());
        assertEquals(290, Mo.calculateEarnings());
    }
    @Test
    public  void calculateEarningsWithMultipleItem() {
        assertEquals(1, Mo.getSoldItem().length);
        Item itemsSold = Mo.getSoldItem()[0];
        assertEquals(1000, itemsSold.getValueSold());

        Item samsung = new Item(2000);
        Item itel = new Item(200);
        Item dell = new Item(5000);
        Item hp = new Item(4500);

        Item[] itemSold = {iphone,samsung,itel,dell,hp};
        Mo.setSoldItem(itemSold);
        assertEquals(5, Mo.getSoldItem().length);
        assertEquals(1343, Mo.calculateEarnings());

    }
}

