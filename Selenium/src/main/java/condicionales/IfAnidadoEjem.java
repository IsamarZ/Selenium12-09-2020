package condicionales;

public class IfAnidadoEjem {

	public static void main(String[] args) {
		int temperatura = 24;
		if(temperatura > 15) {
			if(temperatura > 25) {
				System.out.println("a la playa!");
			}else {
				System.out.println("a la montaña");
			}
		}else {
			System.out.println("a descansar");
		}

	}

}
