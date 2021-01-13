package Programmss.base;
import Programmss.base.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



@Mod(modid = Main.MODID , version = Main.VERSION )
public class Main
{
    public static final String MODID = "glas";
    public static final String VERSION = "1.0";

    @SidedProxy(clientSide = "Programmss.base.proxy.ClientProxy", serverSide = "Programmss.base.proxy.CommonProxy")
    public static CommonProxy proxy;
    public static final CreativeTabs inventoryoptimium = new CreativeTabs("glas") {
        @Override
        public ItemStack getTabIconItem() {
            
            return new ItemStack(ItemsRegistry.GLASSESOPTIMIUMROUND);
        }
    };
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ItemsRegistry.otherRegister();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
ItemsRegistry.otherRegister();
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) 
    {
        proxy.postInit(event);
    }
}