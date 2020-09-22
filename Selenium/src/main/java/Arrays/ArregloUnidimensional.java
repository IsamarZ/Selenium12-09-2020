package Arrays;

public class ArregloUnidimensional {

	public static void main(String[] args) {
		//declaraciones varildas
		int intArray[];
		int[] intArray2;
		
		//tipos de datos
		byte arravbyte[];
		short arrayshort[];
		char charArray[];
		
		//declarar un array de Strings
		String[] arr;
		
		//Asignar memoria para 5 Strings
		arr = new String[5];//inicializa, preparar memoria para 5 posiciones
		
		//Iniciar el primer elemento
		arr[0] = "cero";
		//sucesivos
		arr[1] = "uno";
		arr[2] = "dos";
		arr[3] = "tres";
		arr[4] = "cuatro";
		
		//Accediendo a los elementos del array
		for(int i=0; i< arr.length; i++) {
			System.out.println("Elemento en el indice: "+ i + ": "+ arr[i]);
		}
		
		//Forma simple de declarar un array
		String[] sArray = new String[] {"cero","uno"};
		for(int i=0; i< sArray.length; i++) {
			System.out.println("Elemento en el indice: "+ i + ": "+ sArray[i]);
		}

	}

}
