package Eventos.Verano.Items;

import java.util.List;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.StatCollector;

public class Acero_Fundido_con_Aguamarina_Transparente extends Item{
	
	public Acero_Fundido_con_Aguamarina_Transparente()
	{
		this.setMaxStackSize(8);
	}
	
	@Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lore, boolean par) 
	{
		lore.add(EnumChatFormatting.AQUA + StatCollector.translateToLocal("lore.EventoVerano.name"));
    }

}