package day09;

public class ShapeTest {

	public static void main(String[] args) {

		System.out.println("각 도형의 면적을 구해 봅시다.");
		System.out.println("가로: "+7+", 세로"+8+"---------");
		//사각형
		Rectangle rt=new Rectangle();
		rt.area(7, 8);
		
		//삼각형
		Triangle ta=new Triangle();
		ta.area(7, 8);
		
		
		System.out.println("반지름: 8인 원의 면적 ----------");
		//원 :
		//Circle c=new Circle();
		//추상 클래스는 타입선언은 가능 하지만 new해서 객체 생성은 불가능 하다.
	Circle c =new SubCircle();
	//부모타입 변수선언 =new자식객체를 생성
	c.area(8, 0);//오버라이딩한 메서드 호출 가능
	((SubCircle)c).area(8);//[x]
	
	
	SubCircle sc=new SubCircle();
	sc.area(8);
	/*[1] rt,ta,c,sc 객체들을 지정할 배열을 생성하고 저장한 뒤
	 *	for 루프문을 돌리면서 area()호출해보기.20,30
	 *
	 * */
	Shape sh[] = {rt, ta, c, sc};
	for(int i=0; i<sh.length; i++) {
		if(i<2) {
			sh[i].area(20,30);
		}
		else if(i>=2) {
			((SubCircle)sh[i]).area(20);
		}
	}
 System.out.println("----------------");
 for( Shape shape : sh) {
	 if(shape instanceof SubCircle) {
		 ((SubCircle)shape).area(20);
	 }else 
	 shape.area(20, 30);
	 System.out.println("********");
	 
 }
	
	
}

}
