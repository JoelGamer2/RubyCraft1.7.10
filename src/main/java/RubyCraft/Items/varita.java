package RubyCraft.Items;

import java.util.List;

import RubyCraft.RubyCraft;
import cpw.mods.fml.common.eventhandler.Event.Result;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.entity.player.UseHoeEvent;

public class varita extends ItemHoe {

	public varita(ToolMaterial material) {
		super(material);
		this.setMaxStackSize(1);
		this.setMaxDamage(1);
	}
	/**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack itemstack, EntityPlayer player, World world, int x, int y, int z, int p_77648_7_, float a, float b, float c)
    {
        if (!player.canPlayerEdit(x, y, z, p_77648_7_, itemstack))
        {
            return false;
        }
        else
        {
            UseHoeEvent event = new UseHoeEvent(player, itemstack, world, x, y, z);
            if (MinecraftForge.EVENT_BUS.post(event))
            {
                return false;
            }

            if (event.getResult() == Result.ALLOW)
            {
                itemstack.damageItem(2, player);
                return true;
            }

            Block block = world.getBlock(x, y, z);

            if (p_77648_7_ != 0 && (block == RubyCraft.Mesa_de_Trabajo_de_Zafiro_Basica))
            {
                Block block1 = RubyCraft.MesadeTrabajodeZafiro;
             HechizoSonido(player);

                if (world.isRemote)
                {
                    return true;
                }
                else
                {
                    world.setBlock(x, y, z, block1);
                    itemstack.damageItem(2, player);
                    return true;
                }
            }
            else
            {
                return false;
            }
        }
    }

    @Override
    public void addInformation(ItemStack p_77624_1_, EntityPlayer p_77624_2_, List list, boolean p_77624_4_) {
    	
    	list.add(EnumChatFormatting.DARK_RED + "Solo Tiene 1 Uso");
    	list.add(EnumChatFormatting.GREEN + "Puede convertir una mesa de zafiro basica en una avanzada");
    	super.addInformation(p_77624_1_, p_77624_2_, list, p_77624_4_);
    }
    
    /**
     * Returns True is the item is renderer in full 3D when hold.
     */
    public boolean isFull3D()
    {
        return true;
    }

    /**
     * Returns the name of the material this tool is made from as it is declared in Item.ToolMaterial (meaning diamond
     * would return "EMERALD")
     */
    public String getToolMaterialName()
    {
        return this.theToolMaterial.toString();
    }

	public void HechizoSonido(EntityPlayer player){
		player.playSound(RubyCraft.modid + ":Hechizo", 5.0F, 1.0F);
	}
    
}
