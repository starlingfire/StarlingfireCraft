package com.guaccraft.starlingfirecraft.init;

import com.guaccraft.starlingfirecraft.Refs;
import com.guaccraft.starlingfirecraft.libs.Names;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems
{
    public static void init()
    {
        // Create item, set item's registry name, and register the item

        //ledTorchItem = new ItemLedTorch();
        //ledTorchItem.setRegistryName(new ResourceLocation(Refs.MODID, Names.LED_TORCH_ITEM));
        //GameRegistry.register(ledTorchItem);

    }

    @SideOnly(Side.CLIENT)
    public static void initClient(ItemModelMesher mesher)
    {
        //ModelResourceLocation model = new ModelResourceLocation(Refs.RESOURCE_PREFIX + Names.LED_TORCH_ITEM,"normal");
        //ModelLoader.registerItemVariants(ledTorchItem, model);
        //mesher.register(ledTorchItem, 0, model);
    }

}
