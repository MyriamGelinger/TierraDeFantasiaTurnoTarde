package Taller;

public class Biselian extends Raza{
	private int ataquesRecibidos;
	
	public Biselian(int ataquesrecibidos) {
		super(57,114,0,2,new Punto(0, 0));
		this.ataquesRecibidos = ataquesrecibidos;
	}

	@Override
	public void atacar(Raza otro) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void recibirAtaque(int daño) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void descansar() {
		if(super.getSalud()>0){
			super.setDaño(114);
		}
		
	}

	@Override
	public void envenenar() {
		// TODO Auto-generated method stub
		
	}
}