package Programmss.base.creatinggeneration;
import java.util.Random;
import Programmss.base.BlocksRegistery;
import net.minecraft.block.state.pattern.BlockMatcher;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.IChunkGenerator;
import net.minecraft.world.gen.feature.WorldGenMinable;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.fml.common.IWorldGenerator;

public class ModWorldGen implements IWorldGenerator{
	private WorldGenerator ore_end_optimium;
	private WorldGenerator ore_overworld_optimium;
	private WorldGenerator ore_nether_radium;
	private WorldGenerator ore_overworld_radium;
	public ModWorldGen() {
	 ore_end_optimium = new WorldGenMinable(BlocksRegistery.OREOPTIMIUM.getDefaultState(),9,BlockMatcher.forBlock(Blocks.END_STONE));
	 ore_overworld_optimium = new WorldGenMinable(BlocksRegistery.OREOPTIMIUM.getDefaultState(),9,BlockMatcher.forBlock(Blocks.STONE));
	 ore_nether_radium = new WorldGenMinable(BlocksRegistery.BLOCKRADIUMORE.getDefaultState(),9,BlockMatcher.forBlock(Blocks.NETHERRACK));
	
 ore_overworld_radium = new WorldGenMinable(BlocksRegistery.BLOCKRADIUMORE.getDefaultState(),9,BlockMatcher.forBlock(Blocks.STONE));
	 }
@Override
public void generate(Random random,int chunkX,int chunkZ,World world,IChunkGenerator chunkGenerator,IChunkProvider chunkProvider) {
	
	switch(world.provider.getDimension()) {
	
case -1:
		
	runGenerator(ore_nether_radium,world,random,chunkX,chunkZ,1,60,90);
		
	break;
case 0:
	runGenerator(ore_overworld_optimium,world,random,chunkX,chunkZ,1,1,10);
	runGenerator(ore_overworld_radium,world,random,chunkX,chunkZ,1,20,35);
		
	break;
case 1:
		
	
	runGenerator(ore_end_optimium,world,random,chunkX,chunkZ,2,0,39);
	}
}

private void runGenerator(WorldGenerator gen,World world,Random rand,int chunkX,int chunkZ,int chance,int minHeight,int maxHeight) {
if(minHeight > maxHeight ||minHeight < 0 ||maxHeight > 256) throw new IllegalArgumentException("Ore generated out of bounds");
	int heightDiff = maxHeight - minHeight + 1;
	for(int i = 0;i < chance;i++) {
		int x = chunkX * 16 + rand.nextInt(16);
		int y =minHeight + rand.nextInt(heightDiff);
		int z = chunkZ * 16 + rand.nextInt(16);
		gen.generate(world, rand, new BlockPos(x,y,z));
	}
}
}
