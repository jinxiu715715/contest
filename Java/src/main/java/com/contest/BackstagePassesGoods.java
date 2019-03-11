package com.contest;

public class BackstagePassesGoods extends AgedBrieGoods {

	public BackstagePassesGoods(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
		// TODO Auto-generated constructor stub
	}

	public void updateQuality() {
		// TODO Auto-generated method stub
		if (super.sellIn > 10) {
			updateQualityTen();

		} else if (super.sellIn <= 10 && super.sellIn > 5) {
			updateQualityFiveTen();
		} else if (super.sellIn <= 5 && super.sellIn > 0) {
			updateQualityLessThanFive();
		} else {
			updateQualityZeroDay();
		}

	}

	public void updateQualityTen() {

		if (super.quality < super.maxQuality) {

			super.quality++;

		}
	}

	public void updateQualityFiveTen() {
		if (super.quality < super.maxQuality) {

			super.quality += 2;

		}

	}

	public void updateQualityLessThanFive() {
		if (super.quality < super.maxQuality) {

			super.quality += 3;

		}

	}

	public void updateQualityZeroDay() {

		super.quality = 0;

	}

}
