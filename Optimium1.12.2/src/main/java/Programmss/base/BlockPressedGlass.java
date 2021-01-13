package Programmss.base;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
public class BlockPressedGlass extends Block{
	
	    public BlockPressedGlass(String name)
	    {
	        super(Material.GLASS);
	        this.setRegistryName(name);
	        this.setUnlocalizedName(name);
	        this.setHarvestLevel("pickaxe", 3); 
	        this.setHardness(30.0F);
	        this.setResistance(6000.0F);
	        this.setCreativeTab(Main.inventoryoptimium);
	    }

	    @Override
	    public boolean isOpaqueCube(IBlockState state)
	    {
	        return true;
	    }

	    @Override
	    public boolean isFullCube(IBlockState state)
	    {
	      return false;
	   }
	}

