package com.guaccraft.starlingfirecraft.proxies;

import com.guaccraft.starlingfirecraft.init.ModBlocks;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy
{
    @Override
    public void preInit(FMLPreInitializationEvent event)
    {
        super.preInit(event);
    }

    @Override
    public void init(FMLInitializationEvent event)
    {
        // Do everything from the CommonProxy
        super.init(event);

        // Create a model mesher for the initClient
        ItemModelMesher mesher =  Minecraft.getMinecraft().getRenderItem().getItemModelMesher();

        // Initialize the client side
        ModBlocks.initClient(mesher);
        //ModItems.initClient(mesher);
    }

    @Override
    public void postInit(FMLPostInitializationEvent event)
    {
        super.postInit(event);
    }

}
