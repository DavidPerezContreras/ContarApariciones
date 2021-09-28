package ejercicios;

public class CharCounter {
int x;
Character[] letras;

	//Almacena el string que recibe en un array de carácteres FUNCIONA!!
	CharCounter(String s1){
		x=0;
		letras = new Character[s1.length()];
		
		
		for(int i=0; i<s1.length();i++) {
			
			letras[i]= s1.charAt(i);
			System.out.println(letras[i]);
		}
	}
	
	
	
	
	void check(Character ch) {
		for(int i=0; i<letras.length;i++) {
			if(letras[i]==ch) {
				x+=1;
			}
		}
	}
	
	void mostrar() {
		System.out.println("Apariciones = "+ x);
	}
	
	
}
