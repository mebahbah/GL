package com.gildedrose;
import java.lang.Exception;

public class AgedBrieItem extends Item {

   public AgedBrieItem(int sellIn, int quality) {
      super("Aged Brie",sellIn,quality);
    }

  public void update(){
        this.updateQuality();
        this.updateSellIn();
  }

  public void updateQuality(){
    if(this.quality<50)
    {
      this.quality = this.quality + 1;
    }
    if (this.sellIn == 0)
    {
        this.quality = this.quality + 1;
    }
  }

	public void updateSellIn()
	{
		if(this.sellIn > 0) 
		{
			this.sellIn = this.sellIn-1;
		}
	}

   @Override
   public String toString() {
        return this.name + ", " + this.sellIn + ", " + this.quality;
    }
}
