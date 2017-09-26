package com.guaccraft.starlingfirecraft.init;

import com.guaccraft.starlingfirecraft.Refs;
import com.guaccraft.starlingfirecraft.block.BlockLedTorch;
import com.guaccraft.starlingfirecraft.libs.Names;
import net.minecraft.client.renderer.ItemModelMesher;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks
{
    public static BlockLedTorch ledTorchBlock;

    public static void init()
    {
        ResourceLocation location = new ResourceLocation(Refs.MODID, Names.LED_TORCH_BLOCK);
        ledTorchBlock = new BlockLedTorch();
        ledTorchBlock.setRegistryName(location);
        GameRegistry.register(ledTorchBlock);
        GameRegistry.register(new ItemBlock(ledTorchBlock), location);

    }

    @SideOnly(Side.CLIENT)
    public static void initClient(ItemModelMesher mesher)
    {
        Item item = Item.getItemFromBlock(ledTorchBlock);
        ModelResourceLocation model1 = new ModelResourceLocation(Refs.RESOURCE_PREFIX + Names.LED_TORCH_BLOCK, "facing=east");
        ModelResourceLocation model2 = new ModelResourceLocation(Refs.RESOURCE_PREFIX + Names.LED_TORCH_BLOCK, "facing=north");
        ModelResourceLocation model3 = new ModelResourceLocation(Refs.RESOURCE_PREFIX + Names.LED_TORCH_BLOCK, "facing=south");
        ModelResourceLocation model4 = new ModelResourceLocation(Refs.RESOURCE_PREFIX + Names.LED_TORCH_BLOCK, "facing=up");
        ModelResourceLocation model5 = new ModelResourceLocation(Refs.RESOURCE_PREFIX + Names.LED_TORCH_BLOCK, "facing=west");
        ModelLoader.registerItemVariants(item, model1, model2, model3, model4, model5);
        mesher.register(item, 0, model1);


        //ModelLoader.registerItemVariants(item, model2);
        mesher.register(item, 1, model2);


        //ModelLoader.registerItemVariants(item, model3);
        mesher.register(item, 2, model3);


        //ModelLoader.registerItemVariants(item, model4);
        mesher.register(item, 3, model4);


        //ModelLoader.registerItemVariants(item, model5);
        mesher.register(item, 4, model5);
    }
}
