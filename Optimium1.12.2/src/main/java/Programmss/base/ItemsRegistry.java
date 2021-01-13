package Programmss.base;



import Programmss.base.armor.ArmorOptimiumGlass;
import Programmss.base.armor.ArmorRadium;
import Programmss.base.craft.CrafingFurnaceRecipes;
import Programmss.base.creatinggeneration.ModWorldGen;
import Programmss.base.instruments_and_sword.InstrumentAxe_Optimium_Glass;
import Programmss.base.instruments_and_sword.InstrumentHoee_Optimium_Glass;
import Programmss.base.instruments_and_sword.InstrumentPickaxe_Optimium_Glass;
import Programmss.base.instruments_and_sword.InstrumentShovel_Optimium_Glass;
import Programmss.base.instruments_and_sword.InstrumentSword_Optimium_Glass;
import Programmss.base.instruments_and_sword.ToolAxe_Radium;
import Programmss.base.instruments_and_sword.ToolHoee_Radium;
import Programmss.base.instruments_and_sword.ToolPickaxe_Radium;
import Programmss.base.instruments_and_sword.ToolShovel_Radium;
import Programmss.base.instruments_and_sword.ToolSword_Radium;

//import Programmss.base.armor.ArmorBase;

import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;



@ObjectHolder("glas")
@Mod.EventBusSubscriber
public class ItemsRegistry {


	@SideOnly(Side.CLIENT)
	private static void registryModel(Item item) {
	    final ResourceLocation regName = item.getRegistryName();
	    final ModelResourceLocation mrl = new ModelResourceLocation(regName, "inventory");
	    ModelBakery.registerItemVariants(item, mrl);// Регистрация вариантов предмета. Это нужно если мы хотим использовать подтипы предметов/блоков(см. статью подтипы)
	    ModelLoader.setCustomModelResourceLocation(item, 0, mrl);// Устанавливаем вариант модели для нашего предмета. Без регистрации варианта модели, сама модель не будет установлена для предмета/блока(см. статью подтипы)
	}
	
 @ObjectHolder("optimium_glass_helmet")
  public static final Item OPTIMIUM_GLASS_HELMET = null;
 @ObjectHolder("optimium_glass_chestplate")
public static final Item OPTIMIUM_GLASS_CHESTPLATE = null;
	 @ObjectHolder("optimium_glass_leggings")
public static final Item OPTIMIUM_GLASS_LEGGINGS = null; 
	 @ObjectHolder("optimium_glass_boots")
	public static final Item OPTIMIUM_GLASS_BOOTS = null;
	
		
@ObjectHolder("radium_helmet")
public static final Item RADIUM_HELMET = null;
@ObjectHolder("radium_chestplate")
public static final Item RADIUM_CHESTPLATE = null;
@ObjectHolder("radium_leggings")
public static final Item RADIUM_LEGGINGS = null; 
@ObjectHolder("radium_boots")
public static final Item RADIUM_BOOTS = null;
		
    @ObjectHolder("optimium")
    public static final Item OPTIMIUM = null;
    @ObjectHolder("glassesoptimiumround")
    public static final Item GLASSESOPTIMIUMROUND = null;
    @ObjectHolder("shatteredoptimium")
    public static final Item SHATTEREDOPTIMIUM = null; 
  @ObjectHolder("glassesingot")
 public static final Item GLASSESINGOT = null;
  @ObjectHolder("radium")
 public static final Item RADIUM = null;
  @ObjectHolder("radiumingot")
  public static final Item RADIUMINGOT = null;
  @ObjectHolder("instrumentaxe_optimium_glass")
public static final Item INSTRUMENTAXE_OPTIMIUM_GLASS = null;
  @ObjectHolder("instrumenthoee_optimium_glass")
public static final Item INSTRUMENTHOEE_OPTIMIUM_GLASS = null;
  @ObjectHolder("instrumentpickaxe_optimium_glass")
  public static final Item INSTRUMENTPICKAXE_OPTIMIUM_GLASS = null;
  @ObjectHolder("instrumentshovel_optimium_glass")
public static final Item INSTRUMENTSHOVEL_OPTIMIUM_GLASS = null;
  @ObjectHolder("instrumentsword_optimium_glass")
  public static final Item INSTRUMENTSWORD_OPTIMIUM_GLASS = null; 
  @ObjectHolder("toolaxe_radium")
  public static final Item TOOLAXE_RADIUM = null;
  @ObjectHolder("toolhoee_radium")
  public static final Item TOOLHOEE_RADIUM = null;
  @ObjectHolder("toolpickaxe_radium")
  public static final Item TOOLPICKAXE_RADIUM = null;
  @ObjectHolder("toolshovel_radium")
  public static final Item TOOLSHOVEL_RADIUM = null;
  @ObjectHolder("toolsword_radium")
  public static final Item TOOLSWORD_RADIUM = null;
    @SubscribeEvent
    public static void onRegistryItem(RegistryEvent.Register<Item> e) {
        // Также вместо `register` можно использовать `registerAll`, чтобы прописать все предметы разом
        e.getRegistry().register(new ItemsOptimium());
        e.getRegistry().register(new ItemsGlassesoptimiumround());
        e.getRegistry().register(new ItemsShatteredOptimium());
        e.getRegistry().register(new ItemsGlassesIngot());
        e.getRegistry().register(new ItemsRadium());
        e.getRegistry().register(new ItemsRadiumIngot());
        e.getRegistry().register(new InstrumentAxe_Optimium_Glass("instrumentaxe_optimium_glass", InstrumentAxe_Optimium_Glass.MATERIALOPTIMIUMGLASSINSTRUMENT));
        e.getRegistry().register(new InstrumentHoee_Optimium_Glass("instrumenthoee_optimium_glass", InstrumentAxe_Optimium_Glass.MATERIALOPTIMIUMGLASSINSTRUMENT));
        e.getRegistry().register(new InstrumentPickaxe_Optimium_Glass("instrumentpickaxe_optimium_glass", InstrumentAxe_Optimium_Glass.MATERIALOPTIMIUMGLASSINSTRUMENT));
        e.getRegistry().register(new InstrumentShovel_Optimium_Glass("instrumentshovel_optimium_glass", InstrumentAxe_Optimium_Glass.MATERIALOPTIMIUMGLASSINSTRUMENT));
        e.getRegistry().register(new InstrumentSword_Optimium_Glass("instrumentsword_optimium_glass", InstrumentAxe_Optimium_Glass.MATERIALOPTIMIUMGLASSINSTRUMENT));
        e.getRegistry().register(new ToolAxe_Radium("toolaxe_radium", ToolAxe_Radium.MATERIALRADIUMTOOL));
        e.getRegistry().register(new ToolHoee_Radium("toolhoee_radium", ToolAxe_Radium.MATERIALRADIUMTOOL));
        e.getRegistry().register(new ToolPickaxe_Radium("toolpickaxe_radium", ToolAxe_Radium.MATERIALRADIUMTOOL));
        e.getRegistry().register(new ToolShovel_Radium("toolshovel_radium", ToolAxe_Radium.MATERIALRADIUMTOOL));
        e.getRegistry().register(new ToolSword_Radium("toolsword_radium", ToolAxe_Radium.MATERIALRADIUMTOOL));
        //   e.getRegistry().registerAll();
e.getRegistry().register(new ArmorOptimiumGlass("optimium_glass_boots",ArmorOptimiumGlass.OPTIMIUM_GLASS_MATERIAL, 1,EntityEquipmentSlot.FEET));
e.getRegistry().register(new ArmorOptimiumGlass("optimium_glass_leggings",ArmorOptimiumGlass.OPTIMIUM_GLASS_MATERIAL,2,EntityEquipmentSlot.LEGS));
e.getRegistry().register(new ArmorOptimiumGlass("optimium_glass_chestplate",ArmorOptimiumGlass.OPTIMIUM_GLASS_MATERIAL,1,EntityEquipmentSlot.CHEST));
e.getRegistry().register(new ArmorOptimiumGlass("optimium_glass_helmet",ArmorOptimiumGlass.OPTIMIUM_GLASS_MATERIAL,1,EntityEquipmentSlot.HEAD));

e.getRegistry().register(new ArmorRadium("radium_helmet",ArmorRadium.RADIUM_MATERIAL,1,EntityEquipmentSlot.HEAD));
e.getRegistry().register(new ArmorRadium("radium_chestplate",ArmorRadium.RADIUM_MATERIAL,1,EntityEquipmentSlot.CHEST));
e.getRegistry().register(new ArmorRadium("radium_leggings",ArmorRadium.RADIUM_MATERIAL,2,EntityEquipmentSlot.LEGS));
e.getRegistry().register(new ArmorRadium("radium_boots",ArmorRadium.RADIUM_MATERIAL,1,EntityEquipmentSlot.FEET ));


   //   ArmorItem.OPTIMIUM_GLASS_HELMET,ArmorItem.OPTIMIUM_GLASS_CHESTPLATE,ArmorItem.OPTIMIUM_GLASS_BOOTS,ArmorItem.OPTIMIUM_GLASS_LEGGINGS
       
    }

   
    @SubscribeEvent
    @SideOnly(Side.CLIENT)
    public static void onRegistryModel(ModelRegistryEvent e) {
registryModel(OPTIMIUM); // См. следующую часть данной главы
registryModel(GLASSESOPTIMIUMROUND);
registryModel(SHATTEREDOPTIMIUM);
registryModel(GLASSESINGOT);
registryModel(RADIUM);
registryModel(RADIUMINGOT);
registryModel(INSTRUMENTAXE_OPTIMIUM_GLASS);
registryModel(INSTRUMENTSHOVEL_OPTIMIUM_GLASS);
registryModel(INSTRUMENTPICKAXE_OPTIMIUM_GLASS);
registryModel(INSTRUMENTHOEE_OPTIMIUM_GLASS);
registryModel(INSTRUMENTSWORD_OPTIMIUM_GLASS);
registryModel(TOOLAXE_RADIUM);
registryModel(TOOLHOEE_RADIUM);
registryModel(TOOLPICKAXE_RADIUM);
registryModel(TOOLSHOVEL_RADIUM);
registryModel(TOOLSWORD_RADIUM);
registryModel(OPTIMIUM_GLASS_HELMET); // См. следующую часть данной главы
registryModel(OPTIMIUM_GLASS_CHESTPLATE);
registryModel(OPTIMIUM_GLASS_LEGGINGS);
registryModel(OPTIMIUM_GLASS_BOOTS);
registryModel(RADIUM_HELMET);
registryModel(RADIUM_CHESTPLATE);
registryModel(RADIUM_LEGGINGS);
registryModel(RADIUM_BOOTS);

    	
    }   
    
    public static void otherRegister() {
 
    	CrafingFurnaceRecipes.registerRecipes();
    	GameRegistry.registerWorldGenerator(new ModWorldGen(), 0);
    	
}}