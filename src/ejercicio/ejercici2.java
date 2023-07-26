package ejercicio;

import java.util.Scanner;

public class ejercici2 {

	public static void main(String[] args) {
			
		Scanner ingresa = new Scanner(System.in);
		System.out.println("Ingresa la operacion SUM para suma , RES para resta, DIV para divicion y Mul multiplicacion ");
		
		String operacion = ingresa.nextLine();
		System.out.println("ingresa el primer numero");
		int primerNumero = ingresa.nextInt();
		
		 System.out.println("ingresa el primer numero");
			int segundoNumero = ingresa.nextInt();

			
			
		switch (operacion.toUpperCase()) {
		case "SUM": 
			int resultado = operaciones.sumar(primerNumero,segundoNumero);
			 System.out.println(resultado);
		break;
		case "RES": 
			int resultado2 = operaciones.restar(primerNumero,segundoNumero);
			System.out.println(resultado2);
		break;
		
		case "DIV": 
			int resultado3 = operaciones.div(primerNumero,segundoNumero);
			System.out.println(resultado3);
		break;
		case "MUL": 
			int resultado4 = operaciones.mul(primerNumero,segundoNumero);
			System.out.println(resultado4);
		break;
		default:
		    System.out.println("Palabra desconocida.");
		}
		

		
	}

}
