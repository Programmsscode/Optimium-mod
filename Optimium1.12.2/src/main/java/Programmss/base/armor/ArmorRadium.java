package Programmss.base.armor;

import Programmss.base.ItemsRegistry;
import Programmss.base.Main;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.MobEffects;
import net.minecraft.init.SoundEvents;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.util.EnumHelper;

public class ArmorRadium extends ItemArmor {
	 public ArmorRadium(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
	        super(materialIn, renderIndexIn, equipmentSlotIn);
	        this.setRegistryName(name);
	        this.setUnlocalizedName(name);
	        this.setCreativeTab(Main.inventoryoptimium);
	    }
	

	public static final ArmorMaterial RADIUM_MATERIAL = EnumHelper.addArmorMaterial("armor_material_radium","glas:radium",50,new int[] {4,9,10,5},10,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,2.0F);


public static final Item RADIUM_HELMET= new ArmorOptimiumGlass("radium_helmet",RADIUM_MATERIAL,1,EntityEquipmentSlot.HEAD);
public static final Item RADIUM_CHESTPLATE= new ArmorOptimiumGlass("radium_chestplate",RADIUM_MATERIAL,1,EntityEquipmentSlot.CHEST);
public static final Item RADIUM_LEGGINGS= new ArmorOptimiumGlass("radium_leggings",RADIUM_MATERIAL,2,EntityEquipmentSlot.LEGS);
public static final Item RADIUM_BOOTS= new ArmorOptimiumGlass("radium_boots",RADIUM_MATERIAL,1,EntityEquipmentSlot.FEET );
public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
{

	 
	 if(player.inventory.armorItemInSlot(0).getItem() == ItemsRegistry.RADIUM_BOOTS) {
		 player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,1200,1));
		 player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,1200));
		} 
	 
     if(player.inventory.armorItemInSlot(1).getItem() == ItemsRegistry.RADIUM_LEGGINGS) {
    	 player.addPotionEffect(new PotionEffect(MobEffects.SPEED,1200));
    	  player.addPotionEffect(new PotionEffect(MobEffects.HASTE,1200));
}

  if(player.inventory.armorItemInSlot(2).getItem() == ItemsRegistry.RADIUM_CHESTPLATE) {
	  player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,1200,2));
	  player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION,1200));
	  player.addPotionEffect(new PotionEffect(MobEffects.GLOWING,1200));
}

 if(player.inventory.armorItemInSlot(3).getItem() == ItemsRegistry.RADIUM_HELMET) {

	 player.addPotionEffect(new PotionEffect(MobEffects.WATER_BREATHING,1200,1));
	 player.addPotionEffect(new PotionEffect(MobEffects.SATURATION,600));
}
 
 
 //if(player.inventory.armorItemInSlot(0).getItem() == ItemsRegistry.OPTIMIUM_GLASS_BOOTS) {
//player.addPotionEffect(new PotionEffect(MobEffects.GLOWING,1200));
	//} 
 //
// if(player.inventory.armorItemInSlot(1).getItem() == ItemsRegistry.OPTIMIUM_GLASS_LEGGINGS) {
//player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,1200,1));
//}
//
//if(player.inventory.armorItemInSlot(2).getItem() == ItemsRegistry.OPTIMIUM_GLASS_CHESTPLATE) {
//player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,1200,1));
//}
//
//if(player.inventory.armorItemInSlot(3).getItem() == ItemsRegistry.OPTIMIUM_GLASS_HELMET) {
//player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,1200,1));
//}
	//	player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE, Integer.MAX_VALUE));
//  if(player.inventory.armorItemInSlot(0).getItem() == ItemsMod.DARK_BOOTS) {
//if (player.inventory.armorItemInSlot(1).getItem() == ItemsMod.DARK_LEGS) {
   // if (player.inventory.armorItemInSlot(2).getItem() == ItemsMod.DARK_CHEST) {
       // if (player.inventory.armorItemInSlot(3).getItem() == ItemsMod.DARK_HEAD) {
	 
}
}



