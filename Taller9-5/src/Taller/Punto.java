package Taller;

public class Punto {
	private double x;
	private double y;
	
	public Punto(double px,double py)  {//se puede hacer overrad
		this.x=px;
		this.y=py;
	}
	
	
	
	public double modulo() {
		return Math.sqrt(Math.pow(((Punto)this).x, 2) + Math.pow(((Punto)this).y, 2));
	}
	
	public double distancia(Object obj) {
		return Math.sqrt(Math.pow(this.x -((Punto)obj).x, 2) + Math.pow(this.y - ((Punto)obj).y, 2));
	}
	
	@Override
	public String toString () {
		return "(" + this.x + "," + this.y + ")";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(x);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(y);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Punto other = (Punto) obj;
		if (Double.doubleToLongBits(x) != Double.doubleToLongBits(other.x))
			return false;
		if (Double.doubleToLongBits(y) != Double.doubleToLongBits(other.y))
			return false;
		return true;
	}
	

	public Punto clone (Object obj) {
		return new Punto(((Punto)obj).x,((Punto)obj).y);
	}
	
	
	public void desplazar(Object obj) {
		this.x+=((Punto)obj).x;
		this.y+=((Punto)obj).y;
	}
	
	public double getterX() {
		return this.x;
	}
	
	public double getterY() {
		return this.y;
	}
	
	public void setterY(double y) {
		this.y= y;
	}
	
	public void setterX(double x) {
		this.x= x;
	}
}