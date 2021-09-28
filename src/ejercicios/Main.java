//Programación de servicios y procesos
//Haz un programa que muestre en pantalla el contenido de un archivo de texto

package ejercicios;


import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		FileReader input= new FileReader("src\\ejercicios\\archivo.txt");
		String x="XD";
		
		CharCounter counter = new CharCounter(x);
		
		
		
		
		int c=input.read();
		
		while(c != -1) {
			System.out.print((char)c);
			c=input.read();
			counter.check((char)c);
		
		}
		input.close();
		
		
		counter.mostrar();
	}
	
	

}
