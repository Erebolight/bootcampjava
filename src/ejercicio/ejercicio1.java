package ejercicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ejercicio1 {

	public static void main(String[] args) {
			Scanner ingresa = new Scanner(System.in);
			System.out.println("ingresa tu primer nombre completo ");
			
			List<String> listaNombres = new ArrayList<>();

			
			String cadena = ingresa.nextLine();
			// agregamos a una list el nombre
			listaNombres.add(cadena);
			
			// ahora separamos los nombres

			String[] Partes = cadena.split(" ");
			
			//ingresamos para ver si fue solo 1 nombre y un apeliido
			
			if(Partes.length == 3)
			{	
				//vemos y separamos el nombre 
				String nombre1 = Partes[0];
				String nombre2 = Partes[1];
				String apellido1 = Partes[2];
				//obtenemos el indice
				int indice = listaNombres.indexOf(cadena);
				System.out.println("{"+indice+" :["+ nombre1 + "," + nombre2+","+apellido1+ "}]" );
				
			} else if (Partes.length==2 )
			{
				//vemos y separamos el nombre 
				String nombre1 = Partes[0];
				
				String apellido1 = Partes[1];
				//obtenemos el indice
				int indice = listaNombres.indexOf(cadena);
				System.out.println("{"+indice+" :["+ nombre1 + ","+apellido1+ "}]" );
				
			}
			else
			{
				System.out.println("datos no validos " );
			}
				
			
	}

}
