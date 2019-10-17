/****************************************************************
 * Ejercicio_2.java
 * @author Phany
 *
 *Escribe un programa que pida 20 números enteros. Estos números se deben
introducir en un array de 4 filas por 5 columnas. El programa mostrará las
sumas parciales de filas y columnas igual que si de una hoja de cálculo se
tratara. La suma total debe aparecer en la esquina inferior derecha.
 *************************************************************/


import java.util.Scanner;
public class Ejercicio_2 {

	public static void main(String[] args) {
		int sumaV=0,sumaH=0;//Declaramos la variable suma para sumar las filas
		int sT_Vertical=0,sT_Horizontal=0;
		int [] [] array = new int[4][5]; //Creamos el array de 4x5
		Scanner stdIn = new Scanner(System.in);
		//Pedimos valores al usuario
		for(int i=0;i<4;i++) {
			for(int j=0;j<5;j++) {
				System.out.printf("Ingrese valor para la posición %d-%d: ",i,j);
				array[i][j]=stdIn.nextInt();
			}
		}
		
			
				
		//Imprimiendo el array
		System.out.println("La matriz es: ");
		
		
		for(int i=0; i<4;i++) {
			
			for(int j=0;j<5;j++) {
				sumaV+=array[i][j];//Se sumarán las filas
				System.out.print(array[i][j]+" ");
				
				
			}
			sT_Vertical+=sumaV;	
			
			System.out.printf("%d \n",sumaV);/*Luego del simbolo ==, se colocará el resultado*/
            sumaV=0;//La suma vuelve a 0 para no almacenar los valores y realizar la siguiente suma 
            
            
		}
		
		
		int aux=0;

		for(int i=0;i<5;i++) {

			for(int j=0;j<4;j++) {
				sumaH+=array[j][aux];
				
				
			}
			sT_Horizontal+=sumaH;
			aux++;
			System.out.printf("%d ",sumaH);
			sumaH=0;
		}	
		
		System.out.print(sT_Vertical+sT_Horizontal);
		
		
	}

}