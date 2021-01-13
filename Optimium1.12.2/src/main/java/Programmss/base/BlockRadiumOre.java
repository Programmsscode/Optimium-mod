package Programmss.base;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockRadiumOre extends Block{
	  public BlockRadiumOre(String name){
			
	        super(Material.IRON);
	        this.setRegistryName(name);
	        this.setUnlocalizedName(name);
	        this.setCreativeTab(Main.inventoryoptimium);
	        this.setHardness(10.0F);
	        this.setResistance(600.0F);
	        this.setLightLevel(8.0F);
	        this.setHarvestLevel("pickaxe", 3);
	        this.setSoundType(SoundType.GLASS);
	   
	    }
	
	 
@Override
public Item getItemDropped(IBlockState state ,Random rand,int fortune) {
	return ItemsRegistry.RADIUM;}
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
	        return false;
	    }
}
