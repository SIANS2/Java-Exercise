package multicampus;

public class Company {
		String name;
		int since;
		String field;
		
		public Company() { 
			name="��Ƽ ķ�۽�";
			since=2000;
			field="HRD�������";
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
			field="HRD�������";
		}
		public Company(String name,int since,String field) {
			this.name=name;
			this.since=since;
			this.field=field;
		}
		
		public void comInfo() {
			System.out.println("****ȸ�� ����****");
			System.out.println("�̸�: "+name);
			System.out.println("�����⵵: "+since+"��");
			System.out.println("�о�: "+field);
		}
		public static void license() {
			System.out.println("�����ڰ���: ");
		}
		public static void introduce() {
			System.out.println("��Ƽķ�۽��� ������� ������ First Mover�μ�, 20�� ���� ���� ���Ͽ�� �ֽ� IT����� ������ Digital Transformation�� �����ϸ� ���� �ô��� ���ο� HRD ���°踦 ����� ���ϴ�..");
		}

}
