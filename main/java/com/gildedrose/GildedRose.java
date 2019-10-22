package com.gildedrose;

class GildedRose {
    Item[] items;
    final String AGED_BRIE = "Aged Brie";
    final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    final String CONCERT_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    final String CONJURED = "Conjured";


    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update()
    {
    	for (Item item : items)
    	{
    		item.update();
    	}
    }
}


