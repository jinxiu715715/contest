package com.contest;

class GildedRose {
	Item[] items;

	public GildedRose(Item[] items) {
		this.items = items;
	}

	public void updateQuality() {

		for (int i = 0; i < items.length; i++) {
			if (items[i].sellIn <= 0) {
				if (items[i].quality > 2) {
					items[i].quality -= 2;
				} else {
					items[i].quality = 0;
				}

			} else {
				items[i].sellIn = 9;
				items[i].quality = 19;
			}
		}

	}
}