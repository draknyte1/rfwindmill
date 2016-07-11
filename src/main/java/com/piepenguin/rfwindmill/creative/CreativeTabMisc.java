package com.piepenguin.rfwindmill.creative;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

import com.piepenguin.rfwindmill.items.ModItems;

public class CreativeTabMisc extends CreativeTabs {

	public CreativeTabMisc(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem() {
		return ModItems.rotor1;
	}

}
