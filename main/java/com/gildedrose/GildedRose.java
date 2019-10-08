package com.gildedrose;

class GildedRose {
    Item[] items;
    final String AGED_BRIE = "Aged Brie";
    final String SULFURAS = "Sulfuras, Hand of Ragnaros";
    final String CONCERT_PASSES = "Backstage passes to a TAFKAL80ETC concert";
    final String CONJURED = "Conjured";


    public GildedRose(Item[] items) {
        this.items = items;
    }

    public void update(){
        updateQuality();
        updateSellIn();
    }

    public void updateQuality() {
        for (Item item : items) {
            if (!item.name.equals(AGED_BRIE)
                    && !item.name.equals(CONCERT_PASSES)) {
                if (item.quality > 0) {
                    if (!item.name.equals(SULFURAS)) {
                        item.updateQuality(-1);
                        if (item.name.contains(CONJURED) && item.quality>0) {
                            item.updateQuality(-1);
                        }
                    }
                }
            } else {
                if (item.quality < 50) {
                    item.updateQuality(1);

                    if (item.name.equals(CONCERT_PASSES)) {
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
            if (!item.name.equals(SULFURAS)) {
                item.sellIn = item.sellIn - 1;
            }

            if (item.sellIn < 0) {
                if (!item.name.equals(AGED_BRIE)) {
                    if (!item.name.equals(CONCERT_PASSES)) {
                        if (item.quality > 0) {
                            if (!item.name.equals(SULFURAS)) {
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

