package Programmss.base.instruments_and_sword;

import Programmss.base.Main;
import net.minecraft.item.ItemSpade;


public class ToolShovel_Radium extends ItemSpade{
	  public ToolShovel_Radium(String name, ToolMaterial material) {
	        super(material);
	        this.setRegistryName(name);
	        this.setUnlocalizedName(name);
	        this.setCreativeTab(Main.inventoryoptimium);
	    }

}
