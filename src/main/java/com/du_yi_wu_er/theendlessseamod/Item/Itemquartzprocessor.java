package com.du_yi_wu_er.theendlessseamod.Item;

import com.du_yi_wu_er.theendlessseamod.TheEndlessSeaMod;
import com.du_yi_wu_er.theendlessseamod.tab.Tabtheendlessseamod;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IStringSerializable;
import net.minecraft.util.NonNullList;
import net.minecraft.util.ResourceLocation;

public class Itemquartzprocessor extends Item {

    public Itemquartzprocessor(String name){
        this.setUnlocalizedName(name);
        this.setRegistryName(new ResourceLocation(TheEndlessSeaMod.MODID,name));
        this.setHasSubtypes(true);
        this.setMaxStackSize(64);
        this.setCreativeTab(Tabtheendlessseamod.tabtheendlessseamod);
    }

    @Override
    public void getSubItems(CreativeTabs tab, NonNullList<ItemStack> items) {
        for(int i = 0; i < Quartzprocessortypes.values().length; i++){
            items.add(new ItemStack(this,1,i));
        }

    }

    public String getUnlocalizedName(ItemStack stack, int i) {
        for (i = 0; i < Quartzprocessortypes.values().length; i++){
            if (stack.getItemDamage() == i){
                return this.getUnlocalizedName() + "." + Quartzprocessortypes.values()[i].getName();
            }else {
                continue;
            }
        }
        return this.getUnlocalizedName() + "." + Quartzprocessortypes.values()[i].getName();
    }

    public enum Quartzprocessortypes implements IStringSerializable {

        quartz_processor_press("quartz_processor_press",0),
        printed_quartz_processor("printed_quartz_processor",1);

        private String name;
        private int ID;

        Quartzprocessortypes(String name, int ID){
            this.name = name;
            this.ID = ID;
        }

        @Override
        public String getName() {
            return this.name;
        }

        public int getID() {
            return ID;
        }

        @Override
        public String toString() {
            return getName();
        }

    }

}

