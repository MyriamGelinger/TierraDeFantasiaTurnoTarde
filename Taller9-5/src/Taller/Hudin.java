package Taller;

public class Hudin extends Raza{
	/*Un Hudin tiene una salud inicial de 93. Utiliza un hueso, y su rango de ataque es de menos de 4 metros. 
	Ocasiona un daño básico de 82 puntos. Cuando ataca, envenena a su enemigo y éste pierde 4 adicionales de salud por turno. 
	Al recibir un ataque recibe 2 veces el daño, ya que no lleva armadura. 
	Cuando descansa, reduce el daño del siguiente ataque recibido en 2/3 de su valor neto.*/
	private int ataquesRecibidos;
	private String Utiliza;
	private int medita=0, descansa=0;
	public Hudin(int ataquesrecibidos) {
				
		super(93,82,0,4,new Punto(0, 0));
		this.ataquesRecibidos = ataquesrecibidos;
		NombreRaza="Hudin";
		Utiliza= "Un Hueso";
	}

	protected  String Tipo() {
		return Utiliza;
	}
	
	@Override
	public void ataca(Raza otro) {
		otro.envenena();
	super.setSalud(super.getSalud()*3);
		
	}

	@Override
	public void recibeAtaque(double danio) {

		super.setDanio(2*danio);
		
	}

	@Override
	public void descansa() {
			descansa=1;
			super.setDanio(super.getDanio()-super.getDanio()*2/3);
	}

	
}
