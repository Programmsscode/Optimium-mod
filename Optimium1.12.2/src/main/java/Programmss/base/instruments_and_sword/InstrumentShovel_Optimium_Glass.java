package Programmss.base.instruments_and_sword;

import Programmss.base.Main;
import net.minecraft.item.ItemSpade;

public class InstrumentShovel_Optimium_Glass extends ItemSpade{
	  public InstrumentShovel_Optimium_Glass(String name, ToolMaterial material) {
	        super(material);
	        this.setRegistryName(name);
	        this.setUnlocalizedName(name);
	        this.setCreativeTab(Main.inventoryoptimium);
	    }
	}

