package com.du_yi_wu_er.theendlessseamod.Item.Tool;

import com.du_yi_wu_er.theendlessseamod.tab.Tabtheendlessseamod;
import net.minecraft.client.resources.I18n;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Enchantments;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

import java.util.List;

public class Toolfalsepickaxe extends ItemPickaxe {

    private static final Item.ToolMaterial FALSE_PICKAXE = EnumHelper.addToolMaterial("false_axe",1,6666,3.0F,0.5F,10);

    public Toolfalsepickaxe(String name){
        super(FALSE_PICKAXE);
        this.setUnlocalizedName(name);
        this.setRegistryName(name);
        this.setCreativeTab(Tabtheendlessseamod.tabtheendlessseamod);
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> list) {
        if (isInCreativeTab(tab)) {
            ItemStack istack = new ItemStack(this);
            istack.addEnchantment(Enchantments.EFFICIENCY, 1);
            list.add(istack);
        }
    }

    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
        if(flagIn.isAdvanced()){
            tooltip.add(I18n.format(this.getUnlocalizedName()+".1."+"tooltip"));
        }
    }

}
