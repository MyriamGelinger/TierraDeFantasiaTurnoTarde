package Taller;

public class Vainilla extends Raza {
	
	private int ataquesRecibidos;
	private String Utiliza;

	public Vainilla(int ataquesrecibidos) {
		super(30,100,0,1,new Punto(0, 0));
		this.ataquesRecibidos = ataquesrecibidos;
		NombreRaza="Biselian";
		Utiliza= "Vainillas";
}
	@Override
	protected String Tipo() {
	
		return "Vainillas";
	}
	@Override
	public void ataca(Raza otro) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void recibeAtaque(double danio) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void descansa() {
		// TODO Auto-generated method stub
		
	}
}
