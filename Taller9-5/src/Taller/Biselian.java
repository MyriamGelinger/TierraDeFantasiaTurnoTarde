package Taller;

public class Biselian extends Raza{
	/*Una Biselian tiene una salud inicial de 57. Utiliza sus dientes, y su rango de ataque es de menos de 2 metros. 
	Ocasiona un daño básico de 114 puntos. Cuando ataca, se cura un 3 por ciento de su salud. 
	Al recibir un ataque lo hace normalmente. Cuando descansa, medita, y como considera la violencia como algo malo, 
	se rehúsa a atacar hasta que lo ataquen. Gracias a ésto, aumenta su salud y su salud máxima en 33.*/
	private int ataquesRecibidos;
	private String Utiliza;
	private int medita=0;
	public Biselian(int ataquesrecibidos) {
				
		super(57,114,0,2,new Punto(0, 0));
		this.ataquesRecibidos = ataquesrecibidos;
		NombreRaza="Biselian";
		Utiliza= "Sus Dientes";
	}

	protected  String Tipo() {
		return Utiliza;
	}
	@Override
	public void ataca(Raza otro) {
		if(medita==0)
	super.setSalud(super.getSalud()*3);
		
	}

	@Override
	public void recibeAtaque(double danio) {
		medita=0;
		super.setDanio(danio);
		
	}

	@Override
	public void descansa() {
			medita=1;
			super.setSalud(super.getSalud()+33);
			super.setDanio(114);
	}



}