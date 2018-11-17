package RubyCraft.Generacion;

import java.util.Random;

import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Principal;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class Generacion_Tipo_de_Piedras implements IWorldGenerator{

	
	private static int barroand = 0;
	private static int barroambar = 0;
	private static int barrohueso = 0;
	private static BiomeGenBase biomas;
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

    	generarbarro(Principal.Barro, world, rand, x, z, 10, 40, 1, 60, 90, Blocks.water);

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

       
    	int vienSize = min + rand.nextInt(max - min);
    	int menas = vienSize;
    	barroand = rand.nextInt(menas - 3);
		barrohueso = rand.nextInt(menas - 5);
		barroambar = rand.nextInt(menas -4);
    	WorldGenMinable gen = new WorldGenMinable(block, vienSize, togenerate);
    	WorldGenMinable barrocongelado = new WorldGenMinable(Principal.Barro_Congelado, vienSize,Principal.Barro);
    	
    	WorldGenMinable barrocongeladohueso = new WorldGenMinable(Principal.Barro_Congelado_Hueso,barrohueso, Principal.Barro_Congelado);
    	WorldGenMinable barrocongeladoand = new WorldGenMinable(Principal.Barro_Congelado_Adn, barroand, Principal.Barro_Congelado);
    	WorldGenMinable barrocongeladoambar = new WorldGenMinable(Principal.Barro_Congelado_Ambar, barroand, Principal.Barro_Congelado);

    	
    	for(int i = 0; i < chance; i++){
    		int xRand = x * 16 + rand.nextInt(16);
    		int yRand = 61;
    		int zRand = z * 16 + rand.nextInt(16);
    	   if(world.getBiomeGenForCoords(xRand, zRand).biomeName.startsWith("Swampland")) {
    		gen.generate(world, rand, xRand, yRand, zRand);
    		
    		barrocongelado.generate(world, rand, xRand, yRand - 1, zRand);
    		barrocongeladoambar.generate(world, rand, xRand, yRand - 1, zRand);
    		barrocongeladoand.generate(world, rand, xRand, yRand - 1, zRand);
    		barrocongeladohueso.generate(world, rand, xRand, yRand - 1, zRand);
                }
    	     }  
          }   
	}