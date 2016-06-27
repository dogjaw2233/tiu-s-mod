package com.tui.tuimod.items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;

public class baxe extends ItemAxe {
	public baxe(String unlocalizedName, ToolMaterial form) {
	    super(form);
	    this.setUnlocalizedName(unlocalizedName);
	    this.setCreativeTab(CreativeTabs.tabCombat);
	}
}