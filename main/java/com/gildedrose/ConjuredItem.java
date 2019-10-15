package com.gildedrose;

public class ConjuredItem extends Item{

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }

    public void updateQuality(){
        this.quality = this.quality-2;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
