package constructor;

public class ConstructorEx8 {

	public static void main(String[] args) {
		Book bk1=new Book(); //Book���� ����Ʈ ������ ��
		bk1.setTitle("�ڹ��� ����");
		bk1.setAuthor("���ڹ�");
		bk1.setPage(300);
		// �ڹ��� ������ ���ڴ� ���ڹ��̰� 300�������� �����Ǿ� ����
		System.out.println(bk1.toString());
		
		//�����ڿ� "jsp������ �����ϱ�", "��jp",200 ���� �� getter�� �̿��Ͽ� ���
		//å�̸� : jsp������ �����ϱ�
		//å���� : ��jp
		//������ : 200
		bk1=new Book("jsp������ �����ϱ�","��jp",2000);
		Book bk2=new Book("jsp������ �����ϱ�","��jp",200);
		
		System.out.println("å�̸� : "+bk2.getTitle());
		System.out.println("å�̸� : "+bk2.getAuthor());
		System.out.println("å�̸� : "+bk2.getPage());
		
	
	}

}
