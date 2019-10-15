package com.gildedrose;

public class CommonItem extends Item{

    public Item(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }

    public void updateQuality(){
        this.quality = this.quality-1;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}