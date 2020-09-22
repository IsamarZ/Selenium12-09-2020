package ClasesyObjetos;

public class DemoVehiculo {

	public static void main(String[] args) {
		Vehiculo minivan = new Vehiculo();//instanciar la clase con un objeto
		int rango;
		
		//Asignando valores a los campos minivan
		minivan.pasajeros = 9;
		minivan.capacidad = 15;
		minivan.kmh = 20;
		
		//calcular el rango
		rango = minivan.capacidad * minivan.kmh;
		
		System.out.println("la minivan puede llevar "+minivan.pasajeros+ " pasajeros con un rango de: "+ rango +" km/h");
	}

}
