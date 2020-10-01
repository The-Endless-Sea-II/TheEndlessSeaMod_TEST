package com.du_yi_wu_er.theendlessseamod.Block;

import com.du_yi_wu_er.theendlessseamod.tab.Tabtheendlessseamod;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class BlockInfusedClayBlock extends Block {

    public BlockInfusedClayBlock(String nama, Material minecraft) {
        super(minecraft.GROUND);
        this.setUnlocalizedName(nama);
        this.setRegistryName(nama);
        this.setHardness(0.5F);
        this.setSoundType(SoundType.GROUND);
        this.setCreativeTab(Tabtheendlessseamod.tabtheendlessseamod);
    }
}
