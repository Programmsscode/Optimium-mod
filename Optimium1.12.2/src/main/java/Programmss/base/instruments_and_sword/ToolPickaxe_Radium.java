package Programmss.base.instruments_and_sword;

import Programmss.base.Main;
import net.minecraft.item.ItemPickaxe;


public class ToolPickaxe_Radium extends ItemPickaxe {
    public ToolPickaxe_Radium(String name, ToolMaterial material) {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(Main.inventoryoptimium);
    }

}
