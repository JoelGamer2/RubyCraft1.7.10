package Eventos.Navidad.Bloques;

import java.util.Random;

import RubyCraft.RubyCraft;
import RubyCraft.xJuanathan.Principal;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.world.IBlockAccess;

public class Madera_Fosil_Ambar extends Block {

	public Madera_Fosil_Ambar(Material p_i45394_1_) {
		super(p_i45394_1_);
		this.setStepSound(this.soundTypeWood);
	}
	
	//Dropeo al romper el Bloque
	
			@Override
			public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_) 
			{
				if (RubyCraft.Navidad)
				{
				    return Principal.ambar;
				}
				
				else 
				{
					return null;
				}
			}
			
	// Dropeo de item afectado por encantamiento fortuna
			
			@Override
			public int quantityDroppedWithBonus(int fortune, Random rand) 
			{
				
				int probabilidad;
				
				if (fortune >= 1)
				{
					probabilidad = rand.nextInt(100);
					
					if (probabilidad >= 80 && probabilidad < 98)
					{
						return fortune + 2;
					}
					
					else if (probabilidad >= 98 && probabilidad <= 100)
					{
						return fortune + 3;
					}
					
					else {
					
					return fortune + 1;
					}
				}
				
				else {
					
				return 1;
				}
				
			}
			
			
	//Dropeo de experiencia afectado por encantamiento fortuna
			
			@Override
			public int getExpDrop(IBlockAccess world, int metadata, int fortune)
			{
				if (RubyCraft.Navidad)
				{
			    	if (fortune >= 1)
			    	{
			    		return 2 + (fortune*3);
			    	}
				
			    	else
			    	{
			    	    return 2;
			    	}
			    }
				
				else
				{
					return 0;
				}
			}
}
