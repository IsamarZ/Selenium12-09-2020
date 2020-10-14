package constructor;

public class ConstructorDemo {

	public static void main(String[] args) {
		miClase t1 = new miClase(5);
		miClase t2 = new miClase();//vuelve a llamar a la misma clase/constructor como ejemplo
		System.out.println(t1.x +" "+t2.x);
		
	}

}
