package RubyCraft.Eventos;

import RubyCraft.RubyCraft;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class MinaRuby {
	
	@SubscribeEvent
	public void whenIGetARubyOre(PlayerEvent.ItemPickupEvent e){
		if(e.pickedUp.getEntityItem().isItemEqual(new ItemStack(Item.getItemFromBlock(RubyCraft.Mena_de_Ruby)))){
			e.player.addStat(Logros.MinaRuby, 1);
		}
	}

}