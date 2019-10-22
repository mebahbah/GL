package com.gildedrose;

public class CommonItem extends Item{

    public CommonItem(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }


    public void update(){
        this.updateQuality();
        this.updateSellIn();
        return;
    }
    
    public void updateQuality(){
        this.quality = this.quality-1;
    }

    public void updateSellIn(){
		this.quality = this.sellIn-1;
	}

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}