package com.gildedrose;

public class ConcertItem extends Item {

   public ConcertItem(String name, int sellIn, int quality) {
        super(name,sellIn,quality);
    }

   public void updateQuality()
    {
	if (this.sellIn > 10)
	{
		this.quality = this.quality+1;
	}
	else if (this.sellIn < 10)
	{
		this.quality = this.quality +2;
	}
	else if (this.sellIn > 0 & this.sellIn < 6)
	{
		this.quality = this.quality +3;
	}
	else
	{
		this.quality = 0;
	}
        
    }

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
