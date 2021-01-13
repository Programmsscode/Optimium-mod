package Programmss.base.craft;

import Programmss.base.ItemsRegistry;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class CrafingFurnaceRecipes {
public static void registerRecipes() {
	
	GameRegistry.addSmelting(new ItemStack(ItemsRegistry.RADIUM),new ItemStack(ItemsRegistry.RADIUMINGOT) , 0.50F);
	
}
}
