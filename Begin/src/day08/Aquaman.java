package day08;
//Aqaman is a Human
public class Aquaman extends Human{
	double speed;
	
	public Aquaman() {
		this("�����ΰ�",160,789.12);
	}
	public Aquaman(String n, int h, double s) {
		this.name=n;
		this.height=h;
		this.speed=s;
	}
	public String getInfo() {
		return "�̸�: "+name+"\nŰ: "+height+"\n�ӵ�: "+speed+"km/h";
		
	}
}
