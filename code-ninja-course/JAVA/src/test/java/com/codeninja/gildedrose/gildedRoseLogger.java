package com.codeninja.gildedrose;

public class gildedRoseLogger {
	Item[] items = new Item[] { new Item("+5 Dexterity Vest", 10, 20), //
			new Item("Aged Brie", 2, 0), //
			new Item("Elixir of the Mongoose", 5, 7), //
			new Item("Sulfuras, Hand of Ragnaros", 0, 80), //
			new Item("Sulfuras, Hand of Ragnaros", -1, 80),
			new Item("Backstage passes to a TAFKAL80ETC concert", 15, 20),
			new Item("Backstage passes to a TAFKAL80ETC concert", 10, 49),
			new Item("Backstage passes to a TAFKAL80ETC concert", 5, 49) };
			// this conjured item does not work properly yet
			// new Item("Conjured Mana Cake", 3, 6) };

	StringBuilder sb;
	
	public String getLogFor(int days) {
		sb = new StringBuilder();
		
		GildedRose gildedRoseStore = new GildedRose(items);

		for (int i = 0; i < days; i++) {
			appendLine("-------- day " + i + " --------");
			appendLine("name, sellIn, quality");
			for (Item item : items) {
				appendLine(item.toString());
			}
			appendLine("");
			gildedRoseStore.updateQuality();
		}
		return sb.toString();
	}

	private void appendLine(String line)	{
		sb.append(line + System.lineSeparator());
	}
}
