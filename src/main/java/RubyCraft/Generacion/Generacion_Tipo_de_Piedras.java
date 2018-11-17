package RubyCraft.Generacion;

import java.util.Random;

import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Principal;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenHell;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class Generacion_Tipo_de_Piedras implements IWorldGenerator{

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
		switch(world.provider.dimensionId){
		case 0:
			generateOverworld(world, random, chunkX, chunkZ);
			break;
		}
	}
	public void generateOverworld(World world,Random rand, int x, int z){
		//generateOre(block, world, rand, x, z, minVienSize, maxVienSize, chance, minY, maxY, generateIn);
    	generateOre(RubyCraft.Andesita, world, rand, x, z, 20, 21, 25, 8, 60, Blocks.stone);
    	generateOre(RubyCraft.Diorita, world, rand, x, z, 20, 21, 25, 8, 60, Blocks.stone);
    	generateOre(RubyCraft.Granito, world, rand, x, z, 20, 21, 25, 8, 60, Blocks.stone);

    	generarbarro(Principal.Barro, world, rand, x, z, 10, 40, 2, 60, 90, Blocks.water);
    	generarbarro(Principal.Barro, world, rand, x, z, 10, 40, 2, 60, 90, Blocks.flowing_water);
    }
    
    public void generateOre(Block block, World world, Random random, int chunkX, int chunkZ, int minVienSize, int maxVienSize, int chance, int minY, int maxY, Block generateIn){
    	int vienSize = minVienSize + random.nextInt(maxVienSize - minVienSize);
    	int heightRange = maxY - minY;
    	WorldGenMinable gen = new WorldGenMinable(block, vienSize, generateIn);
    	for(int i = 0; i < chance; i++){
    		int xRand = chunkX * 16 + random.nextInt(16);
    		int yRand = random.nextInt(heightRange);
    		int zRand = chunkZ * 16 + random.nextInt(16);
    		gen.generate(world, random, xRand, yRand, zRand);
    		
    	    }
        }   
    
    public void generarbarro(Block block,World world, Random rand, int x,int z, int min,int max, int chance, int ymin, int ymax, Block togenerate) {
    	String s = world.getBiomeGenForCoords(x, z).biomeName;
    	
    	if (s.startsWith("Forest")){
    	{
    	int vienSize = min + rand.nextInt(max - min);
    	int heightRange = 63;
    	WorldGenMinable gen = new WorldGenMinable(block, vienSize, togenerate);
    	for(int i = 0; i < chance; i++){
    		int xRand = x * 16 + rand.nextInt(16);
    		int yRand = 61;
    		int zRand = z * 16 + rand.nextInt(16);
    		
    		gen.generate(world, rand, xRand, yRand, zRand);
    		
    	    }
    	}
    }
   }
	}