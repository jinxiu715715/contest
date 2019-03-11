package com.contest;

public class AgedBrieGoods extends Goods {
	

	public AgedBrieGoods(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}
	
	public void updateQuality() {
		// TODO Auto-generated method stub
		if (super.quality < super.maxQuality) {

			super.quality++;

		}
	}

}
