package RubyCraft;

public class Control_de_Version {
	
 public static boolean Version_de_desarrolador = true;
 public static boolean Activar_Version_trol_facil = false;
 public static boolean Navidad_Activar = false;
 public static boolean Verano_Activar = false;

	public static void Iniciar_todo() {
		
		if(Version_de_desarrolador) {
			
			if(Activar_Version_trol_facil) {
				RubyCraft.VersionTrol = true;
			}
			
			
		}
		
	}
	
}
