package com.contest;

public class Goods extends Item {

	protected int maxQuality = 50;

	public Goods(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	public void updateQuality() {
		// TODO Auto-generated method stub
		super.sellIn = 9;
		super.quality = 19;

	}

}
