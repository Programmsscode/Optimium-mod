package Programmss.base.craft;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;

public class CraftingRegistery {
	  public static void register() {
	        registerRecipes("glassesoptimiumround");
	        registerRecipes("optimium");
	        registerRecipes("pressedglass");
	        registerRecipes("glassesingot");
	        registerRecipes("optimium_glass_helmet");
	        registerRecipes("optimium_glass_chestplate");
	        registerRecipes("optimium_glass_leggings");
	        registerRecipes("optimium_glass_boots");
	        registerRecipes("instrumentaxe_optimium_glass");
	        registerRecipes("instrumenthoee_optimium_glass");
	        registerRecipes("instrumentpickaxe_optimium_glass");
	        registerRecipes("instrumentshovel_optimium_glass");
	        registerRecipes("instrumentsword_optimium_glass");
	        registerRecipes("toolaxe_radium");
	        registerRecipes("toolhoee_radium");
	        registerRecipes("toolpickaxe_radium");
	        registerRecipes("toolshovel_radium");
	        registerRecipes("toolsword_radium");
	        registerRecipes("radium_helmet");
	        registerRecipes("radium_chestplate");
	        registerRecipes("radium_leggings");
	        registerRecipes("radium_boots");
	    }

	    private static void registerRecipes(String name) {
	        CraftingHelper.register(new ResourceLocation("glas", name), (IRecipeFactory) (context, json) -> CraftingHelper.getRecipe(json, context));
	    }
}
