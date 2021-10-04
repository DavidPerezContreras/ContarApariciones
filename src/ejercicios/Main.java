//Programación de servicios y procesos
//Haz un programa que muestre en pantalla el contenido de un archivo de texto

//Lee el contenido de archivo.txt y lo almacena en x

package ejercicios;


import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		//Objeto Scanner
		Scanner teclado= new Scanner(System.in);
		String respuesta="no";
		
		
		
		//Archivo del que cuenta los carácteres
		FileReader input= new FileReader("src\\ejercicios\\archivo.txt");
		
		// Serie de carácteres que la clase CharCounter tendrá en cuenta
		String x="xD";
		
		
		//Variable que almacena si se deben tener en cuenta las mayúsculas y minúsculas
		boolean ignoreCase=true;
		
		
		System.out.println("Escribe \"si\" para distinguir entre mayúsculas y minúsculas.");
		System.out.println("Escribe \"no\" para no distinguir.");
		respuesta=teclado.nextLine();
		
		if(respuesta.equalsIgnoreCase("no")) {
			ignoreCase=false;
		}
		
		
		
		
		
		
		
		CharCounter counter = new CharCounter(x,ignoreCase);
		
		
		
		
		int c=input.read();
		
		while(c != -1) {
			//System.out.print((char)c);
			c=input.read();
			counter.check((char)c);
		
		}
		input.close();
		
		
		counter.mostrar();
	}
	
	

}
