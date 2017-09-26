package com.guaccraft.starlingfirecraft;

import java.util.Random;

public class Refs
{

    // Constants

    public static final String MODID = "sfc";
    public static final String NAME = "StarlingfireCraft";
    public static final String VERSION = "@VERSION@";
    public static final String DEPENDENCIES = "required-after:forge@[13.20.1.2386]"; //after:modid
    public static final String ACCEPTED_VERSIONS = "[1.11.2]";
    public static final String RESOURCE_PREFIX = MODID.toLowerCase() + ":";

    // Variables

    public static Random random = new Random();


    // Proxy Information

    public static final String CLIENT_PROXY_CLASS = "com.guaccraft.starlingfirecraft.proxies.ClientProxy";
    public static final String COMMON_PROXY_CLASS = "com.guaccraft.starlingfirecraft.proxies.CommonProxy";

}
