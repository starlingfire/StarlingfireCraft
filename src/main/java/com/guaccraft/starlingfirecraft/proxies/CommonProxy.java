package com.guaccraft.starlingfirecraft.proxies;

import com.guaccraft.starlingfirecraft.init.ModBlocks;
import com.guaccraft.starlingfirecraft.init.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy
{
    public void preInit(FMLPreInitializationEvent event)
    {
        ModBlocks.init();
        //ModItems.init();
    }

    public void init(FMLInitializationEvent event)
    {

    }

    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
