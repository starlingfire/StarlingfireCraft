package com.guaccraft.starlingfirecraft;

import com.guaccraft.starlingfirecraft.proxies.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Refs.MODID,
     version = Refs.VERSION,
     acceptedMinecraftVersions = Refs.ACCEPTED_VERSIONS,
     name = Refs.NAME,
     dependencies = Refs.DEPENDENCIES)

public class StarlingfireCraft
{

    @Mod.Instance
    public static StarlingfireCraft instance;

    @SidedProxy(clientSide = Refs.CLIENT_PROXY_CLASS, serverSide = Refs.COMMON_PROXY_CLASS)
    public static CommonProxy proxy;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}
