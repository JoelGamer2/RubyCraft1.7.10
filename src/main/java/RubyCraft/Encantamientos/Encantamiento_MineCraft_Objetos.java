package RubyCraft.Encantamientos;

import RubyCraft.RubyCraft;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;

public class Encantamiento_MineCraft_Objetos {
	
	private Minecraft mc;
	
	public Encantamiento_MineCraft_Objetos(Minecraft mc){
		this.mc = mc;
	}
	
	@SubscribeEvent
	public void onPlayerTickEvent(PlayerTickEvent event){
		
		
		if(event.player.getCurrentArmor(0)!= null){
		     ItemStack botas = event.player.getCurrentArmor(0);
		     
		     if(botas.getItem() == Items.diamond_boots || botas.getItem() == Items.iron_boots || botas.getItem() == Items.golden_boots || botas.getItem() == Items.leather_boots || botas.getItem() == Items.chainmail_boots){
		    	 int j = EnchantmentHelper.getEnchantmentLevel(RubyCraft.BotasdeVelocidad.effectId, botas);
		    	 if(j > 0){
		    		 event.player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 50, j - 1));
		    	 }
		     }
		}if(event.player.getCurrentArmor(1)!= null){
			ItemStack grebas = event.player.getCurrentArmor(1);
			
			if(grebas.getItem() == Items.diamond_leggings || grebas.getItem() == Items.iron_leggings || grebas.getItem() == Items.golden_leggings || grebas.getItem() == Items.leather_leggings || grebas.getItem() == Items.chainmail_leggings){
				int j = EnchantmentHelper.getEnchantmentLevel(RubyCraft.Grebas_de_Regeneracion.effectId, grebas);
				if(j > 0){
					event.player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 50, j - 1));
				}
			}
	     }
	
  }
}
