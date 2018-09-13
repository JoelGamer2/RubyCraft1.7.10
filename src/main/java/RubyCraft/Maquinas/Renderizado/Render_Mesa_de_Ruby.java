package RubyCraft.Maquinas.Renderizado;

import java.util.Calendar;

import org.lwjgl.opengl.GL11;

import Eventos.Ver_fecha_calendario_usuario;
import Eventos.Verificar_Fecha;
import RubyCraft.Control_de_Version;
import RubyCraft.RubyCraft;
import RubyCraft.Maquinas.MesadeTrabajodeRuby;
import RubyCraft.Navidad.Cambiador_de_Texturas;
import RubyCraft.Registrar.Crafteos;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class Render_Mesa_de_Ruby extends  TileEntitySpecialRenderer {

	private Mesa_De_Ruby_Render_Model model;
	
	private ResourceLocation textura = new ResourceLocation(RubyCraft.modid + ":textures/blocks/TileEntitys/Mesas/Mesa_De_Ruby.png");
	private ResourceLocation texturaNavidad = new ResourceLocation(RubyCraft.modid + ":textures/blocks/TileEntitys/Mesas/Mesa_De_Ruby_Navidad.png");
	
	 public Render_Mesa_de_Ruby() {
		 model = new Mesa_De_Ruby_Render_Model();
		 
		 
		 Ver_fecha_calendario_usuario.iniciar();
			    
	}
	
	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float scale) {
			
		GL11.glPushMatrix();
		GL11.glTranslated(x + 0.5, y + 1.5, z + 0.5);
		GL11.glRotated(180, 0, 0, 1);
		if(!RubyCraft.Navidad){
		this.bindTexture(textura);
		}else if(RubyCraft.Navidad){
			this.bindTexture(texturaNavidad);
		}
		this.model.render((Entity)null, 0, -0.1f, 0, 0, 0, 0.0625f);
		GL11.glPopMatrix();
		
	}
	
}
