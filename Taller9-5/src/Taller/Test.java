package Taller;

public class Test {

	public static void main(String[] args) {
		Biselian B= new Biselian (1);
		System.out.println( B.utiliza());
		
		Vainilla V=new Vainilla(1);
		System.out.println(V.utiliza());
				
		Hudin H=new Hudin(1);
		System.out.println(H.utiliza());
		
		H.recibeAtaque(20);
		H.ataca(V);
		
		B.recibeAtaque(40);
		B.ataca(V);
	}

}
