package com.gildedrose;

public class SulfurasItem extends Item{

    public SulfurasItem(int sellIn) {
        super("Sulfuras, Hand of Ragnaros",sellIn,80);
    }

    public void update(){
        return;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}