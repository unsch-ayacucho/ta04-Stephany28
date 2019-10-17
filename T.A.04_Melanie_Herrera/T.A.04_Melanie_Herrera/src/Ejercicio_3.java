/****************************************************************
 * Ejercicio_3.java
 * @author Phany
 *
 *Escribe un programa que, dada una posición en un tablero de ajedrez, nos diga
a qué casillas podría saltar un alfil que se encuentra en esa posición. Como se
indica en la figura, el alfil se mueve siempre en diagonal. El tablero cuenta con
64 casillas. Las columnas se indican con las letras de la “a” a la “h” y las filas se
indican del 1 al 8.
 *************************************************************/

import java.util.*;

import javax.swing.JOptionPane;

public class Ejercicio_3 {

	public static void main(String[] args) {
		char ch=' ';
		String posicion;
		int aux= 0,aux1 = 0;
	
		List<String>tFila=new ArrayList<String>();
		Scanner stdIn = new Scanner(System.in);
		for(int i=1;i<9;i++) {
			String número=Integer.toString(i);
			tFila.add(número);
		}
		
		for (String iterar : tFila) {
			System.out.print(iterar);
		}
		
		List<String>tColumnas=new ArrayList<String>();
		tColumnas.add("a");
		tColumnas.add("b");
		tColumnas.add("c");
		tColumnas.add("d");
		tColumnas.add("e");
		tColumnas.add("f");
		tColumnas.add("g");
		for (String recorrer : tColumnas) {
			System.out.print(recorrer);
		}
		
		System.out.print("Ingrese posición: ");
		posicion=stdIn.nextLine();
		List<List<String>> matriz = new ArrayList<List<String>>();
		
		//***********************************************************************************************************
		
        
		
	}
}