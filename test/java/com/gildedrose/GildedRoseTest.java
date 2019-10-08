package com.gildedrose;

import static org.junit.Assert.*;

import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        String s=app.items[0].toString();
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    //////////////////////////SELLIN TEST//////////////////////////////
    @Test
    public void sellInTestOther(){
        Item[] items = new Item[] {
            new Item("+5 Dexterity Vest", 10, 20)
        };
        GildedRose app = new GildedRose(items);
        int sITest = app.items[0].sellIn;
        app.updateQuality();
   
        assertEquals(sITest-1, app.items[0].sellIn);
    }

    @Test
    public void sellInTestRagnaros(){
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -1, 80) };
        GildedRose app = new GildedRose(items);
        int sellInRtest = app.items[0].sellIn;
        app.updateQuality();
        assertEquals(sellInRtest, app.items[0].sellIn);
    }  

    @Test
    public void testSellInNotNegative() // Test d'objet avec une Quality a Zero
    {
        Item[] items = new Item[] 
        {
            new Item("+5 Dexterity Vest", 0, 20), //
        }; 
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        
        assertEquals(18,app.items[0].quality);

    }

    //////////////////////////QUALITY TEST//////////////////////////////

    @Test
    public void qualityTestAgedBrie(){
        Item[] items = new Item[] { new Item("Aged Brie", 2, 0) };
        GildedRose app = new GildedRose(items);
        int Qtest = app.items[0].quality;
        if(Qtest<50){Qtest=Qtest+1;}
        app.updateQuality();
        assertEquals(Qtest, app.items[0].quality);
    }


    @Test
    public void qualityTestAgedBrieWithZeroSellIn(){
        Item[] items = new Item[] { new Item("Aged Brie", 0, 0) };
        GildedRose app = new GildedRose(items);
        int Qtest = app.items[0].quality;
        if(Qtest<50){Qtest=Qtest+2;}
        app.updateQuality();
        assertEquals(Qtest, app.items[0].quality);
    }

    @Test
    public void qualityTestBackstageOver11Days(){
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20) };
        GildedRose app = new GildedRose(items);
        int Qtest=app.items[0].quality;
        if(Qtest<50){Qtest=Qtest+1;}
        app.updateQuality();
        assertEquals(Qtest, app.items[0].quality);
    }

    @Test
    public void qualityTestBackstageBetween6And11Days(){
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 10, 20) };
        GildedRose app = new GildedRose(items);
        int Qtest=app.items[0].quality;
        if(Qtest<50){Qtest=Qtest+2;}
        app.updateQuality();
        assertEquals(Qtest, app.items[0].quality);
    }

    @Test
    public void qualityTestBackstageLess6Days(){
        Item[] items = new Item[] { new Item("Backstage passes to a TAFKAL80ETC concert", 5, 20) };
        GildedRose app = new GildedRose(items);
        int Qtest=app.items[0].quality;
        if(Qtest<50){Qtest=Qtest+3;}
        app.updateQuality();
        assertEquals(Qtest, app.items[0].quality);
    }

    @Test
    public void qualityTestRagnaros(){
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", -1, 80) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(80, app.items[0].quality);
    }

    @Test
    public void qualityTestOther(){
        Item[] items = new Item[] { new Item("+5 Dexterity Vest", 10, 20) };
        GildedRose app = new GildedRose(items);
        int Qtest = app.items[0].quality;
        if(Qtest>0){Qtest=Qtest-1;}
        app.updateQuality();
        assertEquals(Qtest, app.items[0].quality);
    }

    @Test
    public void qualityTestNotNegative(){
        Item[] items = new Item[] { new Item("+5 Dexterity Vest", 10, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(0, app.items[0].quality);
    }

    @Test
    public void qualityTestNotAbove50(){
        Item[] items = new Item[] { new Item("Aged Brie", 2, 50) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(50, app.items[0].quality);
    }

    @Test
    public void qualityTestConjured(){
        Item[] items = new Item[] { new Item("Conjured Cheese", 2, 50) };
        GildedRose app = new GildedRose(items);
        int Qtest = app.items[0].quality;
        if(Qtest>1){Qtest=Qtest-2;}else{Qtest=0;}
        app.updateQuality();
        assertEquals(Qtest, app.items[0].quality);
    }

    @Test
    public void testQualityWhenSellInIsZero() // Test d'objet sans contrainte sur Quality a Zero
    {
        Item[] items = new Item[] 
        {
            new Item("+5 Dexterity Vest", 0, 20), //
        }; 
        GildedRose app = new GildedRose(items);
        int Qtest = app.items[0].quality-2;
        app.updateQuality();
        
        assertEquals(Qtest,app.items[0].quality);

    }

    //////////////////////////NAME TEST//////////////////////////////
    @Test
    public void testName()
    {
        Item[] items = new Item[] { new Item("Sulfuras, Hand of Ragnaros", 0, 100) };
        GildedRose app = new GildedRose(items);
        String nameTest = app.items[0].name;
        app.updateQuality();
        assertEquals(nameTest, app.items[0].name);
    }
}
