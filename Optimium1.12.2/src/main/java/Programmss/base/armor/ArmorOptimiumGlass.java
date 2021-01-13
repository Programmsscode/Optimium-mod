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
public class ArmorOptimiumGlass extends ItemArmor {
	 public ArmorOptimiumGlass(String name, ArmorMaterial materialIn, int renderIndexIn, EntityEquipmentSlot equipmentSlotIn) {
	        super(materialIn, renderIndexIn, equipmentSlotIn);
	        this.setRegistryName(name);
	        this.setUnlocalizedName(name);
	        this.setCreativeTab(Main.inventoryoptimium);
	    }
	

	public static final ArmorMaterial OPTIMIUM_GLASS_MATERIAL = EnumHelper.addArmorMaterial("armor_material_optimium_glass","glas:optimium_glass",68,new int[] {5,10,12,5},10,SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND,4.0F);


public static final Item OPTIMIUM_GLASS_HELMET= new ArmorOptimiumGlass("optimium_glass_helmet",OPTIMIUM_GLASS_MATERIAL,1,EntityEquipmentSlot.HEAD);
public static final Item OPTIMIUM_GLASS_CHESTPLATE= new ArmorOptimiumGlass("optimium_glass_chestplate",OPTIMIUM_GLASS_MATERIAL,1,EntityEquipmentSlot.CHEST);
public static final Item OPTIMIUM_GLASS_LEGGINGS= new ArmorOptimiumGlass("optimium_glass_leggings",OPTIMIUM_GLASS_MATERIAL,2,EntityEquipmentSlot.LEGS);
public static final Item OPTIMIUM_GLASS_BOOTS= new ArmorOptimiumGlass("optimium_glass_boots",OPTIMIUM_GLASS_MATERIAL,1,EntityEquipmentSlot.FEET );
/**
 * Called to tick armor in the armor slot. Override to do something
 *
 * @param world
 * @param player
 * @param itemStack
 */
public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack)
{

	 
	 if(player.inventory.armorItemInSlot(0).getItem() == ItemsRegistry.OPTIMIUM_GLASS_BOOTS) {
player.addPotionEffect(new PotionEffect(MobEffects.SPEED,1200,1));
player.addPotionEffect(new PotionEffect(MobEffects.STRENGTH,1200,1));
		} 
	 
     if(player.inventory.armorItemInSlot(1).getItem() == ItemsRegistry.OPTIMIUM_GLASS_LEGGINGS) {
player.addPotionEffect(new PotionEffect(MobEffects.RESISTANCE,1200,3));
player.addPotionEffect(new PotionEffect(MobEffects.HASTE,1200,1));
}

  if(player.inventory.armorItemInSlot(2).getItem() == ItemsRegistry.OPTIMIUM_GLASS_CHESTPLATE) {
player.addPotionEffect(new PotionEffect(MobEffects.FIRE_RESISTANCE,1200,1));
player.addPotionEffect(new PotionEffect(MobEffects.ABSORPTION,1200,1));
}

 if(player.inventory.armorItemInSlot(3).getItem() == ItemsRegistry.OPTIMIUM_GLASS_HELMET) {
player.addPotionEffect(new PotionEffect(MobEffects.JUMP_BOOST,600,1));
player.addPotionEffect(new PotionEffect(MobEffects.SATURATION,600,1));

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
