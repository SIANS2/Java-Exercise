package multicampus;

public class Company {
		String name;
		int since;
		String field;
		
		public Company() { 
			name="멀티 캠퍼스";
			since=2000;
			field="HRD전문기업";
		}
		
		public void setName(String name) {
			this.name=name;
			
		}
		public void setSince(int since) {
			this.since=since;
		}

		public void setField(String field) {
			this.field=field;
		}
		
		public String getName() {
			return name;
		}
		public int getSince() {
			return since;
		}
		public String getField() {
			return field;
		}
		
		public Company(String name,int since) {
			this.name=name;
			this.since=since;
			field="HRD전문기업";
		}
		public Company(String name,int since,String field) {
			this.name=name;
			this.since=since;
			this.field=field;
		}
		
		public void comInfo() {
			System.out.println("****회사 정보****");
			System.out.println("이름: "+name);
			System.out.println("설립년도: "+since+"년");
			System.out.println("분야: "+field);
		}
		public static void license() {
			System.out.println("관련자격증: ");
		}
		public static void introduce() {
			System.out.println("멀티캠퍼스는 기업교육 시장의 First Mover로서, 20여 년의 교육 노하우와 최신 IT기술로 업계의 Digital Transformation을 선도하며 비대면 시대의 새로운 HRD 생태계를 만들어 갑니다..");
		}

}
