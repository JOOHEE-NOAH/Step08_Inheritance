package inheritance;
//������


class ParentEx{//�θ�
	public ParentEx() {//����Ʈ ������
		super(); //object Ŭ�������� ��ӹ���
		System.out.println("parent class");//3.���
	}
}
class ChildEx extends ParentEx{// ParentEx�� ��ӹ޴´�.
	public ChildEx() {
		//�� ���̿� super(); ��������, ��� ���۵�. 2.���ۻ����� ȣ�� super();
		System.out.println("child class"); //4.ȣ���� ������ �ٽ� ���ƿͼ� ���
	}
}
public class InheritanceEx2 {

	public static void main(String[] args) {
		new ChildEx(); //--->1.��ü���� 5.ȣ���Ѱ����� �ǵ��ƿ��� ��
	}

}

/*this. ����
 * this.�޽���()
 * this()
 * thi(����,����,...) ---������(�ڱ� �ڽ��� ��ü�� ���� ������ ȣ��)
 *
 * super.����
 * super.�޼���)
 * super()
 * super(����,����,...) -----������(�θ� Ŭ������ ������ ȣ��)
 * 
 *this�� super�� ���� ��� ����
 * */
 