package com.gildedrose;

public class SulfurasItem extends Item{

    public Item(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }

    public void updateQuality(){
        return;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}