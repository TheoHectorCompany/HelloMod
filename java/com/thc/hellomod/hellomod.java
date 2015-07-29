package com.thc.hellomod;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = "Hello Mod", version = "0.0.1")
public class hellomod
{
    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
    
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//recipes
    	GameRegistry.addRecipe(new ItemStack(Blocks.obsidian), new Object[]{
    		"AAA",
    		"AAA",
    		"AAA",
    		'A', Items.cookie
    	});
    	GameRegistry.addRecipe(new ItemStack(Items.apple, 4), new Object[]{
    		"AA",
    		"AA",
    		'A', Blocks.cobblestone
    	});
    	GameRegistry.addRecipe(new ItemStack(Items.dye, 2, 15), new Object[]{
    		"AB ",
    		"AAC",
    		"A  ",
    		'A', Items.cookie, 'B', Blocks.dirt, 'C', new ItemStack(Items.dye, 1, 1)
    	});
    	
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 1), new Object[]
    	{
    		new ItemStack(Items.dye, 1, 1), Items.redstone
    	});
    	
    	GameRegistry.addSmelting(new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 11), 0.1F);
    }
}
