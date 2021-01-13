package Programmss.base.instruments_and_sword;

import Programmss.base.Main;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraftforge.common.util.EnumHelper;
public class InstrumentAxe_Optimium_Glass extends ItemAxe{	
    public InstrumentAxe_Optimium_Glass(String name, ToolMaterial material) {
    
        // То что указано как 2, 2 это урон и скорость рубки. Можете задать свои значения, но лучше не оставлять данные поля пустыми.
        super(material,16,2 );
        this.setRegistryName("instrumentaxe_optimium_glass");
        this.setUnlocalizedName("instrumentaxe_optimium_glass");
        this.setCreativeTab(Main.inventoryoptimium);
     
    }   public static final Item.ToolMaterial MATERIALOPTIMIUMGLASSINSTRUMENT = EnumHelper.addToolMaterial("glas:tool", 4, 3100, 43.0F, 13.0F, 10);
}
