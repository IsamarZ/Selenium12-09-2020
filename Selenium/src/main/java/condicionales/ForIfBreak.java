package condicionales;

public class ForIfBreak {

	public static void main(String[] args) {
		for (int i =0; i < 10; i++) {
			if(i == 4) {
				break;//rompe completamente el ciclo
				//continue;//continua con el ciclo
			}
			System.out.println("i: "+ i);
		}
		System.out.println("Cliclo del for Completo");
	}

}
