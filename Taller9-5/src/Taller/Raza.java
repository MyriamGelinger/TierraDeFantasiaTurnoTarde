package Taller;

public  abstract class Raza{
public String NombreRaza;
public int envenenado=0;
	private Punto punto;
	private double  salud;
	private double danio;
	private double rangoMin;
	private double rangoMax;
	protected abstract String Tipo();
	
	public String utiliza() {
		String frase = "Es de la Raza: " ;
		frase+= getNombreRaza();
		frase += "  utiliza :  ";
		frase += Tipo();
		
		return frase;
	}
	public void envenena(){
		this.envenenado=1;
	}
	
	public String getNombreRaza(){
		return NombreRaza;
	}

	

	public Raza(int salud, double danio, double rangoMin, double rangoMax,Punto punto) {
		this.punto = punto;
		this.salud = salud;
		this.danio = danio;
		this.rangoMin = rangoMin;
		this.rangoMax = rangoMax;
	}
	


	

	public abstract void ataca(Raza otro);
	public abstract void recibeAtaque(double danio);
	public abstract void descansa();
	
	
	
	
	public boolean estaEnRango(Raza otro){
		double dist = this.punto.distancia(otro.getPosicion()) ;
		
		return dist >= rangoMin && dist <= rangoMax ;
 		
	}
	
	public Punto getPosicion(){
		return this.punto;
	}

	public double getSalud() {
		return salud;
	}

	public void setSalud(double salud) {
		this.salud = salud;
	}

	public double getDanio() {
		return danio;
	}

	public void setDanio(double danio) {
		this.danio = this.danio + danio;
	}



	public void recibirAtaque(Raza otro) {
		// TODO Auto-generated method stub
		
	}


	
	
}