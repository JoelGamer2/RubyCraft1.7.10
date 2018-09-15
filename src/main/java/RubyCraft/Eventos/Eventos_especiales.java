package RubyCraft.Eventos;

import HerraCraft.Generator_Boss;
import RubyCraft.Control_de_Version;
import RubyCraft.RubyCraft;
import RubyCraft.Actualizaciones.Buscar_Actualizaciones;
import RubyCraft.Entidades.Mobs.BossParca;
import RubyCraft.Registrar.Logros;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.ClientTickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.WorldTickEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.Minecraft;

public class Eventos_especiales {
		
	private boolean Iniciadosesion = false;
	public static boolean musica = false;

	
	@SubscribeEvent
	 public void onPlayerTick(TickEvent.PlayerTickEvent event){
		 
		if(RubyCraft.Navidad == true && !Iniciadosesion && Minecraft.getMinecraft().currentScreen == null){
       	 
       event.player.addStat(Logros.Es_Navidad, 1);
       Iniciadosesion = true;
        }

		if(!RubyCraft.cliente && BossParca.Vivo && !musica) {
			
			 event.player.playSound(RubyCraft.modid + ":records.bossparca", Float.MAX_VALUE, 1.0F);

			musica = true;
		}
		
		
	}
	 
	
	@SubscribeEvent
	public void onClientTick(WorldTickEvent event){
           if(RubyCraft.cliente == true) {
		if(BossParca.Vivo && !musica && Minecraft.getMinecraft().currentScreen == null && !(Generator_Boss.NombreJugador == Minecraft.getMinecraft().thePlayer.getDisplayName())){
			

			 Minecraft.getMinecraft().thePlayer.playSound(RubyCraft.modid + ":records.bossparca", Float.MAX_VALUE, 1.0F);
		

     musica = true;
	    }
      }
	}
	
	
	
}