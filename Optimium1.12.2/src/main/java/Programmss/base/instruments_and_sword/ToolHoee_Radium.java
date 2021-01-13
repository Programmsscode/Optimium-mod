package Programmss.base.instruments_and_sword;

import Programmss.base.Main;
import net.minecraft.item.ItemHoe;



public class ToolHoee_Radium extends ItemHoe {
    public ToolHoee_Radium(String name, ToolMaterial material) {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(Main.inventoryoptimium);
    }
   
}
