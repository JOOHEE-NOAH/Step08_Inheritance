package constructor;

public class Member {
	private String name="�Ƿη�";
	private int age=25;    //���� �Է��� �ϴ� ��쿡�� ��ü�� ���·� ���������� �ʴ´�
	
public Member() { //����Ʈ ������
		
	}

	public Member(String name, int age) { //�Ű������� �ϳ��� �ִ� �����ڰ� �����ϸ� ����Ʈ �����ڴ� �ڵ����� ����(Ȱ��ȭ)���� �ʴ´�.
		super();
		this.name = name;
		this.age = age;
	}
	public void view() {
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
	}
}
