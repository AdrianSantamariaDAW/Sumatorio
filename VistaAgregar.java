

import java.util.Scanner;

/**
 * Gestiona numeros decimales que pasa el usuario
 * @author <a href="adriansanrio.1@educajcyl.com">Adrián Santamaría</a>
 *
 */
public class VistaAgregar extends ControlSumatorio{

	/**
	 * Variable entrada de tipo String e inicializada
	 */
	String entrada = "";
	
	/**
	 * Variable sumando de tipo double e inicializada
	 */
	double sumando = 0;
	
	/**
	 * Variable in de tipo Scanner
	 */
	Scanner in;
	
	/**
	 * Variable salir de tipo boolean
	 */
	boolean salir=false;
	
	/**
	 * Constructor que recibe un Scanner heredado de ControlSumatorio y lo asigna a un Scanner local
	 * @param in Scanner heredado
	 */
	public VistaAgregar(Scanner in) {
	super(in);
	this.in=in;
	}
	

	/**
	 * Pregunta al usuario por un numero double, que luego añade a la lista del parametro
	 * @param conjunto Lista donde se añade el double
	 * @throws SumatorioNumberException Excepción si lo que pasa el usuario no es correcto
	 */
	public void agregarSumando(ListaNúmeros conjunto) throws SumatorioNumberException {
		while(!salir) {
			System.out.println("Introduce un sumando");
			entrada=in.nextLine();
			try {
				sumando=ListaNúmeros.transformarEntradaTexto(entrada);
			}catch(SumatorioNumberException ValorIncorrecto){
				System.out.println("El valor introducido no es valido");
				System.out.println("(Si es un numero decimal, la parte decimal debe");
				System.out.println("estar separada por un punto [.] )");
				continue;
			}
			sumando=ListaNúmeros.transformarEntradaTexto(entrada);
			conjunto.add(sumando);
			System.out.println("Se ha agregado un nuevo valor");
			salir=true;
		}

	}
	
	

	
}
