package Taller;

public  abstract class Raza{
	private Punto punto;
	private int  salud;
	private double danio;
	private double rangoMin;
	private double rangoMax;
	
	public Raza(int salud, double da�o, double rangoMin, double rangoMax,Punto punto) {
		this.punto = punto;
		this.salud = salud;
		this.danio = danio;
		this.rangoMin = rangoMin;
		this.rangoMax = rangoMax;
	}
	


	

	public abstract void atacar(Raza otro);
	public abstract void recibirAtaque(int da�o);
	public abstract void descansar();
	public abstract void envenenar ();
	
	public boolean estaEnRango(Raza otro){
		double dist = this.punto.distancia(otro.getPosicion()) ;
		
		return dist >= rangoMin && dist <= rangoMax ;
 		
	}
	
	public Punto getPosicion(){
		return this.punto;
	}

	public int getSalud() {
		return salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public double getDa�o() {
		return danio;
	}

	public void setDa�o(int da�o) {
		this.danio = da�o;
	}



	public void recibirAtaque(Raza otro) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}