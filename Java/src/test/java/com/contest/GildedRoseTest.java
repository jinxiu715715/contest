package com.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class GildedRoseTest {

	@Test
	public void should_fix_me() {
		Goods[] items = new Goods[] { new Goods("normal", 10, 20) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(9, (gildedRose.goods[0]).sellIn);
		assertEquals(19, gildedRose.goods[0].quality);
	}

	// should_return_ticket_when_one_car_park_given_parkinglot_have_restspace()
	// Quality degrades twice as fast
	@Test
	public void should_quality_reduce_two_when_one_shop_given_aged_brie_goods() {
		
		NormalGoods[] items = new NormalGoods[] { new NormalGoods("normal1", 0, 10),
				new NormalGoods("normal2", 0, 5) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(8, (gildedRose.goods[0]).quality);
		assertEquals(3, gildedRose.goods[1].quality);
	}
	
	
	//Quality of an item is never negative
	@Test
	public void should_quality_never_negative_when_one_shop_given_normal_goods_date_passed() {

		NormalGoods[] items = new NormalGoods[] { new NormalGoods("normal1", 0, 0),
				new NormalGoods("normal2", 0, 1) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		
		assertTrue(gildedRose.goods[0].quality >= 0);
		assertTrue(gildedRose.goods[1].quality >= 0);
		
	}
	
	
		@Test
		public void should_quality_add_one_when_one_shop_given_agedbrie_goods() {

			
			
			AgedBrieGoods[] items = new AgedBrieGoods[] { new AgedBrieGoods("ageBrie1", 0, 10),
					new AgedBrieGoods("ageBrie2", 0, 5) };
			GildedRose gildedRose = new GildedRose(items);

			gildedRose.updateQuality();
			
			assertEquals(11, (gildedRose.goods[0]).quality);
			assertEquals(6, gildedRose.goods[1].quality);
			
		}
	
}
