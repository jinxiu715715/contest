package com.contest;

public class NormalGoods extends Goods {

	public NormalGoods(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	public void updateQuality() {
		// TODO Auto-generated method stub
		

		if (super.sellIn > 0 && super.quality>0) {

			super.quality--;

		} 
		if(super.sellIn <= 0 && super.quality>2){
			super.quality -= 2;
		}else {
			super.quality = 0;
		}

	}

}
