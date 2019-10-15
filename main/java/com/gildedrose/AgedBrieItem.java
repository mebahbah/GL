package com.gildedrose;

public class AgedBrie extends Item {

   public Item(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }

   public void updateQuality(int amount)
    {
		this.quality = this.quality + amount
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
