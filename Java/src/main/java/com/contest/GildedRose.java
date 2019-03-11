package com.contest;

class GildedRose {
	Goods[] goods;

	public GildedRose(Goods[] goods) {
		this.goods = goods;
	}

	public void updateQuality() {

		for (int i = 0; i < goods.length; i++) {
			goods[i].updateQuality();
		}

	}
}