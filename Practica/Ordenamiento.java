package Practica;

import java.util.Arrays;

public class Ordenamiento {
	public static void main(String[] args) {
		int[] numeros =new int[5];
		Robot objetoRobot = new Robot();
		
		do {
			for (int i = 0; i <5; i++) {
				System.out.println("Ingrese un n�mero: ");
				numeros[i]=(int)objetoRobot.Leer();
			}
			
		} while (objetoRobot.PedirNuevamente);
		
			
		System.out.println("\n Los n�meros ingresados son");
		for (int i = 0; i <5; i++) {
			System.out.print("-"+numeros[i]+"-");
		}
		Arrays.sort(numeros);
		
		System.out.println(" ");
		System.out.println("\n Los n�meros ordenados");
		for (int i = 0; i <5; i++) {
			System.out.print("-"+numeros[i]+"-");
		}
		
	}

}
