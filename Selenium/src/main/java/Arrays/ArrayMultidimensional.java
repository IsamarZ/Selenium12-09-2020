package Arrays;

public class ArrayMultidimensional {

	public static void main(String[] args) {
		// declarar e inicializar un array 2D
		int arr[][]= {{2,7,9},{3,6,1},{7,4,2}};
		
		//la primera posicion es el Array y la segunda es la posicion dentrol del Array
		System.out.println(arr[2][1]);
		System.out.println(arr[0][0]);
		
		//para acceder a un array multidimensional
		for(int i=0; i<3;i++) {
			for (int j=0; j < 3;j++) {
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
