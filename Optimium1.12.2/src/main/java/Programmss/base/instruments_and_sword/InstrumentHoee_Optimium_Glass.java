package Programmss.base.instruments_and_sword;

import Programmss.base.Main;
import net.minecraft.item.ItemHoe;

public class InstrumentHoee_Optimium_Glass extends ItemHoe {
    public InstrumentHoee_Optimium_Glass(String name, ToolMaterial material) {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(Main.inventoryoptimium);
    }

}
