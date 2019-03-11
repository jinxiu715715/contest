package com.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

public class GildedRoseTest {

	@Test
	public void should_fix_me() {
		Item[] items = new Item[] { new Item("normal", 10, 20) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();

		assertEquals(9, (gildedRose.items[0]).sellIn);
		assertEquals(19, gildedRose.items[0].quality);
	}

	// should_return_ticket_when_one_car_park_given_parkinglot_have_restspace()
	// Quality degrades twice as fast
	@Test
	public void should_quality_reduce_two_when_one_shop_given_aged_brie_goods() {
		
		AgedBrie[] items = new AgedBrie[] { new AgedBrie("ageBrie1", 0, 20),
				new AgedBrie("ageBrie2", 0, 10) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(18, (gildedRose.items[0]).quality);
		assertEquals(8, gildedRose.items[1].quality);
	}
	
	
	//Quality of an item is never negative
	@Test
	public void should_quality_never_negative_when_one_shop_given_normal_goods_date_passed() {

		NormalGoods[] items = new NormalGoods[] { new NormalGoods("normal1", 0, 0),
				new NormalGoods("normal2", 0, 1) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		
		assertTrue(gildedRose.items[0].quality >= 0);
		assertTrue(gildedRose.items[1].quality >= 0);
		
	}
	
	//Quality of an item is never negative
		@Test
		public void should_quality_add_one_when_one_shop_given_normal_goods_date_passed() {

			NormalGoods[] items = new NormalGoods[] { new NormalGoods("normal1", 8, 10),
					new NormalGoods("normal2", 15, 5) };
			GildedRose gildedRose = new GildedRose(items);

			gildedRose.updateQuality();
			
			assertEquals(11, (gildedRose.items[0]).quality);
			assertEquals(6, gildedRose.items[1].quality);
			
		}
	
}
