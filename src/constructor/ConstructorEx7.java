package constructor;

public class ConstructorEx7 {

	public static void main(String[] args) {
		Member ob1=new Member("������", 22); 
		ob1.view();
		
		Member ob2=new Member(); // ����Ʈ �����ڸ� ����� ���� ������ �ڵ����� ����������ʰ� ������ ����. ���� ����Ʈ �����ڴ� �� ��������.
		ob2.view();
		
	}

}