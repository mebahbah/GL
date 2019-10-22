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
		if (this.sellIn < 11 && this.sellIn >= 6)
		{
			this.quality = this.quality+2;
		}
		else if (this.sellIn <= 5 && this.sellIn >0)
		{
			this.quality = this.quality +3;
		}
		else if (this.sellIn >= 10)
		{
			this.quality = this.quality +1;
		}
		else
		{
			this.quality = 0;
		} 
    }

	public void updateSellIn(){
		this.quality = this.sellIn-1;
	}

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
