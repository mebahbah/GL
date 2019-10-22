package com.gildedrose;

public class ConjuredItem extends Item{

    public ConjuredItem(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
        if(!name.contains("Conjured")){throw new IllegalArgumentException();}
    }

    public void update(){
        this.updateQuality();
        this.updateSellIn();
        return;
    }

    public void updateQuality(){
        this.quality = this.quality-2;
    }

    public void updateSellIn(){
        this.quality = this.sellIn-1;
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}