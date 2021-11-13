
public class A59FuncoesString {

	public static void main(String[] args) {
		String s = "   Isto é uma String...   ";
		
		String minusculas = s.toLowerCase();
		System.out.println("Em minúsculas: " + minusculas);
		
		String maiusculas = s.toUpperCase();
		System.out.println("Em maiúsculas: " + maiusculas);
		
		String trimar = s.trim();
		System.out.println("Trimado: " + trimar);
		
		//recortar
		String rec1 = s.substring(5);
		System.out.println("Recortado 1: " + rec1);
		
		//recortar
		String rec2 = s.substring(5, 12);
		System.out.println("Recortado 2: " + rec2);
		
		//substituir
		String subst1 = s.replace(" ", "[.]");
		System.out.println("Susbtituição 1: " + subst1);
		
		//procurar
		int x = s.indexOf("S");
		System.out.println("Índice de S: " + x);
		
		int y = s.lastIndexOf("o");
		System.out.println("Índice de is: " + y);
		
		// split
		String[] s2 = s.split(" ");
		System.out.println(s2[6]);

	}

}
