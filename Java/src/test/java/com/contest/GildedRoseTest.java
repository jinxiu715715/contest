package com.contest;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

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
	public void should_quality_reduce_two_when_one_shop_given_normal_goods_date_passed() {

		NormalGoods[] items = new NormalGoods[] { new NormalGoods("normal1", 0, 20),
				new NormalGoods("normal2", 0, 10) };
		GildedRose gildedRose = new GildedRose(items);

		gildedRose.updateQuality();
		assertEquals(18, (gildedRose.items[0]).quality);
		assertEquals(8, gildedRose.items[1].quality);
	}
}
