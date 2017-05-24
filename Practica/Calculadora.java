package Practica;

public class Calculadora {
	public static void main(String[] args) {
		int a=0;
		int b=0;
		int resultado=0;
		String opcion;
		Robot objetoRobot = new Robot();
		
		do {
			System.out.println("Ingrese un número: ");
			a=(int)objetoRobot.Leer();
		} while (objetoRobot.PedirNuevamente);

		
		do {
			System.out.println("Ingrese otro número: ");
			b=(int)objetoRobot.Leer();
			
		} while (objetoRobot.PedirNuevamente);
		
		boolean  volverAPedir = true;
		
		do {
			System.out.println("Ingrese la operación a realizar ('+', '-','*' o '/'): ");
			opcion=objetoRobot.LeerTexto();
			
			if (opcion.equalsIgnoreCase("*"))
			{
				resultado=a*b;
				System.out.println("El resulado de "+a+" * "+b+" es: "+resultado);
				volverAPedir = false;
				
			} else if (opcion.equalsIgnoreCase("/")) {
				resultado=a/b;
				System.out.println("El resulado de "+a+" / "+b+" es: "+resultado);
				volverAPedir = false;
				
			} else if (opcion.equalsIgnoreCase("+")) {
				resultado=a+b;
				System.out.println("El resulado de "+a+" + "+b+" es: "+resultado);
				volverAPedir = false;
				
			} else if (opcion.equalsIgnoreCase("-")) {
				resultado=a-b;
				System.out.println("El resultado de "+a+" -"+b+" es: "+resultado);
				volverAPedir = false;
				
			} 
			
		} while (volverAPedir);
		
	}
}
