

import java.util.ArrayList;


/**
 * Gestiona la impresion y la suma de la lista imprimiendolo por pantalla
 * @author <a href="adriansanrio.1@educajcyl.com">Adrián Santamaría</a>
 *
 */
public class VistaListado {
	/**
	 * Variable listaImprimir de tipo ArrayList<String>
	 */
	ArrayList<String> listaImprimir;
	/**
	 * Variable lista de tipo ListaNúmeros
	 */
	ListaNúmeros lista;
	
	/**
	 * Constructor que inicializa las variables
	 */
	public VistaListado() {
		listaImprimir = new ArrayList<String>();
		lista = new ListaNúmeros();
	}

	/**
	 * Imprime la lista que recibe por parametro por pantalla
	 * @param conjunto Lista que recibe para imprimir
	 */
	public void imprimirLista(ListaNúmeros conjunto) {
		int j=1;
		listaImprimir=conjunto.toListaString();
		System.out.println("\nLista de sumandos agregados");
		for (int i=0; i<listaImprimir.size();i++) {
			System.out.printf("\n%d  -> ", i+1);
			System.out.println(listaImprimir.get(i));
	}
	}
	
	/**
	 * Suma la lista que recibe por parametro y la imprime por pantalla
	 * @param conjunto Lista que recibe para imprimir
	 */
	public void sumarLista(ListaNúmeros conjunto) {
		System.out.println("\nSuma de los valores agregados");
		System.out.println(conjunto.getSuma());
	}
	
}
