package com.piepenguin.rfwindmill.items;

import net.minecraft.item.Item;

import com.piepenguin.rfwindmill.creative.RfWindmillTab;
import com.piepenguin.rfwindmill.lib.Constants;

import cpw.mods.fml.common.registry.GameRegistry;

/**
 * Abstract class which all items from this mod should extend. Adds them to
 * creative tabs, and sets the name and texture from the name given in the
 * constructor.
 */
public class RFWItem extends Item {

    private String name;

    public RFWItem(String pName) {
        name = pName;
        setUnlocalizedName(Constants.MODID + "_" + name);
        setCreativeTab(RfWindmillTab.tabMisc);
        setTextureName(Constants.MODID + ":" + name);
        GameRegistry.registerItem(this, name);
    }
}
