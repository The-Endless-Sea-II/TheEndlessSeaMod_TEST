package com.du_yi_wu_er.theendlessseamod.Block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.EnumBlockRenderType;
import net.minecraftforge.fluids.BlockFluidClassic;
import net.minecraftforge.fluids.Fluid;

public class Blockmercuryfluid extends BlockFluidClassic {

    public Blockmercuryfluid(String name, Fluid fluid, Material material) {
        super(fluid,material);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
    }

    @Override
    public EnumBlockRenderType getRenderType(IBlockState state) {
        return EnumBlockRenderType.MODEL;
    }
}
