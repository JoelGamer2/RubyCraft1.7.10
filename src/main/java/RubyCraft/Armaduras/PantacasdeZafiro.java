package RubyCraft.Armaduras;

import RubyCraft.RubyCraft;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class PantacasdeZafiro extends ItemArmor {

	 public PantacasdeZafiro(ArmorMaterial armormaterial, int renderIdex, int armorType) {
		super(armormaterial, renderIdex, armorType);
		
	}
	 @Override
		public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type){
			
			if(this.armorType == 2){
				return "rc:textures/models/armor/Zafiro_layer_2.png";
			}
			return "rc:textures/models/armor/Zafiro_layer_1.png";
			
		}
	 
	 public void onArmorTick(World world, EntityPlayer player, ItemStack stack){
			
			if(stack.getItem() == RubyCraft.PantacasdeZafiro){
				int level = EnchantmentHelper.getEnchantmentLevel(RubyCraft.Grebas_de_Regeneracion.effectId, stack);
				if(level > 0){
					player.addPotionEffect(new PotionEffect(Potion.regeneration.getId(), 50, level -1));
				}
			}
		}
}
