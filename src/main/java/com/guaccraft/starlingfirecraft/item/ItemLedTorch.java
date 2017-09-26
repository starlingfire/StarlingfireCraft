package com.guaccraft.starlingfirecraft.item;

import com.guaccraft.starlingfirecraft.Refs;
import com.guaccraft.starlingfirecraft.libs.Names;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

public class ItemLedTorch extends Item
{
    @Override
    public String getUnlocalizedName(ItemStack stack)
    {
        return "item." + Refs.RESOURCE_PREFIX + Names.LED_TORCH_ITEM; // item.sfc:led_torch
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn)
    {
        playerIn.sendMessage(new TextComponentString("You used my item!"));
        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
