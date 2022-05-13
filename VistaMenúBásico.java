

import java.util.Scanner;

/**
 * Gestiona la vista del menu principal de la aplicación
 * @author <a href="adriansanrio.1@educajcyl.com">Adrián Santamaría</a>
 *
 */
public class VistaMenúBásico extends Vista{
	
	/**
	 * Variable sc de tipo Scanner e inicializada
	 */
	Scanner sc=getEntrada();
	
	/**
	 * Variable opciónElegida tipo int
	 */
	private int opciónElegida;
	
	/**
	 * Variable OPCIONES_MENÚ_PRINCIPAL de tipo Array de Strings
	 */
	private String[] OPCIONES_MENÚ_PRINCIPAL;

	
	/**
	 * Constructor que recibe una String, Scanner y String[] heredados de Vista y asigna el String[]
	 * @param título String que recibe por parametro
	 * @param scEntrada Scanner que recibe por parametro
	 * @param OPCIONES_MENÚ_PRINCIPAL String[] que recibe por parametro 
	 */
	public VistaMenúBásico(String título, Scanner scEntrada, String[] OPCIONES_MENÚ_PRINCIPAL) {
		super(título,scEntrada);
		this.OPCIONES_MENÚ_PRINCIPAL=OPCIONES_MENÚ_PRINCIPAL;
	}
	
	/**
	 * Imprime el Array de Strings que contiene las opciones del menú
	 */
	public void mostrarOpciones() {
		int j=1;
		System.out.println("\nIntroduce una de las siguientes opciones.");
		for (int i=0;i<OPCIONES_MENÚ_PRINCIPAL.length;i++) {
			System.out.print(j++ +" ");
			System.out.println(OPCIONES_MENÚ_PRINCIPAL[i]);
		}	
	}
	
	
	/**
	 * Pide al usuario que eliga una opción del menú, comprueba que es correcta y en caso de serlo la devuelve
	 * @return El numero de opción elegido por el usuario
	 */
	public int pedirOpción() {
		String líneaTexto;
		int número;
		
		boolean numEsCorrecto = false;

		while(!numEsCorrecto) {
			try {
				líneaTexto = sc.nextLine();
				número = Integer.parseInt(líneaTexto);
				if(número<=0 || número>OPCIONES_MENÚ_PRINCIPAL.length) {
					System.out.println("No ha elegido una opcion valida.");
					mostrarOpciones();
				}else {
					numEsCorrecto = true;
					opciónElegida = número;
				}
			}
			catch(NumberFormatException ex){
				System.out.printf("\tNo es una de las opciones validas: <%s>%n", ex.getMessage());
			}
		}
		
		return opciónElegida;
		
	}
}
