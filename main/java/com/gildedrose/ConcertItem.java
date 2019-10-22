package com.gildedrose;

public class ConcertItem extends Item {

	public ConcertItem(int sellIn, int quality) {
    	super("Backstage passes to a TAFKAL80ETC concert",sellIn,quality);
    }


	public void update(){
        this.updateQuality();
        this.updateSellIn();
        return;
    }

   	public void updateQuality(){
   		
   		if(this.sellIn == 0)
   		{
   			this.quality = 0;
   		}
   		else if (this.sellIn <= 5)
   		{
   			this.quality = this.quality + 3;
   		}
   		else if (this.sellIn <= 10)
   		{
   			this.quality = this.quality + 2;
   		}
   		else if (this.sellIn > 11)
   		{
   			this.quality = this.quality + 1;
   		}
   		
    }

	public void updateSellIn(){
		this.sellIn = this.sellIn-1;
	}

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
