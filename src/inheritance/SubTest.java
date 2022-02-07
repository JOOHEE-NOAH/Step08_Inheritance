package inheritance;

 class SubTest extends SuperTest {
	int age;
	double score;
	
	public SubTest(String name, String addr,int age, double score) {
		super(name,addr);
		this.age=age;
		this.score=score;	
	}
		
@Override	
	public String toString() {
		
		return super.toString()+"\n���̴� "+age+"���̰� ������ "+score+"���Դϴ�.";
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
