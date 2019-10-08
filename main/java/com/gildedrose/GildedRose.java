package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update(){
        updateQuality();
        updateSellIn();
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!item.name.equals("Aged Brie")
                    && !item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                if (item.quality > 0) {
                    if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                        item.updateQuality(-1);
                        if (item.name.contains("Conjured") && item.quality>0) {
                            item.updateQuality(-1);
                        }
                    }
                }
            } else {
                if (item.quality < 50) {
                    item.updateQuality(1);

                    if (item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.sellIn < 11) {
                            if (item.quality < 50) {
                                item.updateQuality(1);
                            }
                        }

                        if (item.sellIn < 6) {
                            if (item.quality < 50) {
                                item.updateQuality(1);
                            }
                        }
                    }
                }
            }

        }
    }

    public void updateSellIn(){
        for (Item item : items) {
            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (!item.name.equals("Aged Brie")) {
                    if (!item.name.equals("Backstage passes to a TAFKAL80ETC concert")) {
                        if (item.quality > 0) {
                            if (!item.name.equals("Sulfuras, Hand of Ragnaros")) {
                                item.updateQuality(-1);
                            }
                        }
                    } else {
                        item.quality = item.quality - item.quality;
                    }
                } else {
                    if (item.quality < 50) {
                        item.updateQuality(1);
                    }
                }
            }
        }
    }
}

