package com.du_yi_wu_er.theendlessseamod.Block;

import com.du_yi_wu_er.theendlessseamod.tab.Tabtheendlessseamod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import org.lwjgl.input.Keyboard;

import java.util.List;

public class Blockfalsegrass extends Block {

    public Blockfalsegrass(String nama,Material minecraft) {
        super(minecraft.ROCK);
        this.setUnlocalizedName(nama);
        this.setRegistryName(nama);
        this.setHardness(1F);
        //黑曜石是50,铁块5,金块3,圆石2,石头1.5,南瓜1,泥土0.5,甘蔗0,基岩-1
        this.setHarvestLevel("pickaxe", 0);
        this.setCreativeTab(Tabtheendlessseamod.tabtheendlessseamod);
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if(flagIn.isAdvanced()){
            tooltip.add(I18n.format(this.getUnlocalizedName()+".1."+"tooltip"));
        }
        if(Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)){
            tooltip.add(I18n.format(this.getUnlocalizedName()+".shift"+".1."+"tooltip"));
        }
    }
}
