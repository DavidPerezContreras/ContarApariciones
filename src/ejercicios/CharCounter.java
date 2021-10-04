package ejercicios;

public class CharCounter {
private int x;
private Character[] letras;
boolean ignoreCase;
	//Almacena el string que recibe en un array de carácteres FUNCIONA!!
	CharCounter(String s1,boolean ignoreCase){
		this.ignoreCase=ignoreCase;
		x=0;
		letras = new Character[s1.length()];
		
		
		for(int i=0; i<s1.length();i++) {
			
			letras[i]= s1.charAt(i);
			//System.out.println(letras[i]);
		}
	}
	
	
	
	
	void check(Character ch) {
		
	
		
		if (ignoreCase){
			for(int i=0; i<letras.length;i++) {
				if(letras[i]==ch) {
					x+=1;
				}
			}
		}else {
			for(int i=0; i<letras.length;i++) {
				if((letras[i].toString().equalsIgnoreCase(ch.toString()))) {
					x+=1;
				}
			}

		}
		
		
		
		
		
		
	}
	
	void mostrar() {
		System.out.println("Apariciones = "+ x);
	}
	
	
}
