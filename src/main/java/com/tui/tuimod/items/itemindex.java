package com.tui.tuimod.items;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public final class itemindex {
	public static ToolMaterial HARDWOOD = EnumHelper.addToolMaterial("HARDWOOD", 3, 1000, 15.0F, 4.0F, 30);
    public static Item battleAxe;
    public static void createItems(){
    	GameRegistry.registerItem(battleAxe = new baxe("avaxe", HARDWOOD), "avaxe");
    	
    }
}