/****************************************************************
 * Ejercicio_1.java
 * @author Phany
 *
 *Realiza un programa que rellene un array de 6 filas por 10 columnas con
números enteros positivos comprendidos entre 0 y 1000 (ambos incluidos). A
continuación, el programa deberá dar la posición tanto del máximo como del
mínimo.
 *************************************************************/

public class Ejercicio_1 {

	public static void main(String[] args) {
		int _numMenor=0,_numMayor=0,posMenorI=0,posMenorJ=0,posMayorI=0,posMayorJ=0;//Variables 
		//necesarias e inicializadas con 0
		
		
		int [] [] array=new int[6][10];//Se crea el array de 6x10
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				array[i][j]=(int)(Math.random()*1000)+1;//Se le asignan valores aleatorios
				_numMenor=_numMayor=array[0][0];//Se le asigna el primer valor del array 
				//a las variables menor y mayor
			}
			
		}
		
		System.out.println("La matriz es: ");//Se imprime la matriz
		for(int i=0;i<6;i++) {
			for(int j=0;j<10;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println(" ");
		}
		
		
		for(int i=0;i<6;i++) {//Se vuelve a recorrer la matriz
			for(int j=0;j<9;j++) {
				if(_numMenor>array[i][j]) {/*Si existe un numero mucho menor que el actual
				 							que en un inicio era el primer valor del array. 
				 							Entonces el valor cambia*/
					_numMenor=array[i][j];
					posMenorI=i;//Se le asigna el indice de las filas
					posMenorJ=j;//Se le asigna el indice de las columnas
				}
			}
			
		}
		//Se imprimen los datos obtenidos
		System.out.println("El número menor es: "+_numMenor);
		System.out.println("Posición del número mayor: "+posMenorI+"-"+posMenorJ);
		
		for(int i=0;i<6;i++) {
			for(int j=0;j<9;j++) {
				if(_numMayor<array[i][j]) {//De igual manera se cambia el numero si existe 
					//uno mucho mas mayor que ese
					_numMayor=array[i][j];
					posMayorI=i;
					posMayorJ=j;
				}
			}
			
		}
		//Se imprimen los datos obtenidos
		System.out.println("El número mayor es: "+_numMayor);
		System.out.println("Posición del número mayor: "+posMayorI+"-"+posMayorJ);
		
	}

}
