package Programmss.base.instruments_and_sword;

import Programmss.base.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;

public class ToolAxe_Radium extends ItemAxe{	
    public  ToolAxe_Radium(String name, ToolMaterial material) {
    
        // То что указано как 2, 2 это урон и скорость рубки. Можете задать свои значения, но лучше не оставлять данные поля пустыми.
        super(material,12 , 2);
        this.setRegistryName("toolaxe_radium");
        this.setUnlocalizedName("toolaxe_radium");
        this.setCreativeTab(Main.inventoryoptimium);
       
    }   public static final Item.ToolMaterial MATERIALRADIUMTOOL = EnumHelper.addToolMaterial("glas:toolradium", 4,2160, 40.0F, 7.0F, 10);

    } 
	

