package com.guaccraft.starlingfirecraft.block;

import com.guaccraft.starlingfirecraft.Refs;
import com.guaccraft.starlingfirecraft.libs.Names;
import net.minecraft.block.Block;
import net.minecraft.block.BlockTorch;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

import java.util.Random;

public class BlockLedTorch extends BlockTorch
{
    @Override
    public Block setLightLevel(float value)
    {
        //this.lightValue = (int)(15.0F * value);
        this.lightValue = 10;
        return this;
    }

    @Override
    public String getUnlocalizedName()
    {
        return "tile." + Refs.RESOURCE_PREFIX + Names.LED_TORCH_BLOCK; // tile.sfc:led_torch_block
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(IBlockState stateIn, World worldIn, BlockPos pos, Random rand)
    {
        // Do nothing
    }
}
