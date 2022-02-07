package inheritance;
class SubTest1{
	String name,addr;
	
	public SubTest1() {
		
	}
	public SubTest1(String name, String addr) {
		this.name=name;
		this.addr=addr;
	}
	public void view() {
		System.out.println("�̸��� "+name+"�̰� ��� ���� "+addr+"�Դϴ�.");
	}
}
 class SubTest extends SubTest1 {
	int age;
	double score;
	
	public SubTest(String name, String addr,int age, double score) {
		super(name,addr);
		this.age=age;
		this.score=score;	
	}
		
	
	public String toString() {
		super.view();
		return "���̴� "+age+"���̰� ������ "+score+"���Դϴ�.";
	}
	public static void main(String[] args) {
		SuperTest ob1=new SuperTest("�Ƿη�","���ﵿ");
		
		// �̸��� �Ƿη��̰� ��� ���� ���ﵿ�Դϴ�.
		System.out.println(ob1); //--toString ����.
		System.out.println();
		SubTest ob2=new SubTest("ũ��","������",23,85.4);
		//�̸��� ũ���̰� ��� ���� �������Դϴ�.
		//���̴� 23���̰� ������ 85.4���Դϴ�.
		System.out.println(ob2);
	}

}
