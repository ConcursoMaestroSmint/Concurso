package aleSanchez;

/**
 * 
 * Esta clase almacena los colores disponibles	 
 * @author Alejandro Sánchez
 * @version 1.0
 * @since 1.0
 *
 */

public final class Colores {


	public static final String RESET = "\u001B[0m";
	
	public static final String FONDO_NEGRO = "\u001B[40m";
	public static final String FONDO_ROJO = "\u001B[41m";
	public static final String FONDO_VERDE = "\u001B[42m";
	public static final String FONDO_AMARILLO = "\u001B[43m";
	public static final String FONDO_AZUL = "\u001B[44m";
	public static final String FONDO_MORADO = "\u001B[45m";
	public static final String FONDO_CELESTE = "\u001B[46m";
	public static final String GREEN_BACKGROUND_BRIGHT = "\033[0;102m";// GREEN
	public static final String BLUE_BACKGROUND_BRIGHT = "\033[0;104m";// BLUE
	public static final String CYAN_BACKGROUND_BRIGHT = "\033[0;106m";  // CYAN
	
	public static final String ROJO_ROMBO = "\u001B[31m";
	public static final String CELESTE_ROMBO = "\u001B[36m";

	private static String colores[] = {FONDO_NEGRO, FONDO_ROJO, FONDO_VERDE, FONDO_AMARILLO, FONDO_AZUL, FONDO_MORADO, FONDO_CELESTE, GREEN_BACKGROUND_BRIGHT, BLUE_BACKGROUND_BRIGHT, CYAN_BACKGROUND_BRIGHT};

	/**
	 * 
	 * @param eleccion Color que ha elegido el usuario
	 * @return El color que ha elegido el usuario, dependiendo de su elección
	 */
	public static String elegirColor(String eleccion) {
		String resultado = null;
		
		switch (eleccion) {
		
			case "negro":
				resultado = FONDO_NEGRO;
			break;
			
			case "rojo":
				resultado = FONDO_ROJO;
			break;
			
			case "verde":
				resultado = FONDO_VERDE;
			break;
			
			case "amarillo":
				resultado = FONDO_AMARILLO;
			break;
			
			case "azul":
				resultado = FONDO_AZUL;
			break;
			
			case "morado":
				resultado = FONDO_MORADO;
			break;
			
			case "celeste":
				resultado = FONDO_CELESTE;
			break;
			
			case "verde claro":
				resultado = GREEN_BACKGROUND_BRIGHT;
			break;
			
			case "celeste oscuro":
				resultado = BLUE_BACKGROUND_BRIGHT;
			break;
			
			case "turquesa":
				resultado = CYAN_BACKGROUND_BRIGHT;
			break;
			
		}
			return resultado;
		}
	
	/**
	 * Enseña los colores disponibles, dependiendo del número de colores que se vayan a usar en la partida
	 * @param tamanio Cantidad de colores que serán usados para la partida
	 */
	public static void ensenharColores(int tamanio) {
		for(int i=0; i<tamanio/2;i++) 
			System.out.print(String.format("%s  ", colores[i])+RESET+ "  ");
		System.out.println("\n");
		for(int i=tamanio/2;i<tamanio;i++)
		System.out.print(String.format("%s  ", colores[i])+RESET+ "  ");
		
	}

}
