package com.thc.hellomod;


import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = "hellomod", name = "Hello Mod", version = "1.7.10-0.0.1")
public class hellomod
{

    @Mod.Instance("hellomod")
    public static hellomod instance;

    /* 
     * Définition des nouveaux ITEMS 
     */

    public static Item champiHallu1;


    /*
     * Définition des nouveaux BLOCKS
     */



    /*
     * Méthode preInit
     */
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
	/*
	 * Enregistrement des nouveaux ITEMS
	 */

	champiHallu1 = new ChampiHallu1();
	GameRegistry.registerItem(champiHallu1, "champiHallu1");


	/*
	 * Enregistrement des nouveaux BLOCKS
	 */
	
    }


    /*
     * Méthode init
     */
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	/*
	 * Définition des nouvelles RECETTES
	 */

	// Recettes ordonnées
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
    	
	// Recette désordonées
    	GameRegistry.addShapelessRecipe(new ItemStack(Items.dye, 2, 1), new Object[]
    	{
    		new ItemStack(Items.dye, 1, 1), Items.redstone
    	});
    	
	// Recette de fonte
    	GameRegistry.addSmelting(new ItemStack(Items.dye, 1, 1), new ItemStack(Items.dye, 1, 11), 0.1F);
    }
    

    /*
     * Méthode postInit
     */
    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
	
    }
}
