package day08;
//Aqaman is a Human
public class Aquaman extends Human{
	double speed;
	
	public Aquaman() {
		this("수중인간",160,789.12);
	}
	public Aquaman(String n, int h, double s) {
		this.name=n;
		this.height=h;
		this.speed=s;
	}
	public String getInfo() {
		return "이름: "+name+"\n키: "+height+"\n속도: "+speed+"km/h";
		
	}
}
