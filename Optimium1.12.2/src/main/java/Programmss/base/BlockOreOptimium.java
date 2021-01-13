package Programmss.base;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockOreOptimium extends Block{
	  public BlockOreOptimium(String name){
	
	        super(Material.IRON);
	        this.setRegistryName(name);
	        this.setUnlocalizedName(name);
	        this.setCreativeTab(Main.inventoryoptimium);
	        this.setHardness(30.0F);
	        this.setResistance(7.0F);
	        this.setLightLevel(7.0F);
	        this.setHarvestLevel("pickaxe", 4);
	        this.setSoundType(SoundType.METAL);
	   
	    }
	
	 
@Override
public Item getItemDropped(IBlockState state ,Random rand,int fortune) {
  Random rnd = new Random();
	int droprandom = rnd.nextInt(100);
	if(droprandom < 60) {
		return ItemsRegistry.OPTIMIUM;	

	}else {
		return ItemsRegistry.SHATTEREDOPTIMIUM;
	}

}
@Override
public int quantityDropped(Random rand) {
	
	return 1;
	
}
	
	    @Override
	    public boolean isOpaqueCube(IBlockState state)
	    {
	        return false;
	    }

	    @Override
	    public boolean isFullCube(IBlockState state)
	    {
	        return true;
	    }
}
