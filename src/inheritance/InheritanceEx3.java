package inheritance;
/// Branch, Leaf





//--------------------3=-----------------------------
class Branch {
	 public Branch() {
		 System.out.println("Branch default constructor"); //5.���
	 }
	 public Branch(String str) {
		 this(); //4. �ش� �����ڿ��� �Ű����� ���� ������ ȣ��
		 System.out.println(str+"Branch constructor");//6.���
	 }
}
class Leaf extends Branch {
	public Leaf() {
		super("���ٻ�");//3.�θ� �����ڿ��� �Ű����� �ϳ��� ������ ȣ��
		System.out.println("Leaf default constructor");//7.���
	}
	public Leaf(String str,int n) {	
	this();  //2. Leaf�������� �Ű����� ���� ����Ʈ ������ ȣ��
		System.out.println(str+ "" +n+" Leaf constructor");//8.���
	}
}
	
public class InheritanceEx3 {

	public static void main(String[] args) {
		new Leaf("������",10); //1: �Ű� ���� �ΰ�¥�� Leaf������ ȣ�� 9.
	}

}



//------------------------------2-------------------
//class Branch {
//	 public Branch() {
//		 System.out.println("Branch default constructor"); //4. 3���κ��� ȣ��Ǿ� ���
//	 }
//	 public Branch(String str) {
//		 this(); //3. �Ű����� ���� �� Ŭ���� ���� ������ ȣ��
//		 System.out.println(str+"Branch constructor");//5 ���
//	 }
//}
//class Leaf extends Branch {
//	public Leaf(String str) {	
//	super(str);  //2. �Ű����� �ϳ�¥�� �θ� Ŭ������ ������ ȣ��
//		System.out.println(str+" Leaf constructor");//6 ���
//	}
//}
//	
//public class InheritaneceEx3 {
//
//	public static void main(String[] args) {
//		new Leaf("hi~"); //1: �Ű� ���� �ϳ�¥�� ȣ�� 7.
//	}
//
//}


//------------------------1-----------------------------
//class Branch {
//	 public Branch() {
//		 System.out.println("Branch default constructor"); //4
//	 }
//	 public Branch(String str) {
//		 this(); //3
//		 System.out.println(str+"Branch constructor");//5
//	 }
//}
//class Leaf extends Branch {
//	public Leaf() {	
//	super("hi~");  //2
//		System.out.println("Leaf default constructor");//6
//	}
//}
//public class InheritaneceEx3 {
//
//	public static void main(String[] args) {
//		new Leaf(); //1,7
//	}
//
//}