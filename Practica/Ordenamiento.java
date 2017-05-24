package Practica;

import java.util.Arrays;

public class Ordenamiento {
	public static void main(String[] args) {
		int[] numeros =new int[5];
		Robot objetoRobot = new Robot();
		
		do {
			for (int i = 0; i <5; i++) {
				System.out.println("Ingrese un número: ");
				numeros[i]=(int)objetoRobot.Leer();
			}
			
		} while (objetoRobot.PedirNuevamente);
		
			
		System.out.println("\n Los números ingresados son");
		for (int i = 0; i <5; i++) {
			System.out.print("-"+numeros[i]+"-");
		}
		Arrays.sort(numeros);
		
		System.out.println(" ");
		System.out.println("\n Los números ordenados");
		for (int i = 0; i <5; i++) {
			System.out.print("-"+numeros[i]+"-");
		}
		
	}

}
