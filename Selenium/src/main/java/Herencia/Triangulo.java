package Herencia;

public class Triangulo extends DosDimensiones {
	String estilo;
	
	double area() {
		return base*altura/2; //aqui se accede a la variable de la clase padre o superclase
	}
	
	void mostrarEstilo() {
		System.out.println("Triangulo es: "+estilo);
	}

}
