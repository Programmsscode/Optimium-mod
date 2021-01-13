package Programmss.base.instruments_and_sword;

import Programmss.base.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;


public class ToolSword_Radium extends ItemSword {
    public ToolSword_Radium(String name, ToolMaterial material) {
        super(material);
        this.setRegistryName(name);
        this.setUnlocalizedName(name);
        this.setCreativeTab(Main.inventoryoptimium);
    }
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
    {
    	if (player.getActivePotionEffect(MobEffects.GLOWING) == null)
    		player.addPotionEffect(new PotionEffect(MobEffects.GLOWING, Integer.MAX_VALUE));
   
    }
}
